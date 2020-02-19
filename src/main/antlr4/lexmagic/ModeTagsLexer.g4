lexer grammar ModeTagsLexer ;
@header{
package modetags_gen;
}
// 默认模式下的规则(海洋部分)
OPEN : '<'   -> mode(ISLAND) ;  // 切换到ISLAND模式

TEXT : ~'<'+ ;                  // 手机所有的文本

mode ISLAND ;

CLOSE : '>'     -> mode(DEFAULT_MODE) ; // 回到SEA模式, 正常模式

SLASH : '/' ;

ID : [a-zA-Z]+ ;                        // 匹配标签中的ID并将其输送给语法分析器


