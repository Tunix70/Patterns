package main.java.com.Tunix70.creational.factory;

public class WhiskeyDistiller implements Distiller{
    @Override
    public void makeDistill() {
        System.out.println("make whiskey");
    }
}
