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

}
