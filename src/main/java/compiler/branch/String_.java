package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;
import compiler.TypeClass;

public class String_ extends CompilerTree implements Primary {

    String string;

    public String_(String string) {
        this.string = string;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }

}
