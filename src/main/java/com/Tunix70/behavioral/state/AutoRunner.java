package main.java.com.Tunix70.behavioral.state;

public class AutoRunner {
    public static void main(String[] args) {
        State state = new Wait();
        Auto auto = new Auto();

        auto.setState(state);

        for (int i = 0; i < 5; i++) {
            auto.activity();
            auto.changeState();
        }
    }
}
