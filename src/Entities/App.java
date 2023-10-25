package Entities;

import Screens.LoginScreen;

import java.util.ArrayList;

public class App {
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Restaurant> restaurants = new ArrayList<>();

    public static Restaurant restaurantLogged;
    public static User userLogged;

    public static ArrayList<Dish> dishes = new ArrayList<>();
    public App() {
        LoginScreen start = new LoginScreen();
        start.openLoginScreen();
        User userAdmin = new User("adminClient", "admin123", 0, 0);
        Restaurant resAdmin = new Restaurant("adminRestaurant", "res123", 0, 0);
        resAdmin.dishes.add(new Dish("Banana com canela", "10.5"));
        users.add(userAdmin);
        restaurants.add(resAdmin);
    }

}
