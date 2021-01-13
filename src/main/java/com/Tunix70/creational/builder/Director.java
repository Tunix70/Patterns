package main.java.com.Tunix70.creational.builder;

public class Director {
    BeerBuilder builder;

    public void setBuilder(BeerBuilder builder) {
        this.builder = builder;
    }

    Beer buildBeer(){
        builder.createBeer();
        builder.beerName();
        builder.beerVariety();
        builder.beerPrice();

        Beer beer = builder.getBeer();

        return beer;
    }
}
