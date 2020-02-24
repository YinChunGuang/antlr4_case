grammar Simple ;

@header{
package simple_gen;
}

prog : classDef+ ;   // 匹配一个或者多个类定义

classDef
    : 'class' ID '{' member+ '}' // 一个具有若干个成员
        //{System.out.println("class " + $ID.text);}
    ;

member
    : 'int' ID ';' // 字段定义
        //{System.out.println("var " + $ID.text);}
    | 'int' f=ID '(' ID ')' '{' stat '}' // 方法定义
        //{System.out.println("method: " + $f.text);}
    ;

stat : expr ';' //{System.out.println("found expr: " + $text);}
     | ID '=' expr ';'
        //{System.out.println("found assign: " + $text);}
     ;

expr : INT
     | ID '(' INT ')'
     ;

INT : [0-9]+ ;

ID  : [a-zA-Z]+ ;

WS  : [ \t\r\n]+  -> skip ;