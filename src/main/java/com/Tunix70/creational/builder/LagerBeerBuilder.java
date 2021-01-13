package main.java.com.Tunix70.creational.builder;

public class LagerBeerBuilder extends BeerBuilder{
    @Override
    void beerName() {
        beer.setName("Балтика");
    }

    @Override
    void beerVariety() {
        beer.setVariety(Variety.LAGER);
    }

    @Override
    void beerPrice() {
        beer.setPrice(50);
    }
}
