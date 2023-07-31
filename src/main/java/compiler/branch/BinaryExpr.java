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

    @Override public LineType getLineType() {
        return LineType.EXPR;
    }
}