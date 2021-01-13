package main.java.com.Tunix70.creational.builder;

public class Beer {
    private String name;
    private Variety variety;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", variety=" + variety +
                ", price=" + price +
                '}';
    }
}
