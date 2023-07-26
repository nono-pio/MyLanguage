package compiler.branch;

import compiler.*;

public class Increment extends CompilerTree implements ILine, IdModifier {

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
