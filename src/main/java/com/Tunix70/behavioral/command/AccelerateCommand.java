package main.java.com.Tunix70.behavioral.command;

public class AccelerateCommand implements Command{
    Auto auto;

    public AccelerateCommand(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void execute() {
        auto.accelerate();
    }
}
