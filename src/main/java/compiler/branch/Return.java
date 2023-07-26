package compiler.branch;

import compiler.CompilerTree;
import compiler.ILine;
import compiler.LineType;

public class Return extends CompilerTree implements ILine {
    @Override
    public LineType getLineType() {
        return LineType.RETURN;
    }
}
