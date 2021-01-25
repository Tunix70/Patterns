package main.java.com.Tunix70.behavioral.visitor;

public class Professional implements Person {
    @Override
    public void start(Auto auto) {
        System.out.println("Пилот F1 выезжает на полосу");
    }

    @Override
    public void start(Bicycle bicycle) {
        System.out.println("Участник соревнований выехжает на трассу");
    }

    @Override
    public void start(Plane plane) {
        System.out.println("Пилот самолета начинает полет");
    }
}
