package main.java.com.Tunix70.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DistillGroup implements Distiller {
    private List<Distiller> distillerList = new ArrayList<>();

    public void addDistiller(Distiller distiller){
        distillerList.add(distiller);
    }

    public void removeDistiller(Distiller distiller){
        distillerList.remove(distiller);
    }
     public void createRealises(){
         System.out.println("DistillGroup started...\n");
         for(Distiller dist : distillerList){
             dist.makeDistill();
         }
     }

    @Override
    public void makeDistill() {

    }
}
