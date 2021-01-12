package main.java.com.Tunix70.creational.factory;

public class WhiskeyDistillerFactory implements DistillerFactory{
    @Override
    public Distiller createDistiller() {
        return new WhiskeyDistiller();
    }
}
