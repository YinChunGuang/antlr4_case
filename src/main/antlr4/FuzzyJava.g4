grammar FuzzyJava ;

@header{package fuzzyjava_gen;}

/** 匹配contant规则匹配到的结果之间的任意的文本 */
file : .*? (constant .*?)+ ;

// 另外一种匹配的规则
altfile: (constant | .)* ; // 匹配一个常量或者任意的词法符号的0次或者多次

// 匹配类似 "public static final SIZE的文本"

constant
    : 'public' 'static' 'final' 'int' Identifier {
        System.out.println("constant: " + $Identifier.text);
    }
    ;
Identifier : [a-zA-Z_$] [a-zA-Z_$0-9]* ; // 简化标识符

OTHER : . -> skip ; // 其他的字符我们不需要再去匹配了, 比如, " = == 等等

