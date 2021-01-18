package main.java.com.Tunix70.structural.bridge;

public class BeerCreator {
    public static void main(String[] args) {
        Brewery [] brewery = {
                new BeerShop(new LagerBrewer()),
                new CraftMarket(new AleBrewer())
        };

        for(Brewery beerMaker : brewery){
            beerMaker.makeBeer();
        }
    }
}
