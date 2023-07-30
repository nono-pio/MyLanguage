package compiler.branch;

import compiler.*;

public class AssignmentOperator extends CompilerTree implements Line, IdModifier {

    Variable variable;
    Operator op;
    Expression value;

    public AssignmentOperator(Variable variable, Operator op, Expression value) {
        this.variable = variable;
        this.op = op;
        this.value = value;
    }

    @Override
    public LineType getLineType() {
        return LineType.ASSIGNMENT_OP;
    }
}
