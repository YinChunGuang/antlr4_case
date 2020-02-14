grammar Expr ;

@header{package expr_gen;}

/** 起始规则, 语法分析的起点 */
prog : stat+ ;

stat: expr NEWLINE              # Expr_NewLine
    | ID '=' expr NEWLINE       # Assignment
    | NEWLINE                   # NewLine
    ;



expr : expr Mult_Div=('*' | '/') expr       # Mult_Div     // MULT 是 '*'
      | expr ADD_Sub=('+' | '-')  expr      # ADD_Sub       // ADD 是 '+'
      | '(' expr ')'                        # Parent
      | INT                                 # Int
      | ID                                  # Id
      ;

ID : [a-zA-Z]+ ;

INT : [0-9]+ ;

NEWLINE : '\r'? '\n' ;          // 告诉词法分析器一个新行的开始(即语句终止的标志)

WS : [ \t]+     -> skip ;       // 丢弃空白字符

