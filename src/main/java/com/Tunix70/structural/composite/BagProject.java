package main.java.com.Tunix70.structural.composite;

public class BagProject {
    public static void main(String[] args) {
        Bottle beerBottle = new BeerBottle();
        Bottle wineBottlr = new WineBottle();

        Composite alcoBag = new Composite();
        alcoBag.addComponent(beerBottle);
        alcoBag.addComponent(wineBottlr);

        Composite bigBag = new Composite();
        bigBag.addComponent(beerBottle);
        bigBag.addComponent(alcoBag);

        alcoBag.contain();
        System.out.println();
        bigBag.contain();


    }
}
