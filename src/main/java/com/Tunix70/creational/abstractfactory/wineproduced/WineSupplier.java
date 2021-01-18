package main.java.com.Tunix70.creational.abstractfactory.wineproduced;

import main.java.com.Tunix70.creational.abstractfactory.Supplier;

public class WineSupplier implements Supplier {
    @Override
    public void supplyRaw() {
        System.out.println("Поставка виноматериала");
    }
}
