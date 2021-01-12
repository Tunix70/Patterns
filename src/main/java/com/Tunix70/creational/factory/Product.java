package main.java.com.Tunix70.creational.factory;
/*
В зависимости от выбора сырья, создается дистиллер, который
делает соответствующий напиток
 */
public class Product {
    public static void main(String[] args) {
        DistillerFactory distillerFactory = createDistillerByDistill("солод");
        Distiller distiller = distillerFactory.createDistiller();

        distiller.makeDistill();
    }

    static DistillerFactory createDistillerByDistill(String rawMaterial){
        if (rawMaterial.equalsIgnoreCase("солод")){
            return new WhiskeyDistillerFactory();
        }else if(rawMaterial.equalsIgnoreCase("кукуруза")){
            return new BourboneDistillerFactory();
        }else {
            throw new RuntimeException(rawMaterial + "is unknown.");
        }
    }
}
