package main.java.com.Tunix70.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CraftBrewery {
    private static final Map<String, Brewer> brewers = new HashMap<>();

    public Brewer getBrewerBySpecialty(String specialty){
        Brewer brewer = brewers.get(specialty);

        if(brewer == null){
            switch (specialty){
                case "Ale":
                    System.out.println("Пивовар готовится к варке эля");
                    brewer = new AleBrewer();
                    break;
                case "Lager":
                    System.out.println("Пивовар готовится к варке лагера");
                    brewer = new LagerBrewer();
                    break;
            }
            brewers.put(specialty, brewer);
        }
        return brewer;
    }
}
