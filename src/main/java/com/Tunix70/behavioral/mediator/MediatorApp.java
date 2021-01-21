package main.java.com.Tunix70.behavioral.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Administrator(chat);
        User u1 = new SimpleUser(chat);
        User u2 = new SimpleUser(chat);

        chat.setAdministrator(admin);
        chat.addUser(u1);
        chat.addUser(u2);

        u2.sendMessage("Привет, я пользователь");
        admin.sendMessage("Я- Админ");
    }
}
