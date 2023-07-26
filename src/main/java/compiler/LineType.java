package compiler;

/*
line:
      (one_line ';')
    | if
    | switch
    | definition
    | while
    | do
    | for
    | foreach
    ;

one_line:
      expr
    | return
    | var_ass
    | var_inc_dec
    | var_assOp
    ;
*/

public enum LineType {
    IF,
    SWITCH,
    DEFINITION,
    WHILE,
    DO,
    FOR,
    ASSIGMENT,
    FOREACH,
    EXPR,
    INC_DEC,
    RETURN, CALL, ASSIGMENT_OP
}
