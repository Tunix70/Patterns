package main.java.com.Tunix70.structural.bridge;


public class CraftMarket extends Brewery {
    protected CraftMarket(HomeBrewer homeBrewer) {
        super(homeBrewer);
    }

    @Override
    public void makeBeer() {
        System.out.println("Крафтовый магазин начинает варить пиво.");
        homeBrewer.createBeer();
    }
}
