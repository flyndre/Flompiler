grammar MiniJava;


//TODO: FIX THAT
NEW                             : 'new';
THIS                            : 'this';
WHILE                           : 'while';
IF                              : 'if';
ELSE                            : 'else';
DOT                             : '.';
RETURN                          : 'return';
CLASS                           : 'class';
BOOLEAN                         : 'true' | 'false';
INTTYPE                         : 'int';
STRINGTYPE                      : 'String';
BOOLEANTYPE                     : 'boolean';
CHARTYPE                        : 'char';
VOIDTYPE                        : 'void';
EQUALS                          : '=';
STRING                          : '"' ('\\' ["\\] | ~["\\\r\n])* '"';
CHAR                            : '\'' [a-zA-Z0-9] '\'';
JNULL                           : 'null';
EQUALSSTAT                      : '==';
OR                              : '||';
LESSTHAN                        : '<';
GREATERTHAN                     : '>';
INTEGER                         : [0-9]+;
COMMA                           : ',';
DECREMENT                       : '--';
INCREMENT                       : '++';
PLUS                            : '+';
MINUS                           : '-';
MUL                             : '*';
DIV                             : '/';
MOD                             : '%';

PUBLIC                          : 'public';
PRIVATE                         : 'private';
PROTECTED                       : 'protected';
NAME                            : [A-Za-z]+;
WAVEDBROPEN                     : '{';
WAVEDBRCLOSE                    : '}';
SEMICOLON                       : ';';
BROPEN                          : '(';
BRCLOSE                         : ')';
SEQUENCE                        : [a-zA-Z0-9];
TIMESEQUAL                      : '*=';
DIVIDEEQUAL                     : '/=';
PLUSEQUAL                       : '+=';
MINUSEQUAL                      : '-=';


program                         : classes;
classes                         : class classes| ;
class                           : accessMod CLASS NAME WAVEDBROPEN classbody WAVEDBRCLOSE;

accessMod                       : PUBLIC
                                | PRIVATE
                                | PROTECTED
                                |;

block                           : WAVEDBROPEN WAVEDBRCLOSE |
                                | WAVEDBROPEN statements WAVEDBRCLOSE;

type                            : BOOLEANTYPE
                                | STRINGTYPE
                                | CHARTYPE
                                | VOIDTYPE
                                | INTTYPE;

statements                      : statement statements
                                | ;

statement                       : returnstatement
                                | ifstatement
                                | ifelsestatement
                                | while
                                | intdeclaration
                                | stringdeclaration
                                | chardeclaration
                                | booldeclaration
                                | classdeclaration
                                | emptystatement
                                | expressionstatement;

ifstatement                     : IF BROPEN expression BRCLOSE statement SEMICOLON
                                | IF BROPEN expression BRCLOSE block
                                | IF BROPEN expression BRCLOSE
                                | IF BROPEN statementexpression BRCLOSE statement SEMICOLON
                                | IF BROPEN statementexpression BRCLOSE block
                                | IF BROPEN statementexpression BRCLOSE;

ifelsestatement                 : IF BROPEN expression BRCLOSE statement ELSE statement
                                | IF BROPEN statementexpression BRCLOSE statement ELSE statement
                                | IF BROPEN expression BRCLOSE block ELSE block
                                | IF BROPEN statementexpression BRCLOSE block ELSE block;

while                           : WHILE BROPEN expression BRCLOSE statement
                                | WHILE BROPEN expression BRCLOSE block
                                | WHILE BROPEN statementexpression BRCLOSE statement
                                | WHILE BROPEN statementexpression BRCLOSE block;

assignment                      :NAME assignmentoperator assignmentexpression;

assignmentexpression            : statementexpression | expression;

expression                      : BOOLEAN | INTEGER | STRING | CHAR | NAME | statementexpression | equalityexpression;

fieldaccess                     :  NAME DOT primary;

argumentlist                    : expression
		                        | argumentlist  COMMA  expression |
		                        ;

returnstatement                 : RETURN INTEGER SEMICOLON | RETURN STRING SEMICOLON | RETURN CHAR SEMICOLON |RETURN BOOLEAN SEMICOLON | RETURN expression SEMICOLON;

classbody                       : fielddeclaration classbody
                                | methoddeclaration classbody
                                | ;

statementexpression             : assignment
                                | preincrementexpression
                                | predecrementexpression
		                        | methodinvocation;

fielddeclaration                : booldeclaration
                                | stringFieldDecl
                                | charFieldDecl
                                | intFieldDecl;

parameter                       : accessMod BOOLEANTYPE NAME
                                | accessMod STRINGTYPE NAME
                                | accessMod CHARTYPE NAME
                                | accessMod INTTYPE NAME;

booldeclaration                 : accessMod BOOLEANTYPE NAME SEMICOLON
                                | accessMod BOOLEANTYPE NAME EQUALS BOOLEAN SEMICOLON;

stringdeclaration               : accessMod STRINGTYPE NAME SEMICOLON
                                | accessMod STRINGTYPE NAME EQUALS assignmentexpression SEMICOLON;

chardeclaration                 : accessMod CHARTYPE NAME SEMICOLON
                                | accessMod CHARTYPE NAME EQUALS assignmentexpression SEMICOLON;

intdeclaration                  : accessMod INTTYPE NAME SEMICOLON
                                | accessMod INTTYPE NAME EQUALS assignmentexpression SEMICOLON;

intFieldDecl                    : accessMod INTTYPE NAME EQUALS INTEGER SEMICOLON | accessMod INTTYPE NAME SEMICOLON;
stringFieldDecl                 : accessMod STRINGTYPE NAME EQUALS STRING SEMICOLON | accessMod STRINGTYPE NAME SEMICOLON;
charFieldDecl                   : accessMod CHARTYPE NAME EQUALS CHAR SEMICOLON | accessMod CHARTYPE NAME SEMICOLON;



classdeclaration                : accessMod NAME NAME SEMICOLON
                                | accessMod NAME NAME EQUALS classinstancecreationexpression SEMICOLON;

methoddeclaration               : accessMod  type NAME BROPEN parameters BRCLOSE block;

expressionstatement             : statementexpression  SEMICOLON;

parameters                      : parameter COMMA parameters | parameter | ;

literal		                    : INTEGER
		                        | BOOLEAN
		                        | CHAR
		                        | STRING
		                        | JNULL;

assignmentoperator              : EQUALS
		                        | TIMESEQUAL
		                        | DIVIDEEQUAL
		                        | PLUSEQUAL
		                        | MINUSEQUAL;

methodinvocation                : NAME BROPEN   BRCLOSE
		                        | NAME BROPEN argumentlist BRCLOSE
		                        | literal  DOT SEQUENCE BROPEN BRCLOSE
		                        | THIS  DOT NAME BROPEN argumentlist  BRCLOSE
		                        | BROPEN expression BRCLOSE DOT SEQUENCE BROPEN argumentlist  BRCLOSE
		                        | classinstancecreationexpression  DOT SEQUENCE BROPEN argumentlist  BRCLOSE
		                        | fieldaccess  DOT SEQUENCE BROPEN argumentlist  BRCLOSE
		                        | methodinvocation  DOT SEQUENCE BROPEN argumentlist  BRCLOSE;

classinstancecreationexpression : NEW classtype BROPEN   BRCLOSE
                                | NEW classtype BROPEN  argumentlist  BRCLOSE;

primary		                    : primarynonewarray;

primarynonewarray               : literal
		                        | THIS
		                        | BROPEN expression BRCLOSE
                                | classinstancecreationexpression
		                        | fieldaccess
		                        | methodinvocation;


equalityoperations              : EQUALSSTAT | OR | LESSTHAN | GREATERTHAN;

equalityexpression              : relationalexpression
		                        | equalityexpression equalityoperations relationalexpression;

relationalexpression            : shiftexpression;

shiftexpression	                : additiveexpression;

additiveexpression              : multiplicativeexpression
		                        | additiveexpression PLUS multiplicativeexpression
		                        | additiveexpression MINUS multiplicativeexpression;

multiplicativeexpression        : unaryexpression
		                        | multiplicativeexpression MUL unaryexpression
		                        | multiplicativeexpression DIV unaryexpression
		                        | multiplicativeexpression MOD unaryexpression;

unaryexpression	                : preincrementexpression
		                        | predecrementexpression
		                        | PLUS unaryexpression
		                        | MINUS unaryexpression
		                        | unaryexpressionnotplusminus;

preincrementexpression          : INCREMENT unaryexpression;

predecrementexpression          : DECREMENT unaryexpression;

unaryexpressionnotplusminus          : primary
                              		 | name;


emptystatement	                : SEMICOLON;

classtype                       : name;

simplename                      : NAME;

name                            : qualifiedname
                                | simplename;

qualifiedname                   : NAME DOT name ;


WS                              : [ \t\r\n]+ -> skip;

