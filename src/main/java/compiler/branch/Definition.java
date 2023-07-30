package compiler.branch;

import compiler.CompilerTree;
import compiler.Function;
import compiler.LineType;

public class Definition extends CompilerTree implements Line {

    Function function;
    Block content;

    public Definition(Function function, Block content) {
        this.function = function;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return LineType.DEFINITION;
    }
}
