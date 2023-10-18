package Entities;

import java.util.ArrayList;

public class App {
    public static ArrayList<User> users = new ArrayList<>();
    public App() {

    }
    public void addUsers(User user){
        users.add(user);
    }
}
