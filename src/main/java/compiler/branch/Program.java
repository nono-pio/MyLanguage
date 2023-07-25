package compiler.branch;

import compiler.CompilerTree;

public class Program extends CompilerTree {

    Line[] lines;
    public Program(Line[] lines) {
        this.lines = lines;
    }

}
