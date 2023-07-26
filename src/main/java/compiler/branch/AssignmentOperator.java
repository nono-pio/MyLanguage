package compiler.branch;

import compiler.*;

public class AssignmentOperator extends CompilerTree implements ILine, IdModifier {

    String id;
    Operator op;
    Expression value;

    public AssignmentOperator(String id, Operator op, Expression value) {
        this.id = id;
        this.op = op;
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.ASSIGMENT_OP;
    }
}
