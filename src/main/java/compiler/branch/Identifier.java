package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class Identifier extends CompilerTree implements Expression {

    String id;

    public Identifier(String id) {
        this.id = id;
    }

    @Override
    public LineType getLineType() {
        return LineType.EXPR;
    }
}
