package main.java.com.Tunix70.behavioral.chain;

public class MessegeRunner {
    public static void main(String[] args) {
        Message low = new LowProblem(LevelChain.INFO);
        Message simple = new SimpleProblem(LevelChain.ERROR);
        Message high = new HighProblem(LevelChain.CRIT_ERROR);

        low.setNextMessage(simple);
        simple.setNextMessage(high);

        low.MessageManager("Что-то пощло не так", LevelChain.INFO);
        low.MessageManager("Кажется случилась неприятность", LevelChain.ERROR);
        low.MessageManager("У нас проблема!", LevelChain.CRIT_ERROR);
    }
}
