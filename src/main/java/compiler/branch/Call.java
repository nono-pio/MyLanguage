package compiler.branch;

import compiler.*;

public class Call extends CompilerTree implements Expression {

    Function function;
    Expression[] parameters;

    public Call(Function function, Expression[] parameters) {
        this.function = function;
        this.parameters = parameters;
    }


    @Override
    public LineType getLineType() {
        return LineType.CALL;
    }

    @Override public TypeExpr getOutputType() {
        return TypeExpr.NONE;
    }
}
