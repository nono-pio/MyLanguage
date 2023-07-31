parser grammar GrammarParser;

options { tokenVocab=GrammarLexer; }

program: line*;

// Lines
block: '{' line* '}';
// line: ref
line:
      one_line
    | if
    | switch
    | definition
    | while
    | do
    | for
    | foreach
    ;

// one_line : child[0] ref child[1] ';'
one_line:
    ( expr
    | keyword
    | return
    | var_ass
    | var_init
    | var_inc_dec
    | var_assOp
    ) ';'
    ;

keyword:
      'break'
    | 'continue'
    ;

// type
type: ID;

// expr
primary:
      INT #int
    | FLOAT #float
    | CHAR #char
    | STRING #string
    | BOOLEAN #boolean
    ;
expr:
      primary #primaryExpr
    | ID #idExpr
    | call #callExpr
    | unary=('+' | '-' | '~' | '!') expr #unaryExpr

    | expr op=('*'|'/'|'%') expr #multDivExpr
    | expr op=('+'|'-') expr #addSubExpr
    | expr op=('<<' | '>>' | '&' | '^' | '|') expr #bitwiseExpr
    | expr op='&&' expr #andExpr
    | expr op='||' expr #orExpr
    | expr op=('==' | '!=' | '<=' | '>=' | '>' | '<') expr #cmpExpr
    ;

// If statement
/*
if (expr) {
}

if (expr) {
} else {
}

if (expr) {
} else if (expr) {
}
*/
if: 'if' '(' expr ')' block ('else' (if | block))?;

// Switch
/*
switch (expr) {
case (expr) {
}
default {
}
}
*/
switch: 'switch' '(' expr ')' '{' (case | default)* '}';
case: 'case' '(' expr ')' block;
default: 'default' block;

// Function
/*
def ID(ID, ID, ID) {
}
*/
definition: 'def' type ID '(' (type ID (',' type ID)*)? ')' block ;

/*
ID(expr, expr)
*/
call: ID '(' (expr (',' expr)*)? ')';

/*
return
return expr
*/
return: 'return' expr?;

// Variable
/*
var ID = expr
*/
var_init: type ID ('=' expr)?;
var_ass: ID '=' expr;

/*
ID += expr
ID ++
*/

var_assOp: ID op=('+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '<<=' | '%=') expr;
var_inc_dec: ID inc_dec=('++'|'--');

// While
/*
while(expr) {
}
*/
while: 'while' '(' expr ')' block;

/*
do {
}while(expr)
*/
do: 'do' block 'while' '(' expr ')';

// For
/*
for(ID=expr, expr %condition, ID++ or ID += expr) {
}
*/
for: 'for' '(' var_init ',' expr ',' (var_assOp | var_inc_dec) ')' block;

/*
foreach(ID:expr){
}
*/
foreach: 'foreach' '(' type ID ':' expr ')' block;
