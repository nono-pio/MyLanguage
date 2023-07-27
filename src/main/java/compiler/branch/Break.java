package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;

public class Break extends CompilerTree implements Line {
    @Override
    public LineType getLineType() {
        return LineType.BREAK;
    }
}
