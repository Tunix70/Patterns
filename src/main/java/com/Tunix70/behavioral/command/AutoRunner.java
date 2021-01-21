package main.java.com.Tunix70.behavioral.command;

public class AutoRunner {
    public static void main(String[] args) {
        Auto auto = new Auto();
        InvokerCommand invokerCommand = new InvokerCommand(
                new StartCommand(auto), new StopCommand(auto), new AccelerateCommand(auto));

        invokerCommand.startAuto();
        invokerCommand.stopAuto();
        invokerCommand.accelerateAuto();

    }
}
