package main.java.com.Tunix70.behavioral.strategy;

public class Auto {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.executeActivity();
    }
}
