package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.ILine;
import compiler.LineType;

public class Return extends CompilerTree implements ILine {

    Expression expr;

    public Return(Expression expr) {
        this.expr = expr;
    }

    @Override
    public LineType getLineType() {
        return LineType.RETURN;
    }
}
