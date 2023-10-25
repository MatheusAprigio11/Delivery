package Entities;

public class Dish {

    public String dishName;
    public String price;

    public Dish(String dishName, String price) {
        this.dishName = dishName;
        this.price = price;
    }

    @Override
    public String toString() {
        return dishName + price;
    }
}
