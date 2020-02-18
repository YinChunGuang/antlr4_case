grammar Enum2 ;

@header {package enum2_gen;}

@lexer::members {

boolean java5 = false;
}

stat : ID '=' expr ';' {System.out.println($ID.text + "=" + $expr.text);} ;

expr : ID
    | INT
    ;

ENUM : 'enum' {java5}? ; // 必须放置在ID规则之前

ID :[a-zA-Z]+ ;

INT : '0' | DIGIT+ ;

fragment DIGIT : [0-9] ;

WS : [ \t\r\n]+  -> skip ;