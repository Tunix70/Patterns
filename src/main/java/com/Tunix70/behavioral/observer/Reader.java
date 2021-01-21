package main.java.com.Tunix70.behavioral.observer;

import java.util.List;

public class Reader implements Observer{
    String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void handelEvent(List<String> news) {
        System.out.println(name + ", перед Вами изменения в новостях" +  news +
                "\n=============================================\n");
    }
}
