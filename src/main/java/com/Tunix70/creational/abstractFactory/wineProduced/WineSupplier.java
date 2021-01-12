package main.java.com.Tunix70.creational.abstractFactory.wineProduced;

import main.java.com.Tunix70.creational.abstractFactory.Supplier;

public class WineSupplier implements Supplier {
    @Override
    public void supplyRaw() {
        System.out.println("Поставка виноматериала");
    }
}
