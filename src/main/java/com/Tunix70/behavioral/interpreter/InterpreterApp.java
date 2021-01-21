package main.java.com.Tunix70.behavioral.interpreter;

public class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expr = context.evaluate("1+2-2+4");
        System.out.println(expr.interpret());
    }
}
