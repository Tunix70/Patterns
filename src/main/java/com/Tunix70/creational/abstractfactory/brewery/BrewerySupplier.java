package main.java.com.Tunix70.creational.abstractfactory.brewery;

import main.java.com.Tunix70.creational.abstractfactory.Supplier;

public class BrewerySupplier implements Supplier {
    @Override
    public void supplyRaw() {
        System.out.println("Поставка солода из солодовни");
    }
}
