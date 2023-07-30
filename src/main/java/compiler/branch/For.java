package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.IdModifier;
import compiler.LineType;

public class For extends CompilerTree implements Line {

    /*
     * for (i = 0, i < 0, i++) {
     * }
     * */
    Instantiate instantiate;
    Expression condition;
    IdModifier accumulator;
    Block content;

    public For(Instantiate instantiate, Expression condition, IdModifier accumulator, Block content) {
        this.instantiate = instantiate;
        this.condition = condition;
        this.accumulator = accumulator;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return LineType.FOR;
    }
}
