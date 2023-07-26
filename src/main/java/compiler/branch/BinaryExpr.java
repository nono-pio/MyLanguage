package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;
import compiler.Operator;

public class BinaryExpr extends CompilerTree implements Expression {

    Expression leftExpr;
    Expression rightExpr;
    Operator type;

    public BinaryExpr(Expression leftExpr, Expression rightExpr, Operator type) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.type = type;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }
}
