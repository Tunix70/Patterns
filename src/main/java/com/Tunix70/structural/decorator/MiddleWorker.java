package main.java.com.Tunix70.structural.decorator;

public class MiddleWorker extends WorkerDecorator{

    public MiddleWorker(Worker worker) {
        super(worker);
    }

    public String middleWork(){
        return " Самостоятельно выполняю поручения.";
    }

    @Override
    public String doWork() {
        return super.doWork() + middleWork();
    }
}
