package compiler.branch;

import compiler.CompilerTree;
import compiler.ILine;
import compiler.LineType;

public class Assigment extends CompilerTree implements ILine {

    String id;
    Expr value;
    public Assigment(String id, Expr value){
        this.id = id;
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.ASSIGMENT;
    }
}
