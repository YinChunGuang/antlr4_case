grammar Call ;
@header{
package call_gen;
}

stat : fcall ';' ;

fcall
    : ID '(' expr ')'
    | ID '(' expr ')' ')' {notifyErrorListeners("Too many parentheses");}
    | ID '(' expr         {notifyErrorListeners("Missing closing ')' ");}
    ;

expr : '(' expr ')'
     | INT
     ;

ID : [a-zA-Z]+ ;

INT : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;