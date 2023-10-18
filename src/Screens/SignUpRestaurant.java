package Screens;

import Components.Buttons;
import Components.Inputs;
import Entities.App;
import Entities.Restaurant;
import Entities.User;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUpRestaurant extends JFrame {
    JLabel label;
    public SignUpRestaurant() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GISignUpRestaurant.png")));
        label = new JLabel(wallpaper);
        label.setBounds(0, -5, 800, 600);
        frame.add(label);

        Inputs nameRestaurant = new Inputs(385, 34, 35, 173);
        Inputs password = new Inputs(385, 34, 35, 248);
        Inputs posX = new Inputs(385, 34, 35, 323);
        Inputs posY = new Inputs(385, 34, 35, 398);
        label.add(nameRestaurant);
        label.add(password);
        label.add(posX);
        label.add(posY);

        Buttons signUpRegister = new Buttons(338,488,196,65);
        Buttons backScreen = new Buttons(48,511, 39,39);

        backScreen.addActionListener(e -> {
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.openLoginScreen();
            dispose();
        });

        signUpRegister.addActionListener(e -> {
            if (nameRestaurant.getText().equals("") || password.getText().equals("") || posX.getText().equals("") || posY.getText().equals("")){
                JOptionPane.showMessageDialog(null, "fill correct all the fields.");
            }else {
                Restaurant restaurant = new Restaurant(nameRestaurant.getText(), password.getText(), Integer.parseInt(posX.getText()), Integer.parseInt(posY.getText()));
                System.out.println(restaurant);
                App.restaurants.add(restaurant);
            }
            for (Restaurant res:App.restaurants) {
                System.out.println(res.getRestaurantName());
            }
        });


        label.add(signUpRegister);
        label.add(backScreen);

    }
    public void openSignUpRestaurant() {
        SignUpRestaurant frame = new SignUpRestaurant();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
