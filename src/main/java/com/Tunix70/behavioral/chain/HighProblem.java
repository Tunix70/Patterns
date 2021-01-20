package main.java.com.Tunix70.behavioral.chain;

public class HighProblem extends Message{
    public HighProblem(int levelChain) {
        super(levelChain);
    }

    @Override
    public void write(String problem) {
        System.out.println("ОСОБОЙ ВАЖНОСТИ: " + problem);
    }
}
