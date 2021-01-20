package main.java.com.Tunix70.structural.proxy;

public class TVRunner {
    public static void main(String[] args) {
        Video tv = new ProxyTV("Новости");

        tv.watch();
    }
}
