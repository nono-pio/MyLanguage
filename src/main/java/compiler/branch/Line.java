package compiler.branch;

import compiler.CompilerTree;
import compiler.ILine;

public class Line extends CompilerTree {

    ILine line;

    public Line(ILine line) {
        this.line = line;
    }

}

