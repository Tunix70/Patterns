package main.java.com.Tunix70.behavioral.command;

public class StartCommand implements Command{
    Auto auto;

    public StartCommand(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void execute() {
        auto.start();
    }


}
