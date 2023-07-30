package compiler.branch;

import compiler.CompilerTree;

public class Program extends CompilerTree {

    Block block;

    public Program(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return this.block;
    }
}
