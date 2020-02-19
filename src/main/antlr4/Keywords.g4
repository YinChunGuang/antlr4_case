grammar Keywords ;

@parser::header{
package keywords_gen;
}

@lexer::header { // 只在词法分析器中放置这个header,在语法分析器中不放置它
package keywords_gen;
import java.util.*;
}

@lexer::members {
    Map<String, Integer> keywords = new HashMap<String, Integer>(){
        {
            // 中文测试
            put("begin", KeywordsParser.BEGIN);
            put("end", KeywordsParser.END);
            put("if", KeywordsParser.IF);
            put("then", KeywordsParser.THEN);
            put("while", KeywordsParser.WHILE);
        }
    };

}

tokens { BEGIN, END, IF, THEN, WHILE }

stat : BEGIN stat* END
    | IF expr THEN stat
    | WHILE expr stat
    | ID '=' expr ';'
    ;
expr : INT | CHAR ;

ID : [a-zA-Z_]+ {
    if (keywords.containsKey(getText())) {
        setType(keywords.get(getText())); // 重置词法符号类型
    }
} ;

CHAR : '\'' . '\''  {
    setText(String.valueOf(getText().charAt(1)));
}  ;

INT : '0' | DIGIT+ ;

fragment DIGIT : [0-9] ;

WS : [ \t\r\n]+ -> skip ;