package main.java.com.Tunix70.structural.decorator;

public class ManagerWorker extends WorkerDecorator{

    public ManagerWorker(Worker worker) {
        super(worker);
    }

    public String managerWork(){
        return " Руковожу отделом.";
    }

    @Override
    public String doWork() {
        return super.doWork() + managerWork();
    }
}
