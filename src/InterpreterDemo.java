public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isJava = new TerminalExpression("Java");
        System.out.println("Does context contain 'Java'? " + isJava.interpret("I love Java"));
    }
}