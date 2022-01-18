public class Operator {
    private final int PRECEDENCE;
    private final char SYMBOL;

    public Operator(Character op){
        this.SYMBOL = op;
        this.PRECEDENCE = setPrecedence(op);
    }

    private int setPrecedence(Character op){
        return switch (op) {
            case ')' -> 0;
            case '(' -> 9;
            case '¬' -> 1;
            case '∧' -> 2;
            case '∨' -> 3;
            case '→' -> 4;
            case '↔' -> 5;
            case '↑' -> 6;
            case '↓' -> 7;
            case '⊻' -> 8;
            default -> -1;
        };
    }

    public char getSYMBOL() {
        return SYMBOL;
    }
    public int getPrecedence(){
        return PRECEDENCE;
    }
}
