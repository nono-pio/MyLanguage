package compiler;

public class Variable {

    String id;

    public Variable(String id) {
        this.id = id;
    }

    public boolean isEqual(Variable variable) {
        return id.contentEquals(variable.id);
    }

}
