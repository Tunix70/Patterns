package main.java.com.Tunix70.creational.abstractfactory.brewery;

import main.java.com.Tunix70.creational.abstractfactory.Distiller;

public class Brewer implements Distiller {
    @Override
    public void makeDistill() {
        System.out.println("Затирание и сбраживание солодового затора");
    }
}
