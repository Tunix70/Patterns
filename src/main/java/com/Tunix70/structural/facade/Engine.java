package main.java.com.Tunix70.structural.facade;

public class Engine {
    public boolean engineActive;

    public boolean isEngineActive(){
        return engineActive;
    }

    public boolean engineOn(){
        System.out.println("Двигатель работает");
        return engineActive = true;
    }

    public boolean engineOff(){
        System.out.println("Двигатель заглушен");
        return engineActive = false;
    }
}
