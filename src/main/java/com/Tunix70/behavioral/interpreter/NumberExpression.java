package main.java.com.Tunix70.behavioral.interpreter;

public class NumberExpression implements Expression{
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
