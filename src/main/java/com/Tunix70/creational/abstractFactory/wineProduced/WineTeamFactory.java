package main.java.com.Tunix70.creational.abstractFactory.wineProduced;

import main.java.com.Tunix70.creational.abstractFactory.DistillTeamFactory;
import main.java.com.Tunix70.creational.abstractFactory.Distiller;
import main.java.com.Tunix70.creational.abstractFactory.Sommelier;
import main.java.com.Tunix70.creational.abstractFactory.Supplier;

public class WineTeamFactory implements DistillTeamFactory {
    @Override
    public Supplier getSupplier() {
        return new WineSupplier();
    }

    @Override
    public Distiller getDistiller() {
        return new WineDistiller();
    }

    @Override
    public Sommelier getSommelier() {
        return new WineSommelier();
    }
}
