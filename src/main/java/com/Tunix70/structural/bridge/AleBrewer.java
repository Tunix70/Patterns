package main.java.com.Tunix70.structural.bridge;

public class AleBrewer implements HomeBrewer{
    @Override
    public void createBeer() {
        System.out.println("Пивовар варит Эль");
    }
}
