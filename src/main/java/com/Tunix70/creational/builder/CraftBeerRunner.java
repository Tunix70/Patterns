package main.java.com.Tunix70.creational.builder;

public class CraftBeerRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new AleBeerBuilder());
        Beer beer = director.buildBeer();

        System.out.println(beer);
    }
}
