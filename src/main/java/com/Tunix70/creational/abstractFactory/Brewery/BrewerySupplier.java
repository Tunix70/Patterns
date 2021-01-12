package main.java.com.Tunix70.creational.abstractFactory.Brewery;

import main.java.com.Tunix70.creational.abstractFactory.Supplier;

public class BrewerySupplier implements Supplier {
    @Override
    public void supplyRaw() {
        System.out.println("Поставка солода из солодовни");
    }
}
