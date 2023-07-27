package compiler;

public enum TypeExpr {

    INTEGER,
    FLOAT,
    BOOLEAN,
    CHAR,
    STRING,
    VOID,
    NONE; // error

    public boolean isNumber() {
        return this == INTEGER || this == FLOAT;
    }

    public boolean isStringOrChar() {
        return this == STRING || this == CHAR;
    }

    public TypeExpr strongerNumber(TypeExpr type) {

        if (this == FLOAT || type == FLOAT) {
            return FLOAT;
        }
        return INTEGER;
    }

}
