package Screens;

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
    }
    public static void main(String[] args) {
        ClientHome frame = new ClientHome();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
