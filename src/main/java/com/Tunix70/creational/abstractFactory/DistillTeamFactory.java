package main.java.com.Tunix70.creational.abstractFactory;

public interface DistillTeamFactory {
    Supplier getSupplier();
    Distiller getDistiller();
    Sommelier getSommelier();

}
