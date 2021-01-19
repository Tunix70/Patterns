package main.java.com.Tunix70.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Bottle{
    private List<Bottle> components = new ArrayList<>();

    public void addComponent(Bottle bottle){
        components.add(bottle);
    }

    public void removeComponent(Bottle bottle){
        components.remove(bottle);
    }

    @Override
    public void contain() {
        for(Bottle bottle : components){
            bottle.contain();
        }
    }
}
