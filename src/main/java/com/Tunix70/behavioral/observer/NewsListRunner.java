package main.java.com.Tunix70.behavioral.observer;

public class NewsListRunner {
    public static void main(String[] args) {
        News news = new News();

        news.addNews("First news");
        news.addNews("Second news");

        Observer firstReader = new Reader("IVAN");
        Observer secondReader = new Reader("PETYA");

        news.addObserver(firstReader);
        news.addObserver(secondReader);

        news.addNews("Third news");


    }
}
