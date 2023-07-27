package compiler.branch;

import compiler.CompilerTree;
import compiler.IdModifier;
import compiler.LineType;
import compiler.Operator;

public class Increment extends CompilerTree implements Line, IdModifier {

    String id;
    Operator op;

    public Increment(String id, Operator op) {
        this.id = id;
        this.op = op;
    }

    @Override
    public LineType getLineType() {
        return LineType.INC_DEC;
    }
}
