package main.java.com.Tunix70.behavioral.template;

public class ActivityRunner {
    public static void main(String[] args) {
        Template auto = new Auto();
        Template runner = new Runner();

        auto.runnerMap();
        System.out.println("=====================");
        runner.runnerMap();
    }
}
