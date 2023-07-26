package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class Call extends CompilerTree implements Expression {

    String id;
    Expression[] parameters;

    public Call(String id, Expression[] parameters) {
        this.id = id;
        this.parameters = parameters;
    }


    @Override
    public LineType getLineType() {
        return LineType.CALL;
    }
}
