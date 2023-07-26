package compiler.branch;

import compiler.CompilerTree;
import compiler.ILine;
import compiler.IdModifier;
import compiler.LineType;

public class Increment extends CompilerTree implements ILine, IdModifier {
    @Override
    public LineType getLineType() {
        return LineType.INC_DEC;
    }
}
