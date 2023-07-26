package compiler.branch;

import compiler.*;

public class For extends CompilerTree implements ILine {

    /*
     * for (i = 0, i < 0, i++) {
     * }
     * */
    Assignment assignment;
    Expression condition;
    IdModifier accumulator;
    Block content;

    public For(Assignment assignment, Expression condition, IdModifier accumulator, Block content) {
        this.assignment = assignment;
        this.condition = condition;
        this.accumulator = accumulator;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return LineType.FOR;
    }
}
