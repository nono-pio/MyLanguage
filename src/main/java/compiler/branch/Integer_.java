package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;
import compiler.TypeClass;

public class Integer_ extends CompilerTree implements Primary {

    int value;

    public Integer_(int value) {
        this.value = value;
    }

    @Override public LineType getLineType() {
        return LineType.EXPR;
    }
}
