package main.java.com.Tunix70.behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void remobeObserver(Observer observer);

    public void notifyObservers();
}
