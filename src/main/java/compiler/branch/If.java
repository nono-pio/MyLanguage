package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;
import compiler.LineType;

public class If extends CompilerTree implements Line {

    IfType type;
    Expression expr;
    Block content;
    Block _else;
    If _if;

    public If(Expression expr, Block content) {
        this.type = IfType.If;
        this.expr = expr;
        this.content = content;
    }

    public If(Expression expr, Block content, Block _else) {
        this.type = IfType.IfElse;
        this.expr = expr;
        this.content = content;
        this._else = _else;
    }

    public If(Expression expr, Block content, If _if) {
        this.type = IfType.IfElif;
        this.expr = expr;
        this.content = content;
        this._if = _if;
    }

    @Override
    public LineType getLineType() {
        return LineType.IF;
    }

    enum IfType {
        If,
        IfElse,
        IfElif
    }
}

/*

expr/block
if (expr) {
}

expr/block/block
if (expr) {
} else {
}

expr/block/if
if (expr) {
} else if(expr) {
}

*/