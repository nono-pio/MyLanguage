package compiler.branch;

import compiler.CompilerTree;
import compiler.Expression;

public class Case extends CompilerTree {

    Expression expr;
    Block block;

    public Case(Expression expr, Block block) {
        this.expr = expr;
        this.block = block;
    }
}
