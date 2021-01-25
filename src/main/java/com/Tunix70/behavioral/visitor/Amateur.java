package main.java.com.Tunix70.behavioral.visitor;

public class Amateur implements Person{
    @Override
    public void start(Auto auto) {
        System.out.println("Автолюбитель поехал на работу");
    }

    @Override
    public void start(Bicycle bicycle) {
        System.out.println("Мальчик поехал покататься по двору");
    }

    @Override
    public void start(Plane plane) {
        System.out.println("Любитель собрал самолет и испытывает его на полях");
    }
}
