grammar IDKeyword ;

prog : stat+ ;

stat : 'if' expr 'then' stat
    | 'call' id ';'
    | ';'
    ;

expr : id ;

id : 'call' | 'then' | ID ;

ID : [a-z]+ ;

WS : [ \r\n]+   -> skip ;

