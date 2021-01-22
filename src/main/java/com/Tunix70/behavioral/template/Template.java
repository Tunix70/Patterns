package main.java.com.Tunix70.behavioral.template;

public abstract class Template {
    public void runnerMap(){
        System.out.println("Start");
        activity();
        System.out.println("Stop");
    }

    public abstract void  activity();

}
