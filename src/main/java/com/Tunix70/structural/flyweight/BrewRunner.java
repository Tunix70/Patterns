package main.java.com.Tunix70.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BrewRunner {
    public static void main(String[] args) {
        CraftBrewery craftBrewery = new CraftBrewery();

        List<Brewer> brewers = new ArrayList<>();
        brewers.add(craftBrewery.getBrewerBySpecialty("Ale"));
        brewers.add(craftBrewery.getBrewerBySpecialty("Ale"));
        brewers.add(craftBrewery.getBrewerBySpecialty("Ale"));
        brewers.add(craftBrewery.getBrewerBySpecialty("Lager"));
        brewers.add(craftBrewery.getBrewerBySpecialty("Lager"));
        brewers.add(craftBrewery.getBrewerBySpecialty("Lager"));
        brewers.add(craftBrewery.getBrewerBySpecialty("Lager"));

        for(Brewer brewer: brewers){
            brewer.brew();
        }

    }
}
