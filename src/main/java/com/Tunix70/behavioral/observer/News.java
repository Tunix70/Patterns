package main.java.com.Tunix70.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Observed{
    List<String> newsList = new ArrayList<>();

    List<Observer> readers = new ArrayList<>();

    public void addNews(String news){
        newsList.add(news);
        notifyObservers();
    }

    public void removeNews(String news){
        newsList.remove(news);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        readers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        readers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: readers){
            observer.handelEvent(newsList);
        }
    }
}
