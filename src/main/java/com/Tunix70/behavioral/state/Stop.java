package main.java.com.Tunix70.behavioral.state;

public class Stop implements State{
    @Override
    public void activity() {
        System.out.println("Стоит");
    }
}
