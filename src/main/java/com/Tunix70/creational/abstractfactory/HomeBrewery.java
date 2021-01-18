package main.java.com.Tunix70.creational.abstractfactory;

import main.java.com.Tunix70.creational.abstractfactory.brewery.Brewer;
import main.java.com.Tunix70.creational.abstractfactory.brewery.BrewerySommelier;
import main.java.com.Tunix70.creational.abstractfactory.brewery.BrewerySupplier;
import main.java.com.Tunix70.creational.abstractfactory.brewery.BreweryTeamFactory;

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
