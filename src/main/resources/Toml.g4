grammar Toml;

toml
  : toml_stat+
  ;

toml_stat
  : section NEWLINE
  | toml_assignment NEWLINE
  | comment NEWLINE
  | NEWLINE
  ;

section
  : '[' WORD ']'
  ;

comment
  : '#' ~(NEWLINE)*
  ;

toml_assignment
  : WORD '=' value_expr
  ;

value_expr
  : array
  | literal_expr
  ;

literal_expr
  : INT
  | '"' WORD (WORD)+? '"'
  ;

array
  : '[' value_expr ']'
  | literal_expr (',' literal_expr)+?
  ;

WS : [ \t]+ -> skip ;
INT : [0-9]+ ;
WORD : [a-zA-Z0-9_-]+ ;
NEWLINE : '\r'?'\n' ;
