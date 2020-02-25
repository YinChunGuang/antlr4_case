grammar F ;

group
    : '[' expr ']' // expr规则引用的后续词法符号: {']'}
    | '(' expr ')' // expr 规则引用的后续词法符号: {')'}
    ;

expr : atom '^' INT ; // atom 规则引用的后续词法符号: {'^'}

atom : ID
    | INT
    ;

INT : [0-9]+ ;

ID : [a-zA-Z]+ ;

WS : [ \t\r\n]+ -> skip ;