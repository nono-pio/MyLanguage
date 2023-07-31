package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class Void_ extends CompilerTree implements Expression {


    @Override public LineType getLineType() {
        return LineType.EXPR;
    }
}
