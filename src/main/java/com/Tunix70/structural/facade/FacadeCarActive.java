package main.java.com.Tunix70.structural.facade;

public class FacadeCarActive {
    Car car = new Car();
    Driver driver = new Driver();
    Engine engine = new Engine();

    public void carActive(){
        driver.drive();
        engine.engineOn();
        car.drive(engine);

    }
}
