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
                        //		| postincrementexpression
                        //		| postdecrementexpression
		                        | methodinvocation;

fielddeclaration                : booldeclaration
                                | stringdeclaration
                                | chardeclaration
                                | intdeclaration;
                             //TODO NEW KANN HIER NICHT GEHANDELT WERDEN DA STRING ALS VALUE :(

parameter                       : accessMod BOOLEANTYPE NAME
                                | accessMod STRINGTYPE NAME
                                | accessMod CHARTYPE NAME
                                | accessMod INTTYPE NAME;

booldeclaration                 : accessMod BOOLEANTYPE NAME SEMICOLON
                                | accessMod BOOLEANTYPE NAME EQUALS BOOLEAN SEMICOLON;

stringdeclaration               : accessMod STRINGTYPE NAME SEMICOLON
                                | accessMod STRINGTYPE NAME EQUALS STRING SEMICOLON
                                | accessMod STRINGTYPE NAME EQUALS assignmentexpression SEMICOLON;

chardeclaration                 : accessMod CHARTYPE NAME SEMICOLON
                                | accessMod CHARTYPE NAME EQUALS CHAR SEMICOLON
                                | accessMod STRINGTYPE NAME EQUALS assignmentexpression SEMICOLON;

intFieldDecl                    : accessMod INTTYPE NAME EQUALS INTEGER SEMICOLON;
stringFieldDecl                 : accessMod STRINGTYPE NAME EQUALS STRING SEMICOLON;
charFieldDecl                   : accessMod CHARTYPE NAME EQUALS CHAR SEMICOLON;

intdeclaration                  : accessMod INTTYPE NAME SEMICOLON
                                | accessMod INTTYPE NAME EQUALS INTEGER SEMICOLON
                                | accessMod INTTYPE NAME EQUALS assignmentexpression SEMICOLON;

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


//TODO: FIX THAT 1+1 CANNOT BE USED IN IF
equalityexpression              : relationalexpression
		                        | equalityexpression EQUALSSTAT relationalexpression;

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
                              	  // | unaryexpression INCREMENT
                              	  // | unaryexpression DECREMENT;


emptystatement	                : SEMICOLON;

classtype                       : name;

simplename                      : NAME;

name                            : qualifiedname
                                | simplename;

qualifiedname                   : NAME DOT name ;


WS                              : [ \t\r\n]+ -> skip;


/*
DOT : '.';
CLASS : 'class';
IDENTIFIER : [A-Za-z]+;
LBRACKET : '{';
RBRACKET : '}';
PUBLIC : 'public';
PROTECTED : 'protected';
PRIVATE : 'private';
STATIC : 'static';
ABSTRACT : 'abstract';
SEMICOLON : ';';
LBRACE : '(';
RBRACE : ')';
COMMA : ',';
THIS : 'this';
ASSIGN : '=';
MOD : '%';
DIV : '/';
MUL : '*';
INSTANCEOF  : '.instanceOf';
GREATEREQUAL : '>=';
LESSEQUAL : '<=';
GREATER : '>';
LESS : '<';
NOTEQUAL : '!=';
EQUAL : '==';
AND : '&&';
JNULL : 'null';
STRINGLITERAL : '"' [A-Za-z]+ '"';
CHARLITERAL : [A-Za-z];
BOOLLITERAL : 'True' | 'False';
INTLITERAL : [0-9]+;
EXCLMARK : '!';
TILDE : '~';
OR : 'or';
MINUS : '-';
PLUS : '+';
NEW : 'new';
DECREMENT : '--';
INCREMENT : '++';
OREQUAL : '|=';
CHAR : 'char';
INT : 'int';
ELSE : 'else';
IF : 'if';
WHILE : 'while';
RETURN : 'return';
COLON : 'asdk';
QUESMARK : '?';
LOGICALOR : 'asdy';
TIMESEQUAL : '*=';
DIVIDEEQUAL : '/=';
MODULOEQUAL : '%=';
PLUSEQUAL : '+=';
MINUSEQUAL : '-=';e
SHIFTLEFTEQUAL : 'asd';
SIGNEDSHIFTRIGHTEQUAL : '<<';
UNSIGNEDSHIFTRIGHTEQUAL : '>>';
ANDEQUAL : 'asd';
XOREQUAL : 'yxc';

compilationunit  : typedeclarations;

typedeclarations : typedeclaration
		 | typedeclarations typedeclaration;

name             : qualifiedname | simplename;

typedeclaration  : classdeclaration;

qualifiedname    : name  DOT IDENTIFIER;

simplename       : IDENTIFIER;

classdeclaration : CLASS IDENTIFIER classbody | modifiers CLASS IDENTIFIER classbody;

classbody        : LBRACKET RBRACKET | LBRACKET classbodydeclarations  RBRACKET;

modifiers        : modifier | modifiers modifier;

classbodydeclarations :  classbodydeclaration | classbodydeclarations classbodydeclaration;

modifier         : PUBLIC
		         | PROTECTED
                 | PRIVATE
                 | STATIC
                 | ABSTRACT;

classtype        : classorinterfacetype;

classbodydeclaration : classmemberdeclaration | constructordeclaration;

classorinterfacetype : name;

classmemberdeclaration : fielddeclaration | methoddeclaration;

constructordeclaration : constructordeclarator constructorbody
		 |  modifiers constructordeclarator constructorbody;

fielddeclaration : type variabledeclarators  SEMICOLON
 		 | modifiers type variabledeclarators  SEMICOLON;

methoddeclaration : methodheader methodbody;

block            : LBRACKET   RBRACKET
		 | LBRACKET  blockstatements  RBRACKET;

constructordeclarator :  simplename LBRACE  RBRACE
		 |  simplename LBRACE formalparameterlist RBRACE;

constructorbody	 : LBRACKET RBRACKET
		 | LBRACKET explicitconstructorinvocation  RBRACKET
		 | LBRACKET blockstatements  RBRACKET
		 | LBRACKET explicitconstructorinvocation blockstatements RBRACKET;

methodheader	 : type methoddeclarator
		 | modifiers type methoddeclarator
		 | VOID methoddeclarator
		 | modifiers VOID methoddeclarator;

type            : primitivetype
		 | referencetype;

variabledeclarators : variabledeclarator
		 | variabledeclarators  COMMA  variabledeclarator;

methodbody       : block
		 | SEMICOLON;

blockstatements  : blockstatement
		 | blockstatements blockstatement;

formalparameterlist : formalparameter
		 | formalparameterlist  COMMA  formalparameter;

explicitconstructorinvocation : THIS LBRACE  RBRACE   SEMICOLON
		 | THIS LBRACE argumentlist  RBRACE   SEMICOLON;

classtypelist    : classtype
		 | classtypelist  COMMA  classtype;

methoddeclarator : IDENTIFIER LBRACE  RBRACE
		 | IDENTIFIER LBRACE formalparameterlist  RBRACE;

primitivetype    : BOOLEAN
		 | numerictype;

referencetype    : classorinterfacetype;


variabledeclarator : variabledeclaratorid
		 | variabledeclaratorid ASSIGN variableinitializer;

blockstatement	 : localvariabledeclarationstatement
		 | statement;

formalparameter  : type variabledeclaratorid;

argumentlist     : expression
		 | argumentlist  COMMA  expression;

numerictype      : integraltype;

variabledeclaratorid : IDENTIFIER;

variableinitializer  : expression;

localvariabledeclarationstatement : localvariabledeclaration  SEMICOLON;

statement        : statementwithouttrailingsubstatement
		 | ifthenstatement
		 | ifthenelsestatement
		 | whilestatement;


expression       : assignmentexpression;
integraltype     : INT
                 | CHAR;

localvariabledeclaration : type variabledeclarators;

statementwithouttrailingsubstatement : block
		 | emptystatement
		 | expressionstatement
		 | returnstatement;

ifthenstatement  : IF LBRACE expression  RBRACE  statement;

ifthenelsestatement : IF LBRACE expression  RBRACE statementnoshortif ELSE statement;

whilestatement   : WHILE LBRACE expression  RBRACE  statement;

assignmentexpression : conditionalexpression
		 |  assignment;

emptystatement	 :  SEMICOLON;

expressionstatement : statementexpression  SEMICOLON;

returnstatement  : RETURN  SEMICOLON
		 | RETURN expression  SEMICOLON;

statementnoshortif : statementwithouttrailingsubstatement
		 | ifthenelsestatementnoshortif
		 | whilestatementnoshortif;

conditionalexpression : conditionalorexpression
		 | conditionalorexpression QUESMARK expression  COLON  conditionalexpression;

assignment       :lefthandside assignmentoperator assignmentexpression;


statementexpression : assignment
		 | preincrementexpression
		 | predecrementexpression
		 | postincrementexpression
		 | postdecrementexpression
		 | methodinvocation
		 | classinstancecreationexpression;

ifthenelsestatementnoshortif :IF LBRACE expression  RBRACE  statementnoshortif
			      ELSE statementnoshortif;

whilestatementnoshortif : WHILE LBRACE expression  RBRACE  statementnoshortif;

conditionalorexpression : conditionalandexpression
		 | conditionalorexpression LOGICALOR conditionalandexpression;

lefthandside     : name;

assignmentoperator : ASSIGN
		 | TIMESEQUAL
		 | DIVIDEEQUAL
		 | MODULOEQUAL
		 | PLUSEQUAL
		 | MINUSEQUAL
		 | SHIFTLEFTEQUAL
		 | SIGNEDSHIFTRIGHTEQUAL
		 | UNSIGNEDSHIFTRIGHTEQUAL
		 | ANDEQUAL
		 | XOREQUAL
		 | OREQUAL;

preincrementexpression : INCREMENT unaryexpression;

predecrementexpression : DECREMENT unaryexpression;

postincrementexpression : postfixexpression INCREMENT;

postdecrementexpression : postfixexpression DECREMENT;

methodinvocation : name LBRACE   RBRACE
		 | name LBRACE argumentlist RBRACE
		 | primary  DOT IDENTIFIER LBRACE RBRACE
		 | primary  DOT IDENTIFIER LBRACE argumentlist  RBRACE;

classinstancecreationexpression : NEW classtype LBRACE   RBRACE
                 | NEW classtype LBRACE  argumentlist  RBRACE;

conditionalandexpression : inclusiveorexpression;

fieldaccess      : primary  DOT IDENTIFIER;

unaryexpression	 : preincrementexpression
		 | predecrementexpression
		 | PLUS unaryexpression
		 | MINUS unaryexpression
		 | unaryexpressionnotplusminus;

postfixexpression : primary
		 | name
		 | postincrementexpression
		 | postdecrementexpression;
primary		 : primarynonewarray;

inclusiveorexpression : exclusiveorexpression
		 | inclusiveorexpression OR exclusiveorexpression;

primarynonewarray : literal
		 | THIS
		 | LBRACE expression RBRACE
                 | classinstancecreationexpression
		 | fieldaccess
		 | methodinvocation;

unaryexpressionnotplusminus : postfixexpression
	         | TILDE unaryexpression
		 | EXCLMARK unaryexpression
		 | castexpression;

exclusiveorexpression : andexpression
		 | exclusiveorexpression XOR andexpression;

literal		 : INTLITERAL
		 | BOOLLITERAL
		 | CHARLITERAL
		 | STRINGLITERAL
		 | JNULL;

castexpression	 : LBRACE  primitivetype  RBRACE  unaryexpression
 		 | LBRACE  expression  RBRACE  unaryexpressionnotplusminus;

andexpression    : equalityexpression
		 | andexpression AND equalityexpression;

equalityexpression : relationalexpression
		 | equalityexpression EQUAL relationalexpression
		 | equalityexpression NOTEQUAL relationalexpression;

relationalexpression : shiftexpression
		 | relationalexpression LESS shiftexpression
		 | relationalexpression GREATER shiftexpression
		 | relationalexpression LESSEQUAL shiftexpression
		 | relationalexpression GREATEREQUAL shiftexpression
		 | relationalexpression INSTANCEOF referencetype;

shiftexpression	 : additiveexpression;

additiveexpression : multiplicativeexpression
		 | additiveexpression PLUS multiplicativeexpression
		 | additiveexpression MINUS multiplicativeexpression;

multiplicativeexpression : unaryexpression
		 | multiplicativeexpression MUL unaryexpression
		 | multiplicativeexpression DIV unaryexpression
		 | multiplicativeexpression MOD unaryexpression;

*/