package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;
import compiler.TypeExpr;

public class Integer_ extends CompilerTree implements Primary {

    int value;

    public Integer_(int value) {
        this.value = value;
    }

    @Override public LineType getLineType() {
        return LineType.EXPR;
    }

    @Override
    public TypeExpr getOutputType() {
        return TypeExpr.INTEGER;
    }
}
