package compiler.branch;

import compiler.CompilerTree;
import compiler.ILine;
import compiler.LineType;

public class Definition extends CompilerTree implements ILine {

    String id;
    String[] parameters;
    Block content;

    public Definition(String id, String[] parameters, Block content) {
        this.id = id;
        this.parameters = parameters;
        this.content = content;
    }

    @Override
    public LineType getLineType() {
        return LineType.DEFINITION;
    }
}