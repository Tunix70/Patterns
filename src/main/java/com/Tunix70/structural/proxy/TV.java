package main.java.com.Tunix70.structural.proxy;

public class TV implements Video{
    private String file;

    public TV(String file) {
        this.file = file;
        load();
    }

    public void load(){
        System.out.println("Загрузка видео " + file);
    }

    @Override
    public void watch() {
        System.out.println("Просмотр видео " + file);
    }
}
