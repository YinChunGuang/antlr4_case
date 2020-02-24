parser grammar XMLParser ;

@header {
package xml_gen;
}

options { tokenVocab=XMLLexer; }

document : prolog? misc* element misc* EOF;


prolog : XMLDeclOpen attribute* SPECIAL_CLOSE ;

content : chardata?
        ((element | reference | CDATA | PI | COMMENT) chardata?)*
        ;

element : '<' Name attribute* '>' content '<' '/' Name '>'
        | '<' Name attribute* '/>'
        ;

reference : EntityRef | CharRef ;

attribute : Name '=' STRING ; // 我们的STRING就是规范里的AttValue

/*
* 其余所有的未标记的文本构成了文档中的字符数据
*/

chardata : TEXT | SEA_WS ;

misc : COMMENT | PI | SEA_WS ;




