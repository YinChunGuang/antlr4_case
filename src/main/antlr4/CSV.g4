grammar CSV;

@header{package csv_gen;}

file: hdr row+ ;

hdr: row ;

row: field (',' field)* '\r'? '\n' ;

field
    : TEXT      # text
    | STRING    # string
    |           # empty
    ;

TEXT: ~[,\n\r"]+ ;

STRING: '"' ('""' | ~'"')* '"' ;  // 可以匹配里面有两个双引号的情况