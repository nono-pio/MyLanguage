package compiler;

import antlr.GrammarParser;
import compiler.branch.*;

import java.util.List;

public enum TypeClass {

    INT(new Integer_(0)),
    FLOAT(new Float_(0)),
    BOOLEAN(new Boolean_(false)),
    STRING(new Null_()),
    CHAR(new Char((char) 0)),
    VOID(new Void_());

    public final Expression defaultValue;
    TypeClass(Expression defaultValue) {
        this.defaultValue = defaultValue;
    }

    public static TypeClass getType(String type) {

        return switch (type) {
            case "int" -> INT;
            case "float", "real" -> FLOAT;
            case "bool", "boolean" -> BOOLEAN;
            case "string" -> STRING;
            case "char" -> CHAR;
            case "void" -> VOID;
            default -> throw new RuntimeException("The type "+type+" do not exist");
        };
    }

    public static TypeClass[] getTypes(List<GrammarParser.TypeContext> ctx){

        TypeClass[] types = new TypeClass[ctx.size()];
        for (int i = 0; i < types.length; i++) {
            types[i] = getType(ctx.get(0).getText());
        }
        return types;
    }
}
