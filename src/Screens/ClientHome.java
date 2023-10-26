package Screens;

import Components.Buttons;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ClientHome extends JFrame {
    JLabel label;
    public ClientHome() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIClientHome.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);
        frame.add(label);

        Buttons newOrder = new Buttons(302,314,196,54);
        Buttons logOut = new Buttons(302, 384, 196,54);
        label.add(newOrder);
        label.add(logOut);

        newOrder.addActionListener(e -> {
            NewOrder.openNewOrderScreen();
            dispose();
        });

        logOut.addActionListener(e -> {
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.openLoginScreen();
            dispose();
        });

    }
    public void abrirClientHome(){
        ClientHome frame = new ClientHome();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
