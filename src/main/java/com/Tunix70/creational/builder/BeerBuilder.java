package main.java.com.Tunix70.creational.builder;

public abstract class BeerBuilder {
    Beer beer;

    void createBeer(){
        beer = new Beer();
    }

    abstract void beerName();
    abstract void beerVariety();
    abstract void beerPrice();

    Beer getBeer(){
        return beer;
    }
}
