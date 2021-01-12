package main.java.com.Tunix70.creational.abstractFactory;

import main.java.com.Tunix70.creational.abstractFactory.Brewery.Brewer;
import main.java.com.Tunix70.creational.abstractFactory.Brewery.BrewerySommelier;
import main.java.com.Tunix70.creational.abstractFactory.Brewery.BrewerySupplier;
import main.java.com.Tunix70.creational.abstractFactory.Brewery.BreweryTeamFactory;

public class HomeBrewery {
    public static void main(String[] args) {
        DistillTeamFactory distillTeamFactory = new BreweryTeamFactory();
        Supplier supplier = new BrewerySupplier();
        Distiller distiller = new Brewer();
        Sommelier sommelier = new BrewerySommelier();

        System.out.println("Creating brewery");
        supplier.supplyRaw();
        distiller.makeDistill();
        sommelier.tasting();

    }
}
