package Entities;

import Screens.LoginScreen;

import java.util.ArrayList;

public class App {
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Restaurant> restaurants = new ArrayList<>();
    public App() {
        LoginScreen start = new LoginScreen();
        start.openLoginScreen();
        User userAdmin = new User("adminClient", "admin123", 0, 0);
        Restaurant resAdmin = new Restaurant("adminRestaurant", "res123", 0, 0);
        users.add(userAdmin);
        restaurants.add(resAdmin);
    }

}
