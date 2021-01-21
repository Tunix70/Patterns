package main.java.com.Tunix70.behavioral.command;

public class StopCommand implements Command{
    Auto auto;

    public StopCommand(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void execute() {
        auto.stop();
    }
}
