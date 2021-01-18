package main.java.com.Tunix70.creational.abstractfactory;

public interface DistillTeamFactory {
    Supplier getSupplier();
    Distiller getDistiller();
    Sommelier getSommelier();

}
