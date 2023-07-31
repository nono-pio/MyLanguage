package compiler.branch;

import compiler.CompilerTree;
import compiler.LineType;
import compiler.Primary;
import compiler.TypeClass;

public class Boolean_ extends CompilerTree implements Primary {

    boolean value;

    public Boolean_(boolean value) {
        this.value = value;
    }


    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }

}
