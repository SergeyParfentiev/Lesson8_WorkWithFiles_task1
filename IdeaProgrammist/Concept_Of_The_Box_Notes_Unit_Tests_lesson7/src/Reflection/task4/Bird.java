package Reflection.task4;

/**
 * Created by Byblik272 on 19/1/2016.
 */
public class Bird {

    private String name;
    private int price;
    private int count;

    public Bird(String name, int price, int count) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
