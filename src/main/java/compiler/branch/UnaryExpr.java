package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;
import compiler.Operator;

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
}
