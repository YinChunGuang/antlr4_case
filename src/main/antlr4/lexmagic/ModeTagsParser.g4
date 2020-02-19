parser grammar ModeTagsParser ;

@header{
package modetags_gen;
}
options { tokenVocab=ModeTagsLexer; } // 使用ModeTagsLexer.g4中的词法符号

file : (tag | TEXT)* ;

tag : '<' ID '>'
    | '<' '/' ID '>'
    ;



