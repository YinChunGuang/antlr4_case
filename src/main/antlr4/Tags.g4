grammar Tags ;

file : (TAG | ENTITY | TEXT | CDATA)* ;

COMMENT : '<!--' .*? '-->' -> skip ;

CDATA : '<![CDATA[' .*? ']]>' ;

TAG : '<' .*? '>' ; // 必须放在其他类似标签结构之后

ENTITY : '&' .*? ';' ;

TEXT : ~[<&]+ ; // 除<和 &之外的任意字符序列

