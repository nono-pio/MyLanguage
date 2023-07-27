package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;
import compiler.TypeExpr;

public class Float_ extends CompilerTree implements Primary {

    float value;

    public Float_(float value) {
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }

    @Override
    public TypeExpr getOutputType() {
        return TypeExpr.FLOAT;
    }
}
