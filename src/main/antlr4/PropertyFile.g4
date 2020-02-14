
grammar PropertyFile ;

@header{package propertyfile_gen;}

@parser::members {
void startFile() {System.out.println("begin");}
void finishFile() {System.out.println("after");}
void defineProperty(Token name, Token value) {
//    System.out.println("Id value is " + name.getText() + "  " + value.getText());
    System.out.println(name.getText() + "=" + value.getText());
}
}

file : {startFile();} prop+ {finishFile();} ;

prop : ID '=' STRING '\r'? '\n' {defineProperty($ID, $STRING);} ;

ID : [a-z]+ ;

STRING : '"' .*? '"' ;

fragment WhiteSpace
   : ' ' | '\t'
   ;

WS
   :  WhiteSpace+ -> skip
   ;