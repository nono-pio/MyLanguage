package compiler;

public class Function {

    String id;
    Variable[] parameters;

    public Function(String id) {
        this.id = id;
    }

    public void setParameters(Variable[] parameters) {
        this.parameters = parameters;
    }
}
