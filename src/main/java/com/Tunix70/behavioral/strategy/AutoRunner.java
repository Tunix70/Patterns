package main.java.com.Tunix70.behavioral.strategy;

public class AutoRunner {
    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.setActivity(new Stop());
        auto.executeActivity();

        auto.setActivity(new Ride());
        auto.executeActivity();

        auto.setActivity(new Wait());
        auto.executeActivity();
    }
}
