package main.java.com.Tunix70.creational.abstractfactory.wineproduced;

import main.java.com.Tunix70.creational.abstractfactory.Distiller;

public class WineDistiller implements Distiller {
    @Override
    public void makeDistill() {
        System.out.println("Сбраживание виноматериала");
    }
}
