grammar R ;

@header{package r_gen;}

prog: (expr_or_assign (';' | NL)
    | NL
    )*
    EOF
    ;
expr_or_assign
    : expr ('<-' | '=' | '<<-' ) expr_or_assign
    | expr
    ;


expr : expr '[[' sublist ']' ']' // '[[' 源于R语言的yacc语法
    | expr '[' sublist ']'
    | expr ('::' | ':::' ) expr
    | <assoc=right> expr '^' expr
    | ('-' | '+') expr
    | expr ':' expr
//    | expr USER_OP expr         // 任意被%包围的文本: '%' .* '%'
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | expr ('>' | '>=' | '<' | '<=' | '==' | '!=') expr
    | '!' expr
    | 'return' expr
    | expr ('&' | '&&') expr
    | expr ('|' | '||') expr
    | '~' expr
    | expr '~' expr
    | expr ('->' | '->>' | ':=') expr
    | 'function' '(' formlist? ')' expr // 定义函数
    | expr '(' sublist ')'         // 函数调用
    | '(' expr ')'
    | '{' exprlist '}'
    | ID
    | STRING
    | INT
    ;
exprlist : expr_or_assign* ;
formlist : form (',' form)* ;

form: ID
    | ID '=' expr
    | '...'
    ;

sublist : sub (',' sub)* ;

sub : expr
    | ID '='
    | ID '=' expr
    | STRING '='
    | STRING '=' expr
    | 'NULL' '='
    | 'NULL' '=' expr
    | '...'
    ;

ID : '.' (LETTER | '_' | '.') (LETTER | DIGIT | '_' | '.')*
    | LETTER (LETTER | DIGIT | '_' | '.')*
    ;

INT : '0' | DIGIT+ ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;

STRING : '"' .*? '"' ;

NL : '\r'? '\n' ;

fragment WhiteSpace
   : ' ' | '\t'
   ;

WS
   :  WhiteSpace+ -> skip
   ;




