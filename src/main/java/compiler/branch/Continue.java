package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;

public class Continue extends CompilerTree implements Line {
    @Override
    public LineType getLineType() {
        return LineType.CONTINUE;
    }
}
