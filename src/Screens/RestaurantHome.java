package Screens;

import Components.Buttons;
import Entities.App;
import Entities.Dish;
import Entities.Restaurant;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class RestaurantHome extends JFrame{
    JLabel label;
    public RestaurantHome( ) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);
        System.out.println(App.restaurantLogged.dishes);
        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIRestaurantHome.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);
        frame.add(label);

        Buttons newDish = new Buttons(302,325,196,54);
        Buttons logOut = new Buttons(302, 395, 196,54);
        label.add(newDish);
        label.add(logOut);

        newDish.addActionListener(e -> {
            RestaurantDish restaurantDish = new RestaurantDish();
            restaurantDish.openRestaurantDish();
            dispose();
        });

        logOut.addActionListener(e -> {
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.openLoginScreen();
            dispose();
        });

    }
    public static void openRestaurantHome() {
        RestaurantHome frame = new RestaurantHome();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
