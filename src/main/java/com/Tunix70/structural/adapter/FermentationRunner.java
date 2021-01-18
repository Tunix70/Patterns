package main.java.com.Tunix70.structural.adapter;

public class FermentationRunner {
    public static void main(String[] args) {
        Fermentation fermentation = new AdapterBeerToFermentation();

        fermentation.makerWater();
        fermentation.makerYeast();
        fermentation.makerRaw();

    }
}
