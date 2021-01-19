package main.java.com.Tunix70.structural.facade;

public class Car {
    public void drive(Engine engine){
        if(engine.isEngineActive()) {
            System.out.println("Автомобиль движется");
        }else {
            System.out.println("Автомобиль стоит");
        }
    }
}
