package compiler.branch;

import compiler.CompilerTree;
import compiler.Local;
import compiler.Variable;

import java.util.HashMap;

public class Block extends CompilerTree {

    Line[] lines;

    Local local;

    public Block(Local local, Line[] lines) {
        this.local = local;
        this.lines = lines;
    }

    public Line[] getLines() {
        return lines;
    }


}