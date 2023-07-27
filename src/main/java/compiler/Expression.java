package compiler;

import compiler.branch.Line;

public interface Expression extends Line {

    TypeExpr getOutputType();

}
