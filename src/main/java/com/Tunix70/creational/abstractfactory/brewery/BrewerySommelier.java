package main.java.com.Tunix70.creational.abstractfactory.brewery;

import main.java.com.Tunix70.creational.abstractfactory.Sommelier;

public class BrewerySommelier implements Sommelier {
    @Override
    public void tasting() {
        System.out.println("Дегустация готового пива");
    }
}
