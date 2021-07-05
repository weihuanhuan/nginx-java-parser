parser grammar NginxParser;

@parser::header {
    package com.github.odiszapc.nginxparser.antlr;
    import com.github.odiszapc.nginxparser.*;
}

options {
    tokenVocab=NginxLexer;
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
SEMI;

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
  Comment?
  LBRACE
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
  RBRACE
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
  id=IF { $ret.addValue(new NgxToken($id.text)); }
  if_body { $ret.getTokens().addAll($if_body.ret); }
  Comment?
  LBRACE
    (statement { $ret.addEntry($statement.ret); } )*
  RBRACE
  ;

if_body  returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  LPAREN
  Value  { $ret.add(new NgxToken($Value.text)); }
  (Value { $ret.add(new NgxToken($Value.text)); })?
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )?
  RPAREN
  ;

lua_block returns [NgxLuaBlock ret]
@init { $ret = new NgxLuaBlock(); }
  :
  id=INIT_WORKER_BY_LUA_BLOCK { $ret.addValue(new NgxToken($id.text)); }
  (res=lua_res { $ret.addValue(new NgxToken($res.text)); })*
  LBRACE
    ( body=lua_code { $ret.addEntry($body.ret); } )*
  RBRACE
  ;

lua_res returns [String ret]
@init { $ret = ""; }
 :
 (Value { $ret = $Value.text; }
  |
  r=regexp { $ret = $r.ret; }
 )
 ;

lua_code returns [NgxLuaCode ret]
@init { $ret = new NgxLuaCode(); }
 :
  line=lua_line { $ret.addValue($line.text); }
 ;

regexp returns [String ret]
@init { $ret = ""; }
:
(
  id=REG_DOT { $ret += $id.text; }
  | id=CARET { $ret += $id.text; }
  | Value { $ret += $Value.text; }
  | LPAREN r=regexp { $ret += "(".concat($r.ret).concat(")"); } RPAREN
)+;

locationBlockHeader returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  id=LOCATION { $ret.add(new NgxToken($id.text)); }
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
  id=REWRITE { $ret.addValue($id.text); }
  (Value { $ret.addValue($Value.text); } | regexp { $ret.addValue($regexp.ret); }) Value { $ret.addValue($Value.text); }
  (opt=(LAST | BREAK | REDIRECT | PERMANENT) { $ret.addValue($opt.text); })?
  ;

lua_line
     :
    CODE_LINE
     ;