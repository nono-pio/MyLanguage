package compiler.branch;

import compiler.*;

/*

'*'| '/' | '%' | '+' | '-' | '<<' | '>>' | '&' | '^' | '|'
'&&' | '||' | '==' | '!=' | '<=' | '>=' | '>' | '<'

*/
public class BinaryExpr extends CompilerTree implements Expression {

    Expression leftExpr;
    Expression rightExpr;
    Operator op;

    public BinaryExpr(Expression leftExpr, Expression rightExpr, Operator op) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.op = op;
    }

    @Override public TypeExpr getOutputType() {

        if (!validValuesForOperator()) {
            throw new RuntimeException("Invalid Type " + leftExpr.getOutputType() + " and " + rightExpr.getOutputType() + " for Operator " + op.name());
        }

        TypeExpr leftType = leftExpr.getOutputType();
        TypeExpr rightType = rightExpr.getOutputType();
        return switch (op) {
            case ADD -> leftType.isStringOrChar() ? TypeExpr.STRING : leftType.strongerNumber(rightType);
            case SUB, MULT, DIV, MOD, BIT_AND, BIT_OR, BIT_XOR, SHIFTL, SHIFTR -> leftType.strongerNumber(rightType);
            case OR, AND, EQUAL, NOTEQUAL, GREATER, SMALLER, GTEQ, SMEQ -> TypeExpr.BOOLEAN;
            default -> throw new RuntimeException("Invalid operator");
        };
    }

    public boolean validValuesForOperator() {
        TypeExpr leftType = leftExpr.getOutputType();
        TypeExpr rightType = rightExpr.getOutputType();
        return switch (op) {
            case ADD ->
                    (leftType.isNumber() && rightType.isNumber()) || (leftType.isStringOrChar() && rightType.isStringOrChar()); // NUM + NUM or STRING + STRING
            case SUB, MULT, DIV, MOD, BIT_AND, BIT_OR, BIT_XOR, SHIFTL, SHIFTR ->
                    leftType.isNumber() && rightType.isNumber();
            case OR, AND, EQUAL, NOTEQUAL, GREATER, SMALLER, GTEQ, SMEQ ->
                    leftType == TypeExpr.BOOLEAN && rightType == TypeExpr.BOOLEAN;
            default -> throw new RuntimeException("Invalid operator");
        };
    }

    @Override public LineType getLineType() {
        return LineType.EXPR;
    }
}