grammar SamplePy ;

@header{package samplepy_gen;}

@lexer::members {

int nesting = 0 ;
}

file : stat+ EOF;

stat : assign NEWLINE
    | expr NEWLINE
    | NEWLINE       // 忽略换行
    ;

assign : ID '=' expr ;

expr : expr '+' expr
    | '(' expr ')'
    | call
    | list
    | ID
    | INT
    ;

call : ID '(' (expr (',' expr)*)? ')' ;

list : '[' expr (',' expr)* ']' ;

fragment DIGIT : [0-9] ;

INT : '0' | DIGIT+ ;

ID : [a-zA-Z_] [a-zA-Z_0-9]* ;



/* 注意:这里没有考虑Python的缩进的规则 */
WS : [ \t]+ -> skip ;

/* 匹配注释.这里不匹配换行符,因为我们需要将它送入到语法分析器 */
COMMENT
    : '#' ~[\r\n]* -> skip
    ;

/**
* 忽略反斜杠换行符序列.这条规则不允许注释跟在反斜杠后面,
    因为它后面必须是换行符
*/
LINE_ESCAPE
        : '\\' '\r'? '\n' -> skip
        ;

// 该词法分析器的优先规则位于之前
/* 嵌套在(..) 或者[..]中的换行符将被忽略 */
IGNORE_NEWLINE
    : '\r'? '\n' {nesting > 0}? -> skip
    ;

/* 终止语句的逻辑换行符 */
NEWLINE
       : '\r'? '\n'
       ;

LPAREN : '(' {nesting++;} ;

RPAREN : ')' {nesting--;} ;

LBRACK : '[' {nesting++;} ;

RBRACK : ']' {nesting--;} ;