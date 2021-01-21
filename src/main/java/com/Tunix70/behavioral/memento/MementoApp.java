package main.java.com.Tunix70.behavioral.memento;

public class MementoApp {
    public static void main(String[] args) {
        Game game = new Game();

        game.set("LVL1", 3000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL2", 55000);
        System.out.println(game);

        System.out.println("Загружаемся");
        game.load(file.getSave());
        System.out.println(game);
    }
}
