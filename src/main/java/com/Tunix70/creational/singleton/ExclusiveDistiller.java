package main.java.com.Tunix70.creational.singleton;

public class ExclusiveDistiller {
    private static ExclusiveDistiller exclusiveDistiller;
    private static String exclusiveDistillList = "Exclusive List. \n";

    public static synchronized ExclusiveDistiller getExclusiveDistiller(){
        if(exclusiveDistiller == null)
            return exclusiveDistiller = new ExclusiveDistiller();
        else
            return exclusiveDistiller;
    }

    private ExclusiveDistiller(){

    }

    public void makeExclusive(String distill){
        exclusiveDistillList += distill + "\n";
    }
    public void showExclusiveList(){
        System.out.println(exclusiveDistillList);
    }

}
