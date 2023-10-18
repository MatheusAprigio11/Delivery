package Screens;

import Components.Buttons;
import Components.Inputs;
import java.util.ArrayList;
import Entities.App;
import Entities.User;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SignUpClient extends JFrame {

    JLabel label;
    public SignUpClient() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIClientSignUp.png")));
        label = new JLabel(wallpaper);
        label.setBounds(0, -5, 800, 600);
        frame.add(label);

        Inputs name = new Inputs(385, 34, 35, 173);
        Inputs password = new Inputs(385, 34, 35, 248);
        Inputs posX = new Inputs(385, 34, 35, 323);
        Inputs posY = new Inputs(385, 34, 35, 398);
        label.add(name);
        label.add(password);
        label.add(posX);
        label.add(posY);

        Buttons signUpRegister = new Buttons(338,488,196,65);
        Buttons backScreen = new Buttons(48,511, 39,39);


        signUpRegister.addActionListener(e -> {
            if (name.getText().equals("") || password.getText().equals("") || posX.getText().equals("") || posY.getText().equals("")){ //isEmpty
                JOptionPane.showMessageDialog(null, "fill correct all the fields.");
            }else {
                User user = new User(name.getText(), password.getText(), Integer.parseInt(posX.getText()), Integer.parseInt(posY.getText()));
                System.out.println(user);
                App.users.add(user);
            }
            System.out.println(App.users);

            for (User usu:App.users) {
                System.out.println(usu.getPassword());
            }
        });

        backScreen.addActionListener(e -> {
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.openLoginScreen();
            dispose();
        });

        label.add(signUpRegister);
        label.add(backScreen);

    }
    public void openSignUpClient() {
        SignUpClient frame = new SignUpClient();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
