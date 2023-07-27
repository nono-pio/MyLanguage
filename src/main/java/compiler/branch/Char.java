package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;
import compiler.TypeExpr;

public class Char extends CompilerTree implements Primary {

    char value;

    public Char(char value) {
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }

    @Override
    public TypeExpr getOutputType() {
        return TypeExpr.CHAR;
    }
}
