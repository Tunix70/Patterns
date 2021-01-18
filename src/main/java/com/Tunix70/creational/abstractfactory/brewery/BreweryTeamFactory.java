package main.java.com.Tunix70.creational.abstractfactory.brewery;

import main.java.com.Tunix70.creational.abstractfactory.DistillTeamFactory;
import main.java.com.Tunix70.creational.abstractfactory.Distiller;
import main.java.com.Tunix70.creational.abstractfactory.Sommelier;
import main.java.com.Tunix70.creational.abstractfactory.Supplier;

public class BreweryTeamFactory implements DistillTeamFactory {
    @Override
    public Supplier getSupplier() {
        return new BrewerySupplier();
    }

    @Override
    public Distiller getDistiller() {
        return new Brewer();
    }

    @Override
    public Sommelier getSommelier() {
        return new BrewerySommelier();
    }
}
