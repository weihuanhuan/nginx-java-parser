grammar Nginx;

@parser::header {
/**
 * Here you can add header information to the generated source file.
 */

package com.github.odiszapc.nginxparser.antlr;
import com.github.odiszapc.nginxparser.*;
}

@lexer::header {
/**
 * The order of Comment token affects parsing
 */

package com.github.odiszapc.nginxparser.antlr;
}

options {
  superClass = NginxBaseParser;
}

config returns [NgxConfig ret]
@init { $ret = new NgxConfig(); }
  :
  (
    statement { $ret.addEntry($statement.ret); }
    | block   { $ret.addEntry($block.ret); }
    | Comment { $ret.addEntry(new NgxComment($Comment.text)); }
  )+
  ;

statement returns [NgxParam ret]
:
(
  rewriteStatement { $ret = $rewriteStatement.ret; }
  |
  genericStatement { $ret = $genericStatement.ret; }
  |
  regexHeaderStatement { $ret = $regexHeaderStatement.ret; }
)
';';

genericStatement returns [NgxParam ret]
@init { $ret = new NgxParam(); }
  :
  Value  { $ret.addValue($Value.text); }
  (
    Value { $ret.addValue($Value.text); }
    |
    r=regexp { $ret.addValue($r.ret); }
  )*
  ;

regexHeaderStatement returns [NgxParam ret]
@init { $ret = new NgxParam(); }
  :
  // Use token definition for regexp-driven parameter name in Nginx config
  // See: http://nginx.org/en/docs/http/ngx_http_map_module.html
  REGEXP_PREFIXED { $ret.addValue($REGEXP_PREFIXED.text); }
  Value  { $ret.addValue($Value.text); }
  ;

block returns [NgxBlock ret]
@init { $ret = new NgxBlock(); }
  :
  (
    locationBlockHeader { $ret.getTokens().addAll($locationBlockHeader.ret); }
    |
    genericBlockHeader  { $ret.getTokens().addAll($genericBlockHeader.ret); }
  )
  (Comment { $ret.addEntry(new NgxComment($Comment.text)); })*
  '{'
  (
    statement { $ret.addEntry($statement.ret); }
    |
    b=block { $ret.addEntry($b.ret); }
    |
    if_statement { $ret.addEntry($if_statement.ret); }
    |
    lua_block { $ret.addEntry($lua_block.ret); }
    |
    Comment { $ret.addEntry(new NgxComment($Comment.text)); }
  )*
  '}'
  ;

genericBlockHeader returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  Value { $ret.add(new NgxToken($Value.text)); }
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )*;

if_statement returns [NgxIfBlock ret]
@init { $ret = new NgxIfBlock(); }
  :
  id='if' { $ret.addValue(new NgxToken($id.text)); }
  if_body { $ret.getTokens().addAll($if_body.ret); }
  (Comment { $ret.addEntry(new NgxComment($Comment.text)); })*
  '{'
     (
       Comment { $ret.addEntry(new NgxComment($Comment.text)); }
       |
       statement { $ret.addEntry($statement.ret); }
     )*
  '}'
  ;

if_body  returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  '('
  Value  { $ret.add(new NgxToken($Value.text)); }
  (Value { $ret.add(new NgxToken($Value.text)); })?
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )?
  ')'
  ;

lua_block returns [NgxLuaBlock ret]
@init { $ret = new NgxLuaBlock(); }
  :
  id=LuaBlockID_Regex { $ret.addValue(new NgxToken($id.text)); }
  (res=lua_res { $ret.addValue(new NgxToken($res.text)); })?
  (Comment { $ret.addEntry(new NgxComment($Comment.text)); })*
  '{'
    (code=lua_code { $ret.addEntry($code.ret); })?
  '}'
  ;

lua_res returns [String ret]
@init { $ret = ""; }
 :
 (Value { $ret = $Value.text; }
  |
  r=regexp { $ret = $r.ret; }
 )+
 ;

lua_code returns [NgxLuaCode ret]
@init { $ret = new NgxLuaCode(); }
@after { $ret.addValue(getFullContext($content.text)); }
 :
  content=lua_content
 ;

lua_content: .+? ;

regexp returns [String ret]
@init { $ret = ""; }
:
(
  id='\\.' { $ret += $id.text; }
  | id='^' { $ret += $id.text; }
  | Value { $ret += $Value.text; }
  | '(' r=regexp { $ret += "(".concat($r.ret).concat(")"); } ')'
)+;

locationBlockHeader returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  id='location' { $ret.add(new NgxToken($id.text)); }
  (Value { $ret.add(new NgxToken($Value.text)); })?
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )
;

rewriteStatement returns [NgxParam ret]
@init { $ret = new NgxParam(); }
  :
  id='rewrite' { $ret.addValue($id.text); }
  (Value { $ret.addValue($Value.text); } | regexp { $ret.addValue($regexp.ret); }) Value { $ret.addValue($Value.text); }
  (opt=('last' | 'break' | 'redirect' | 'permanent') { $ret.addValue($opt.text); })?
  ;

//QUOTED_STRING
//: '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';

LuaBlockID_Regex
    :
    Lua_Block_Regex Lua_Block_Suffix
    ;

fragment Lua_Block_Regex : [a-zA-Z0-9_]+;

fragment Lua_Block_Suffix : '_by_lua_block';

Comment
    :
    '#' ~[\r\n]*;

Value: STR_EXT | QUOTED_STRING | SINGLE_QUOTED
;

STR_EXT
  :
  ([a-zA-Z0-9_/\.,\-:=~+!?$&^*\[\]@|#] | NON_ASCII)+;

REGEXP_PREFIXED
  : (RegexpPrefix)[a-zA-Z0-9_/\.,\-:=~+!?$&^*\[\]@|#)(]+
  ;

QUOTED_STRING
  :
  '"' StringCharacters? '"'
  ;

fragment RegexpPrefix : [~][*]?;

fragment StringCharacters : (~["\\] | EscapeSequence)+;

fragment NON_ASCII :  '\u0080'..'\uFFFF';

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]?
    ;

SINGLE_QUOTED
:
'\'' ~['\\]* '\'';

WS
:
[ \t\n\r]+ ->  channel(HIDDEN) ;