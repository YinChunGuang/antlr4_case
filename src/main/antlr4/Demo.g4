grammar Demo ;

//r : ID ('<' '<' | '>' '>' '>' | '>' '>') ;
r : ID ('<=' | '>' '=' | '>' | '<') ;

LE : '<=';

ID : [a-zA-Z]+ ;

//r : STRING ;
//
//STRING : '"' .* ?'"' ;
//STRING : '"' (ESC | .)*?'"' ;

//ESC : '\\"' | '\\\\' ;   // 可以是\" 或者是 \\这样的字符串  为什么ESC中的要写入"\\"" 而不是"\""?
                         // 因为antlr4会对该问题进行一次转义

//file : row row* ;
//
//row : Filed (',' Filed)* '\r'? '\n';
//
//Filed : ~[,\r\n]+ ;


//NL : [\r\n]+  -> skip ;
//NL : [\r\n]+  -> skip ;

//r : ENUM
//    | ID
//    ;
//
//// 显然,enum是匹配到了ENUM这个关键字中的位置
//ENUM : 'enum' ;
//
//ID : [a-z]+ ;

//r : ACTION3 ;
//
//ACTION1 : '{' (STRING | .)*? '}' ;
//
//ACTION2 : '[' (STRING | ~'"')*? ']' ;
//
//ACTION3 : '<' (STRING | ~[">])* '>' ;
//
//STRING : '"' ('\\"' | .)*? '"' ;

//r : .*? ('a' | 'ab') ;

//r : (STRING
//    | END)+
//   ;
//
//STRING : '<<' ~'\n'*? '>>' ; // 输入'<<foo>>>>'的匹配结果是STRING END
//
//END : '>>' ;


//
//INT : [0-9]+ ;
//
//DOT : '.' ;
//
//FLOAT : [0-9]+ '.' ;
//
//
//COMMENT : '/*' .*? '*/' -> skip  ; // .*? 匹配任意字符,知道遇到第一个*/为止




//str : LQUTOE ;
//
//LQUOTE : '"' -> more, mode(STR) ;
//
//WS : [ \t\n\r]+      -> skip ;
//
//mode STR ;
//
//STRING : '"' -> mode(DEFAULT_MODE) ; // 我们希望语法分析器看到的词法符合
//
//TEXT : .    -> more ;               // 收集更多的文本,以生成字符串



//r : ESC ;
//
//ESC : '\\' . ;
//
//
//r2 : COMMENT2 ;
////COMMENT : '#' ~[\r\n]* '\r'? '\n' ;
//COMMENT2 : '#' .*? '\r'? '\n' ;

//r : ACTION ;
//
//ACTION : '{' (ACTION | ~[{}])* '}'; // 看来词法规则必须是做递归的模式好一些
//
WS : [ \t\n\r]+      -> skip ;