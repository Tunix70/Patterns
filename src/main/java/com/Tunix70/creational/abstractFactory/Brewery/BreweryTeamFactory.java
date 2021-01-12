package main.java.com.Tunix70.creational.abstractFactory.Brewery;

import main.java.com.Tunix70.creational.abstractFactory.DistillTeamFactory;
import main.java.com.Tunix70.creational.abstractFactory.Distiller;
import main.java.com.Tunix70.creational.abstractFactory.Sommelier;
import main.java.com.Tunix70.creational.abstractFactory.Supplier;

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
