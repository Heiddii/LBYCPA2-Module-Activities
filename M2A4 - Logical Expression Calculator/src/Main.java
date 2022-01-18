import java.util.Scanner;

public class Main<E> extends MyStack<E> {
    static MyStack<Proposition> Propositions = new MyStack<>();
    static char var1;
    static char var2;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String infixExpression;
        char choice;
        boolean repeat = true;
        do{
            do {
                System.out.println("Logical Operators: ∧,∨,↑,↓,→,¬,↔,⊻");
                System.out.print("Input Infix Expression: ");
                infixExpression = scanner.nextLine();
            } while (!countPropositions(infixExpression));

            String postfixExpression = postfixConvert(infixExpression);
            System.out.println("Postfix Expression: " + postfixExpression);
            Evaluate(postfixExpression);
            TruthTable(infixExpression);

            do {
                System.out.println("\nAgain? Y or N");
                choice = scanner.next().charAt(0);
                switch (Character.toUpperCase(choice)) {
                    case 'Y' -> {
                        repeat = false;
                        System.out.println("Press Any Key To Continue...");
                        new Scanner(System.in).nextLine();
                    }
                    case 'N' -> System.exit(-1);
                    default -> repeat = true;
                }
            }while (repeat);



        }while(true);
    }

    /**
     * Converts the infix expression to postfix
     * @return String - postfix expression
     */
    private static String postfixConvert(String expression) {
        MyStack<Operator> operators = new MyStack<>();

        StringBuilder postfixExpression;
        postfixExpression = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {

            if (Character.isWhitespace(expression.charAt(i))){ //Case 0 - Inputs with spaces
                //do nothing
            }
            else if (Character.isLetter(expression.charAt(i))) { //Case 1 - Element is an Operand
                postfixExpression.append(expression.charAt(i));
            }
            else { //Case 2.0 - Element is an Operator
                if (!operators.isFull()) { //Stack must not be full
                    Operator op = new Operator(expression.charAt(i));
                    if (op.getSYMBOL() == '(') { //Case 2.1 - Open-bracket Encountered
                        operators.push(op);
                    }
                    else if (op.getSYMBOL() == ')') { //Case 2.2 - Closing-bracket Encountered
                        do {
                            postfixExpression.append(operators.top().getSYMBOL());
                            operators.pop();
                        } while (operators.top().getSYMBOL() != '(');
                        operators.pop();
                    }
                    else {
                        if (!operators.isEmpty()) {
                            if (op.getPrecedence() <= operators.top().getPrecedence()
                                    || op.getPrecedence() == operators.top().getPrecedence()) { //Case 2.3 - Stack is empty || Element has Higher Precedence
                                operators.push(op);
                            }
                            else if (op.getPrecedence() > operators.top().getPrecedence()) { //Case 2.4 - Element has Lower Precedence
                                postfixExpression.append(operators.top().getSYMBOL());
                                operators.pop();
                                operators.push(op);
                            }
                        }
                        else{
                            operators.push(op);
                        }
                    }
                }
            }
        }
        while(!operators.isEmpty()){
            postfixExpression.append(operators.top().getSYMBOL());
            operators.pop();
        }
        return postfixExpression.toString();
    }

    /**
     * Counts the number of propositions basing on the number of unique letters
     * @return boolean value
     */
    private static Boolean countPropositions(String expression){
        char [] letters = new char[5];
        int j = 0;

        for (int i = 0; i < expression.length(); i++){
            if (Character.isLetter(expression.charAt(i))){
                if (expression.charAt(i) == letters[0] || expression.charAt(i) == letters[1]){
                    assert true;
                }
                else{
                    letters[j] = expression.charAt(i);
                    j++;
                }
            }
        }

        if (j == 2) {
            var1 = letters[0];
            var2 = letters[1];
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Setups the operands and operations
     * Invokes methods of Operations class
     */
    private static void Evaluate(String expression){
        for(int i = 0; i<expression.length();i++){
            char element = expression.charAt(i);
            if (Character.isLetter(element)){
                if(expression.charAt(i) == var1){
                    Propositions.push(new Prop_1());
                }
                else if(element == var2){
                    Propositions.push(new Prop_2());
                }
            }
            else{
                if (element == '¬') {
                    Proposition negated = Operations.Negate(Propositions.top());
                    Propositions.pop();
                    Propositions.push(negated);
                }
                else {
                    //Setup propositions
                    Proposition p2 = Propositions.top();
                    Propositions.pop();
                    Proposition p1 = Propositions.top();
                    Propositions.pop();
                    switch (element) {
                        case '∧':
                            Propositions.push(Operations.Conjunction(p1, p2));
                            break;
                        case '∨':
                            Propositions.push(Operations.Disjunction(p1,p2));
                            break;
                        case '→':
                            Propositions.push(Operations.Conditional(p1, p2));
                            break;
                        case '↔':
                            Propositions.push(Operations.Biconditional(p1,p2));
                            break;
                        case '↑':
                            Propositions.push(Operations.NAND(p1,p2));
                            break;
                        case '↓':
                            Propositions.push(Operations.NOR(p1,p2));
                            break;
                        case '⊻':
                            Propositions.push(Operations.XOR(p1,p2));
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    /**
     * Draws the Truth Table
     */
    private static void TruthTable(String expression){
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();

        System.out.println("\nTRUTH TABLE OUTPUT");
        System.out.print(var1 + " | ");
        System.out.print(var2 + " | ");
        System.out.println(expression);

        for(int k = 0; k<8+expression.length();k++){
            System.out.print("-");
        }
        System.out.print("\n");

        for(int i = 0; i<4;i++){
            System.out.print(P.getSymbol(i) + " | ");
            System.out.print(Q.getSymbol(i) + " | ");
            for(int j = 0; j<expression.length()/2;j++){
                System.out.print(" ");
            }
            System.out.println(Propositions.top().getSymbol(i));
        }
    }
}
