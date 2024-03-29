package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;
import compiler.Variable;

public class Assignment extends CompilerTree implements Line {

    Variable variable;
    Expression value;

    public Assignment(Variable variable, Expression value) {
        this.variable = variable;
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.ASSIGNMENT;
    }
}
