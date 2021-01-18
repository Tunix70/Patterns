package main.java.com.Tunix70.creational.abstractfactory.wineproduced;

import main.java.com.Tunix70.creational.abstractfactory.DistillTeamFactory;
import main.java.com.Tunix70.creational.abstractfactory.Distiller;
import main.java.com.Tunix70.creational.abstractfactory.Sommelier;
import main.java.com.Tunix70.creational.abstractfactory.Supplier;

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
