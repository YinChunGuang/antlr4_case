grammar Ambig ;
@header{
package ambig_gen;
}

stat : expr ';' // 表达式语句
    | ID '(' ')' ';'
    ;

expr : ID '(' ')'
    | INT
    ;

INT : [0-9]+ ;

ID : [a-zA-Z]+ ;

WS : [ \t\r\n]+  -> skip ;