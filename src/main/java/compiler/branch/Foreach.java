package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class Foreach extends CompilerTree implements Line {

    String id;
    Expression value;
    Block content;

    public Foreach(String id, Expression value, Block content) {
        this.id = id;
        this.value = value;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return LineType.FOREACH;
    }
}
