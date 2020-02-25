# antlr4_case

expr规则任然是左递归的,传统的自顶向下的语法(例如ANTLR3)无法处理这样的规则.简单而言,ANTLR4将左递归替换成
一个(...)*,它会比较前一个和下一个运算符的优先级.熟悉这样的规则变换很重要,因为生成的代码反应的是转换后的规
则,而非原先的规则.更重要的的是,当一份语法没有按照我们的期望对运算符进行分组和结合的时候,我们需要知道原因.

术语: 优先级爬升(precedence climbing)

1. 直接左递归备选分支模式
ANTLR通过检查下列四种子表达式运算模式来认定一条规则为左递归规则.

二元 expr规则的某个备选分支符合 expr op expr或者 expr (op1|op2|op3..|opN) expr的形式
    op 是词法符号
    
下面的备选分支将比较运算符按照同一优先级处理
    expr: ...
        | expr ('<' '=' | '>' '=' | '>' | '<' ) expr 
        ...
        ;
op可以是对另外一条规则的应用
    expr : ...
        | expr compareOps expr 
        ....
        ;
    compareOps : ('<' '=' | '>' '=' | '>' | '<' ) ;
    
三元 expr的某个备选分支符合expr op1 expr op2 expr的形式. op1和op2必须是单词法符号的引用.
    典型的代表则是
    "?:" 运算法
    expr : ...
        | expr '?' expr : expr
        ...
        ;
一元前缀 expr的某条规则符合elements expr的形式. ANTLR4将任意元素的尾递归的规则引用作一元前缀模式.下面是
一个具有前缀运算符的备选分支:
    expr : ...
        | '(' type ')' expr 
        ...
        | ('+' | '-' | '++' | '--') expr 
        ...
        ;

一元后缀 expr的某个备选分支符合 expr elements形式.和前缀模式相同,ANTLR4将任意元素前的直接左递归规则
视作为一元后缀模式,前提是他不符合二元模式和三元模式.下面是两个具有后缀运算符的备选分支:
    expr : ...
        | expr '.' Identifier 
        ...
        | expr '.' 'super' '(' exprList? ')'
        ...
        ;
其他形式的备选分支都被作为主表达式(primary expression)元素处理,例如标识符或者整数,也包括类似的'(' expr ')'
的形式,因为它不符合上述四种模式的任意的一种.这是必要的,因为括号存在的意义是将其包含的表达式当做一个原子元素
处理.这样的"其他形式"备选分支可以以任意顺序出现.ANTLR能够正确地处理它们.除此之外的备选分支都是需要特别注意的.
下面是一些猪表达式备选分支实例:
    expr: ...
        | literal 
        | Identifier 
        | type '.' 'class' 
        ...
        ;
        
除非额外指定,ANTLR假设所有的运算符都是左结合的.话句话说,1+2+3会被分组为(1+2)+3.不过,某些运算符是右结合的,
例如赋值运算符和指数运算符.通过assoc选项,可以指定右结合性.
        expr : <assoc=right> expr '^' expr 
            ...
            | <assoc=right> expr '=' expr 
            ...
            ;
            

ANTLR的错误恢复机制基于Niklaus Wirth的早期著作[Algorithms + DataStrucres=Programs]的中心思想(以及Rodney Topor的[A Note on
Error Recovery in Recursive Descent Parsers]),同时也包含JOsef Grosch在他的CoCo语法分析器生成器中的优秀思想[Efficient and 
Comfortable Error Recovery in Recursive Descent Parsers].

下面是ANTLR将这些思想柔和在一起实现的细节: 必要情况下,语法分析器在遇到无法匹配的词法符号的错误的时候,执行单词法符合不全和单词方法符号
移除.如果这些方案不奏效,语法分析器将向后查找词法符号,知道它遇到一个符合当前规则的后续部分合理词法符号为止,接着语法分析器将会继续语法分析
过程,仿佛什么事情 都没有发生一样.在本节中,我们将会看到上述术语的含义,并探究ANTLR是如何在错综复杂的情况下从错误中恢复.下面让我们首先分析
ANTLR使用的基本错误恢复策略.

# 1. 通过扫描后续词法符合来恢复 checked

# 2. 从不匹配的词法符号中恢复   checked

# 3. 从子规则的错误中恢复       checked

# 4. 捕获失败的语义判定         checked 

# 5. 错误恢复机制的防护措施


