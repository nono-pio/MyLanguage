package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;

public class Char extends CompilerTree implements Primary {

    char value;

    public Char(char value) {
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }
}
