package main.java.com.Tunix70.behavioral.iterator;

public class AutoRunner {
    public static void main(String[] args) {
        String [] characteristics = {"sport", "lux"};

        Auto auto = new Auto("Lexus IS250", characteristics);

        Iterator iterator = auto.getIterator();
        System.out.println("Auto " + auto.getName() + " со следующими характеристиками: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
