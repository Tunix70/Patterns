package main.java.com.Tunix70.creational.singleton;

public class DistillerRunner {
    public static void main(String[] args) {
        ExclusiveDistiller.getExclusiveDistiller().makeExclusive("#1. Alc.55");
        ExclusiveDistiller.getExclusiveDistiller().makeExclusive("#2. Alc.45");

        ExclusiveDistiller.getExclusiveDistiller().showExclusiveList();

    }
}
