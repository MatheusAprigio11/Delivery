package Entities;


import Screens.FinishScreen;

import java.util.ArrayList;

public class Order {
    public static ArrayList<Dish> orderList;
    static ArrayList<Dish> finishOrder;

    public Order(){
        orderList = new ArrayList<>();
        finishOrder = new ArrayList<>();


    }

    public static void printOrder(){
        System.out.format("%-10s%-20s%n", "| Name Dish | ", " Price | ");
        System.out.println("-----------------------------------");
        for (Dish item : orderList) {
            System.out.format("%-20s%-10s%n", "| " + item.dishName, "| R$: " + item.price);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total R$: " + FinishScreen.valueShow);
        }
}
