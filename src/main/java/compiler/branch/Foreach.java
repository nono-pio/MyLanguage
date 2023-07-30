package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;
import compiler.Variable;

public class Foreach extends CompilerTree implements Line {

    Variable variable;
    Expression value;
    Block content;

    public Foreach(Variable variable, Expression value, Block content) {
        this.variable = variable;
        this.value = value;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return LineType.FOREACH;
    }
}
