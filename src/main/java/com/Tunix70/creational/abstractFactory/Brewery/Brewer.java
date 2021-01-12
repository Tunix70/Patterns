package main.java.com.Tunix70.creational.abstractFactory.Brewery;

import main.java.com.Tunix70.creational.abstractFactory.Distiller;

public class Brewer implements Distiller {
    @Override
    public void makeDistill() {
        System.out.println("Затирание и сбраживание солодового затора");
    }
}
