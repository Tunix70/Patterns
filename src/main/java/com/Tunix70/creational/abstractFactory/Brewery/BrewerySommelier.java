package main.java.com.Tunix70.creational.abstractFactory.Brewery;

import main.java.com.Tunix70.creational.abstractFactory.Sommelier;

public class BrewerySommelier implements Sommelier {
    @Override
    public void tasting() {
        System.out.println("Дегустация готового пива");
    }
}
