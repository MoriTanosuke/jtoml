grammar Toml;

toml
  : toml_stat+
  ;

toml_stat
  : section NEWLINE
  | toml_assignment (comment)? NEWLINE
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
  | BOOLEAN
  | DATE
  | '"' WORD+ '"'
  ;

array
  : '[' value_expr+ ']'
  | literal_expr (',' literal_expr)+?
  ;

WS : [ \t]+ -> skip ;
INT : [0-9]+ ;
BOOLEAN: ('true'|'false') ;
WORD : [\.a-zA-Z0-9_\-&\\#\?\']+ ;
DATE: [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9]'T'[0-9][0-9]':'[0-9][0-9]':'[0-9][0-9]'Z' ;
NEWLINE : '\r'?'\n' ;
