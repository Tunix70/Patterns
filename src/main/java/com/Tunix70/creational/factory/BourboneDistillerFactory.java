package main.java.com.Tunix70.creational.factory;

public class BourboneDistillerFactory implements DistillerFactory{
    @Override
    public Distiller createDistiller() {
        return new BourbonDistiller();
    }
}
