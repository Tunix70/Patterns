package main.java.com.Tunix70.creational.abstractFactory;

import main.java.com.Tunix70.creational.abstractFactory.wineProduced.WineTeamFactory;

public class GarageWinery {
    public static void main(String[] args) {
        DistillTeamFactory distillTeamFactory = new WineTeamFactory();
        Supplier supplier = distillTeamFactory.getSupplier();
        Distiller distiller = distillTeamFactory.getDistiller();
        Sommelier sommelier = distillTeamFactory.getSommelier();

        System.out.println("Creating Winery");
        supplier.supplyRaw();
        distiller.makeDistill();
        sommelier.tasting();

    }
}
