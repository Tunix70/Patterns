package main.java.com.Tunix70.behavioral.chain;

public class LowProblem extends Message{
    public LowProblem(int levelChain) {
        super(levelChain);
    }

    @Override
    public void write(String problem) {
        System.out.println("ПРОСТОЕ: " + problem);
    }
}
