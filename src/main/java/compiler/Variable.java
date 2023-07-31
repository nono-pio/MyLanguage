package compiler;

public class Variable {

    String id;
public TypeClass type;

    public Variable(String id, TypeClass type) {
        this.id = id;
        this.type = type;
    }

    public boolean isEqual(Variable variable) {
        return id.contentEquals(variable.id);
    }

}
