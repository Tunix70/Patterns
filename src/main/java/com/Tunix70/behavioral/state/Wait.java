package main.java.com.Tunix70.behavioral.state;

public class Wait implements State{
    @Override
    public void activity() {
        System.out.println("Ожидает");
    }
}
