package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;
import compiler.Variable;

public class Instantiate extends CompilerTree implements Line {

    Variable variable;
    Expression expr;

    public Instantiate(Variable variable, Expression expr) {
        this.variable = variable;
        this.expr = expr;
    }

    @Override
    public LineType getLineType() {
        return LineType.INSTANCIATE;
    }
}
