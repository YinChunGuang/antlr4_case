grammar Demo ;

r : ACTION3 ;

ACTION1 : '{' (STRING | .)*? '}' ;

ACTION2 : '[' (STRING | ~'"')*? ']' ;

ACTION3 : '<' (STRING | ~[">])* '>' ;

STRING : '"' ('\\"' | .)*? '"' ;

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