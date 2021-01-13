package main.java.com.Tunix70.creational.builder;

public class AleBeerBuilder extends BeerBuilder{
    @Override
    void beerName() {
        beer.setName("Мюнхенский эль");
    }

    @Override
    void beerVariety() {
        beer.setVariety(Variety.ALE);
    }

    @Override
    void beerPrice() {
        beer.setPrice(200);
    }
}
