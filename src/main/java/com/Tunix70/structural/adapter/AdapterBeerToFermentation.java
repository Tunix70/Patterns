package main.java.com.Tunix70.structural.adapter;

public class AdapterBeerToFermentation extends BeerFermentation implements Fermentation{
    @Override
    public void makerWater() {
        makeWaterForBeer();
    }

    @Override
    public void makerYeast() {
        makeYeastForBeer();
    }

    @Override
    public void makerRaw() {
        makeMalt();
    }
}
