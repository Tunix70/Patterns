package main.java.com.Tunix70.structural.decorator;

public class WorkerDecorator implements Worker{
    Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String doWork() {
        return worker.doWork();
    }
}
