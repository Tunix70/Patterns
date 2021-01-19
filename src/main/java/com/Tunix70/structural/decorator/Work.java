package main.java.com.Tunix70.structural.decorator;

public class Work {
    public static void main(String[] args) {
        Worker worker = new ManagerWorker(new MiddleWorker(new JuniorWorker()));

        System.out.println(worker.doWork());
    }
}
