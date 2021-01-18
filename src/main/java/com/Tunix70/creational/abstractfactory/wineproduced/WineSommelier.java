package main.java.com.Tunix70.creational.abstractfactory.wineproduced;

import main.java.com.Tunix70.creational.abstractfactory.Sommelier;

public class WineSommelier implements Sommelier {
    @Override
    public void tasting() {
        System.out.println("Дегустация вина");
    }
}
