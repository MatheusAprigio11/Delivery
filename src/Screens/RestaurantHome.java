package Screens;

import Components.Buttons;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class RestaurantHome extends JFrame{
    JLabel label;
    public RestaurantHome() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIRestaurantHome.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);
        frame.add(label);

        Buttons newDish = new Buttons(302,325,196,54);
        Buttons logOut = new Buttons(302, 395, 196,54);
        label.add(newDish);
        label.add(logOut);

        logOut.addActionListener(e -> {
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.openLoginScreen();
            dispose();
        });

    }
    public void openRestaurantHome() {
        RestaurantHome frame = new RestaurantHome();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
