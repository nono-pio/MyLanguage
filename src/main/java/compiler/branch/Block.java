package compiler.branch;

import compiler.CompilerTree;

public class Block extends CompilerTree {

    Line[] lines;
     public Block(Line[] lines){
         this.lines = lines;
     }

    public Line[] getLines() {
        return lines;
    }
}
