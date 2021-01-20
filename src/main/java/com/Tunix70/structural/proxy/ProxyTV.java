package main.java.com.Tunix70.structural.proxy;

public class ProxyTV implements Video{
    private String file;
    private TV tv;

    public ProxyTV(String file) {
        this.file = file;
    }

    @Override
    public void watch() {
        if (tv == null) {
            tv = new TV(file);
        }
        tv.watch();
    }
}
