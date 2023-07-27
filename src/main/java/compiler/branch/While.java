package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class While extends CompilerTree implements Line {

    boolean isDo;
    Expression condition;
    Block content;

    public While(boolean isDo, Expression condition, Block content) {
        this.isDo = isDo;
        this.condition = condition;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return isDo ? LineType.DO : LineType.WHILE;
    }
}
