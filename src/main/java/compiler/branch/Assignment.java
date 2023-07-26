package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.ILine;
import compiler.LineType;

public class Assignment extends CompilerTree implements ILine {

    String id;
    Expression value;

    public Assignment(String id, Expression value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.ASSIGMENT;
    }
}
