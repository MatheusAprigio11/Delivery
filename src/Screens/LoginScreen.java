package Screens;

import Components.Buttons;
import Components.Inputs;
import Entities.App;
import Entities.Restaurant;
import Entities.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginScreen extends JFrame {
    JLabel label;

    public LoginScreen() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GILogin.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);
        frame.add(label);

        Inputs loginCamp = new Inputs(385, 34, 212, 323);
        Inputs passwordCamp = new Inputs(385, 34, 212, 392);
        label.add(loginCamp);
        label.add(passwordCamp);

        Buttons signIn = new Buttons(349, 455, 101, 48);
        Buttons newRestaurant = new Buttons(673, 470, 88, 40);
        Buttons newCostumer = new Buttons(673, 542, 88, 40);

        label.add(signIn);
        label.add(newRestaurant);
        label.add(newCostumer);


        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(loginCamp.getText() + passwordCamp.getText());

                if (App.users.contains(new User(loginCamp.getText(),passwordCamp.getText(),0, 0))){
                    for (User userlog : App.users) {
                        if (userlog.equals(new User(loginCamp.getText(), passwordCamp.getText(), 0, 0))){
                            App.userLogged = userlog;
                        }
                    }

                    ClientHome clientHome = new ClientHome();
                    clientHome.abrirClientHome();
                    dispose();
                }
                else if (App.restaurants.contains(new Restaurant(loginCamp.getText(), passwordCamp.getText(), 0, 0))){
                    for (Restaurant rest : App.restaurants) {
                        if (rest.equals(new Restaurant(loginCamp.getText(), passwordCamp.getText(), 0, 0))){
                            App.restaurantLogged = rest;
                        }
                    }
                    RestaurantHome.openRestaurantHome();
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "something went wrong");
                }
            }
        });

        newRestaurant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUpRestaurant signUpRestaurant = new SignUpRestaurant();
                signUpRestaurant.openSignUpRestaurant();
                dispose();
            }
        });

        newCostumer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUpClient signUpClient = new SignUpClient();
                signUpClient.openSignUpClient();
                dispose();
            }
        });
    }

    public void openLoginScreen() {
        LoginScreen frame = new LoginScreen();
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}