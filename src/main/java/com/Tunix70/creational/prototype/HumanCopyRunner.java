package main.java.com.Tunix70.creational.prototype;

public class HumanCopyRunner {
    public static void main(String[] args) {
        Human humanOne = new Human("Vasily", 35, "Tomsk");

        HumanFactory factory = new HumanFactory(humanOne);
        Human copyHuman = factory.cloneHuman();


        System.out.println(humanOne);
        System.out.println(copyHuman);
    }
}
