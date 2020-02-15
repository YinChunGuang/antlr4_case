grammar Json;

@header{package json_gen;}

json: object
    | array
    ;

object
    : '{' pair (',' pair)* '}' # AnObject
    | '{' '}'                  # EmptyObject // 空对象
    ;
pair: STRING ':' value ;

array
    : '[' value (',' value)* ']'
    | '[' ']'
    ;

value
    : STRING    # String
    | NUMBER    # Atom
    | object    # ObjectValue    // 递归调用
    | array     # ArrayValue     // 递归调用
    | 'true'    # Atom           // 关键字
    | 'false'   # Atom           // 关键字
    | 'null'    # Atom
    ;

// 从编码的角度来看,这些词法分析器也是具有优先级的策略,这在以后做词法分析的时候也得要考虑的到
// 这些隐含的优先级的问题!!!

WS : [ \t\n\r]+      -> skip ;

STRING : '"' (ESC | ~["\\])* '"' ;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;

fragment UNICODE : 'u' HEX HEX HEX HEX  ;

fragment HEX : [0-9a-fA-F] ;


NUMBER
    : '-'? INT '.' INT EXP? // 1.45, 1.35e-9, 0.3, -4.5
    | '-'? INT EXP          // 1e10 -3e4
    | '-'? INT              // -3, 45
    ;

fragment INT : '0' | [1-9] [0-9]* ;

fragment EXP : [Ee] [+\-]? INT ;





