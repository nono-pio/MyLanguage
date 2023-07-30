package compiler;

import java.util.HashMap;

public class Local {

    HashMap<String, Variable> localVariables = new HashMap<>();
    HashMap<String, Function> localFunctions = new HashMap<>();
    public Local parent;

    public Local(Local parent) {
        this.parent = parent;
    }

    public Variable instanciateVariable(String id) {

        Variable variable = new Variable(id);
        localVariables.put(id, variable);
        return variable;
    }

    public Variable getVariable(String id) {

        Variable variable = localVariables.get(id);
        if (variable == null && parent != null) {
            variable = parent.getVariable(id);
        }

        if (variable == null) {
            throw new RuntimeException(" The variable "+id+" do not exist. You need to instantiate before access");
        }
        return variable;
    }

    public Function defineFunction(String id) {

        Function function = new Function(id);
        localFunctions.put(id, function);
        return function;
    }

    public Function getFunction(String id) {

        Function function = localFunctions.get(id);
        if (function == null && parent != null) {
            function = parent.getFunction(id);
        }

        if (function == null) {
            throw new RuntimeException(" The function "+id+" isn't define.");
        }
        return function;
    }

}
