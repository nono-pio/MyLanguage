package compiler.branch;

import compiler.CompilerTree;
import compiler.ILine;
import compiler.LineType;

public class Line extends CompilerTree {

    ILine line;
    public  Line(ILine line) {
        this.line = line;
    }

}

