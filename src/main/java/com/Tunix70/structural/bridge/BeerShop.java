package main.java.com.Tunix70.structural.bridge;

public class BeerShop extends Brewery {

    protected BeerShop(HomeBrewer homeBrewer) {
        super(homeBrewer);
    }

    @Override
    public void makeBeer() {
        System.out.println("Пивной магазин начинает варить пиво");
        homeBrewer.createBeer();
    }
}
