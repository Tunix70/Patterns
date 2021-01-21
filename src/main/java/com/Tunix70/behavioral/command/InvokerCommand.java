package main.java.com.Tunix70.behavioral.command;
//Invoker
public class InvokerCommand {
    Command start;
    Command stop;
    Command accelerate;

    public InvokerCommand(Command start, Command stop, Command accelerate) {
        this.start = start;
        this.stop = stop;
        this.accelerate = accelerate;
    }

    void startAuto(){
        start.execute();
    }
    void stopAuto(){
        stop.execute();
    }
    void accelerateAuto(){
        accelerate.execute();
    }
}
