package Entities;


import java.util.ArrayList;

public class Order {
    public static ArrayList<Dish> orderList;
    static ArrayList<Dish> finishOrder;

    public Order(){
        orderList = new ArrayList<>();
        finishOrder = new ArrayList<>();


    }

    public static void printOrder(){
        System.out.format("%-20s%-10s%n", "Name Dish", "Price");
        for (Dish item : orderList) {
            System.out.format("%-20s%-10s%n", item.dishName, "R$: " + item.price);
        }

        }
}
