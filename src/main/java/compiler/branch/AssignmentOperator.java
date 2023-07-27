package compiler.branch;

import compiler.*;

public class AssignmentOperator extends CompilerTree implements Line, IdModifier {

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
        return LineType.ASSIGNMENT_OP;
    }
}
