package main.java.com.Tunix70.structural.bridge;


public abstract class Brewery {
    protected HomeBrewer homeBrewer;

    protected Brewery(HomeBrewer homeBrewer) {
        this.homeBrewer = homeBrewer;
    }

    public abstract void makeBeer();
}
