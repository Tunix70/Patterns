package main.java.com.Tunix70.behavioral.visitor;

public interface Person {
    public void start(Auto auto);

    public void start(Bicycle bicycle);

    public void start(Plane plane);
}
