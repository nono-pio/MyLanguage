package compiler;

public class Function {

    TypeClass outType;
    String id;
    Variable[] parameters;

    public Function(String id, TypeClass outType) {
        this.id = id;
        this.outType = outType;
    }

    public void setParameters(Variable[] parameters) {
        this.parameters = parameters;
    }
}
