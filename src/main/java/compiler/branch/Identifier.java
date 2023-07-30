package compiler.branch;

import compiler.*;

public class Identifier extends CompilerTree implements Expression {

    Variable variable;

    public Identifier(Variable variable) {
        this.variable = variable;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }

    @Override
    public TypeExpr getOutputType() {
        return TypeExpr.NONE; //TODO
    }
}
