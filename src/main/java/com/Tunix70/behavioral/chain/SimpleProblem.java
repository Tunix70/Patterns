package main.java.com.Tunix70.behavioral.chain;

public class SimpleProblem extends Message{
    public SimpleProblem(int levelChain) {
        super(levelChain);
    }

    @Override
    public void write(String problem) {
        System.out.println("ЗАКАЗНОЕ: " + problem);
    }
}
