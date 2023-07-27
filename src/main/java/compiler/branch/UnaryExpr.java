package compiler.branch;

import compiler.*;

/*

('+' | '-' | '~' | '!') expr

*/
public class UnaryExpr extends CompilerTree implements Expression {

    Expression value;
    Operator op;

    public UnaryExpr(Expression value, Operator op) {
        this.value = value;
        this.op = op;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }

    @Override
    public TypeExpr getOutputType() {

        if (!validValueForOperator()) {
            throw new RuntimeException("Invalid Type " + value.getOutputType() + " for Operator " + op.name());
        }

        return value.getOutputType();
    }

    public boolean validValueForOperator() {
        TypeExpr valueType = value.getOutputType();
        return switch (op) {
            case POSITIVE, NEGATIVE, BIT_NOT -> valueType.isNumber();
            case NOT -> valueType == TypeExpr.BOOLEAN;
            default -> throw new RuntimeException("Invalid operator");
        };
    }
}
