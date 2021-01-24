package main.java.com.Tunix70.behavioral.visitor;

public class Starter {
    public static void main(String[] args) {
        Model model = new Model();

        Person amateur = new Amateur();
        Person professional = new Professional();

        System.out.println("Amateur started..");
        model.move(amateur);

        System.out.println("\n======================================\n");

        System.out.println("Professional started..");
        model.move(professional);
    }
}
