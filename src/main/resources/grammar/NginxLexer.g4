lexer grammar NginxLexer;

@lexer::header {
    package com.github.odiszapc.nginxparser.antlr;
}

//QUOTED_STRING
//: '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';

LOCATION: 'location';
REWRITE: 'rewrite';
LAST: 'last';
BREAK : 'break';
REDIRECT : 'redirect';
PERMANENT : 'permanent';
IF : 'if';
INIT_WORKER_BY_LUA_BLOCK : 'init_worker_by_lua_block' -> pushMode(LUA_MODE);

Value: STR_EXT | QUOTED_STRING | SINGLE_QUOTED
;

STR_EXT
  :
  ([a-zA-Z0-9_/\.,\-:=~+!?$&^*\[\]@|#] | NON_ASCII)+;

Comment
    :
    '#' ~[\r\n]*;

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

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
SEMI : ';';
CARET : '^';
REG_DOT : '\\.';

mode LUA_MODE;
CODE_LINE:  .+?;
