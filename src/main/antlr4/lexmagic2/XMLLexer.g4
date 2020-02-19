lexer grammar XMLLexer ;

@header {
package xml_gen;
}

// 默认模式: 标签外
COMMENT : '<!--' .*? '-->' ;

CDATA : '<![CDATA[' .*? ']]>' ;

/**
* 包括所有的DTD,类似<!ENTITY ...>的实体定义以及记号声明<!NOTATION ...>
*/

DTD : '<!' .*? '>'   -> skip ;

EntityRef : '&' Name ';' ;

CharRef : '&#' DIGIT+ ';'
        |  '&#x' HEXDIGIT+ ';'
        ;

SEA_WS : (' ' | '\t' | 'r'? '\n')+ ;

OPEN : '<'          -> pushMode(INSIDE) ;

XMLDeclOpen : '<?xml' S -> pushMode(INSIDE) ;

// more 的作用,它命令词法分析器寻找下一个词法符号,下一个词法符号将包含当前的词法符号的文本
SPECIAL_OPEN : '<?' Name  -> more, pushMode(PROC_INSTR) ;

TEXT : ~[<&]+ ; // 匹配任意除<和&之外的16位字符

// 当处理PROC_INSTR规则中时,我们通过IGNORE规则,令词法分析器将所有的字符放在一起,知道发现处理指令的结束字符"?>"为止
mode PROC_INSTR ;
PI : '?>'   -> popMode ;  // 关闭<? .. ?>

IGNORE : . -> more ;

mode INSIDE ;
CLOSE : '>'  -> popMode ;

SPECIAL_CLOSE : '?>'    -> popMode ; // 关闭 <?xml ... ?>

SLASH_CLOSE :  '/>'     -> popMode ;

SLASH : '/' ;

EQUALS : '=' ;

STRING : '"' ~[<"]* '"'
        | '\'' ~[<']* '\''
        ;

Name : NameStartChar NameChar* ;

S : [ \t\r\n]  -> skip ;

fragment
HEXDIGIT : [a-fA-F0-9] ;

fragment
DIGIT : [0-9] ;

fragment
NameChar : NameStartChar
         | '-' | '.' | DIGIT
         | '\u00B7'
         | '\u0300'..'\u036F'
         | '\u203F'..'\u2040'
         ;

fragment
NameStartChar
            : [:a-zA-Z]
            | '\u2070'..'\u218F'
            | '\u2C00'..'\u2FEF'
            | '\u3001'..'\uD7FF'
            | '\uF900'..'\uFDCF'
            | '\uFDF0'..'\uFFFD'
            ;

