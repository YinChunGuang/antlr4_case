grammar CSV;

@header{package csv_gen;}

file: hdr row+ ;

hdr: row ;

row: field (',' field)* '\r'? '\n' ;

field:
    | TEXT
    | STRING
    ;

TEXT: ~[,\n\r"]+ ;

STRING: '"' ('""' | ~'"')* '"' ;