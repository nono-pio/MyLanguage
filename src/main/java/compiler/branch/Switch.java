package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.ILine;
import compiler.LineType;

public class Switch extends CompilerTree implements ILine {

    Expression value;
    Case[] cases;
    Block _default;

    public Switch(Expression value, Case[] cases, Block _default) {
        this.value = value;
        this.cases = cases;
        this._default = _default;
    }

    @Override
    public LineType getLineType() {
        return LineType.SWITCH;
    }
}