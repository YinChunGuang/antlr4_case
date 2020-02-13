grammar Cymbol ;

@header{package cymbol_gen;}

file : (functionDecl | varDecl)+ ;

varDecl
       : type ID ('=' expr)? ';'
       ;

type : 'float' | 'int' | 'void' ; // 用户自定义类型

functionDecl
    : type ID '(' formalParameters? ')' block  // "void f(int x) {}"
    ;

formalParameters
    : formalParameter (',' formalParameter)*
    ;

formalParameter : type ID ;

block : '{' stat* '}' ; // 语句由语句块组成,可以为空

stat : block
    | varDecl
    | 'if' expr 'then' stat ('else' stat)?
    | 'return' expr? ';'
    | expr '=' expr ';' // 赋值
    | expr ';'          // 函数赋值
    ;

expr : ID '(' exprList? ')' // 类似于f(), f(x), f(1,2)的函数调用表达式
    | expr '[' expr ']'    // 类似于a[i], a[i][j]的数组索引表达式
    | '-' expr              // 一元取反表达式
    | '!' expr              // 布尔表达式
    | expr '*' expr
    | expr ('+' | '-' ) expr
    | expr '==' expr        // 等同性表达式(它是优先级最低的运算符)
    | ID                    // 变量引用
    | INT
    | '(' expr ')'
    ;

exprList : expr (',' expr)* ; // 参数列表


ID : LETTER (LETTER | DIGIT)* ;

INT : '0' | NONDIGIT DIGIT* ;

LETTER :[a-zA-Z\u0080-\u00FF_] ;

fragment
DIGIT : [0-9] ;

fragment
NONDIGIT : [1-9] ;

fragment WhiteSpace
   : '\u0020' | '\u0009' | '\u000D' | '\u000A'
   ;

WS
   :  WhiteSpace+ -> skip
   ;


COMMENT
   :   '/*' .*? '*/' -> skip
   ;


LINE_COMMENT
   :   '//' (~[\r\n])* -> skip
   ;