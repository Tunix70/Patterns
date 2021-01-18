package main.java.com.Tunix70.structural.composite;

public class WhiskeyDistiller implements Distiller{
    @Override
    public void makeDistill() {
        System.out.println("Перегонка затора на виски");
    }
}
