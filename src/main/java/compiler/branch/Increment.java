package compiler.branch;

import compiler.*;

public class Increment extends CompilerTree implements Line, IdModifier {

    Variable variable;
    Operator op;

    public Increment(Variable variable, Operator op) {
        this.variable = variable;
        this.op = op;
    }

    @Override
    public LineType getLineType() {
        return LineType.INC_DEC;
    }
}
