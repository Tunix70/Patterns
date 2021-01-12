package main.java.com.Tunix70.creational.abstractFactory.wineProduced;

import main.java.com.Tunix70.creational.abstractFactory.Sommelier;

public class WineSommelier implements Sommelier {
    @Override
    public void tasting() {
        System.out.println("Дегустация вина");
    }
}
