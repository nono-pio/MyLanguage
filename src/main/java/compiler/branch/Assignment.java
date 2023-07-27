package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class Assignment extends CompilerTree implements Line {

    String id;
    Expression value;

    public Assignment(String id, Expression value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.ASSIGNMENT;
    }
}
