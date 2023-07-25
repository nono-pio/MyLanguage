lexer grammar GrammarLexer;

// Comment
COMMENT:            '/*' .*? '*/'    -> skip;
LINE_COMMENT:       '//' ~[\r\n]*    -> skip;

// White space
WS : [ \t\r\n]+ -> skip ;

// Keyword
VAR: 'var';

IF: 'if';
ELSE: 'else';

FOR: 'for';
FOREACH: 'foreach';
WHILE: 'while';
DO: 'do';
BREAK: 'break';
CONTINUE: 'continue';

SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';

THROW: 'throw';
CATCH: 'catch';

DEF: 'def';
RETURN: 'return';

// Assign
ASSIGN: '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';
MOD_ASSIGN: '%=';
LSHIFT_ASSIGN: '<<=';
RSHIFT_ASSIGN: '>>=';

// Operator compare
GT: '>';
LT: '<';
NOT: '!';
EQUAL: '==';
LE: '<=';
GE: '>=';
NOTEQUAL: '!=';
AND: '&&';
OR: '||';

// Incremente
INC: '++';
DEC: '--';

// Arithmetic Operator
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';

// Bitwise Operator
BIT_NOT: '~';
BIT_AND: '&';
BIT_OR: '|';
BIT_XOR: '^';
BIT_SHIFTL: '<<';
BIT_SHIFTR: '>>';

// Symbole
OPEN: '(' ;
CLOSE: ')' ;
OPEN_BRACKET: '{' ;
CLOSE_BRACKET: '}' ;
OPEN_SQUARE: '[' ;
CLOSE_SQUARE: ']' ;
COLON: ':';
SEMI: ';';
COMMA: ',';
DOT: '.';

// Litterale
BOOLEAN: 'true' | 'false' ;
STRING: '"' [^"] '"' ;
CHAR: '\'' . '\'' ;
FLOAT: [0-9]* '.' [0-9]* ; // 0.1 .1 12.  . -> 0 float
INT: [0-9]+ ;

// Identifier
ID: [a-zA-Z_] [a-zA-Z0-9_]* ; // x0 _x d