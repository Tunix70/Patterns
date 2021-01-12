package main.java.com.Tunix70.creational.abstractFactory.wineProduced;

import main.java.com.Tunix70.creational.abstractFactory.Distiller;

public class WineDistiller implements Distiller {
    @Override
    public void makeDistill() {
        System.out.println("Сбраживание виноматериала");
    }
}
