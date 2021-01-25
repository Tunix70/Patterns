package main.java.com.Tunix70.behavioral.visitor;

public class Plane implements ProjectElement {
    @Override
    public void move(Person person) {
        person.start(this);
    }
}
