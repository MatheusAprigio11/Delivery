package Screens;

import Components.Buttons;
import Components.Inputs;

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
        Inputs cpf = new Inputs(385, 34, 35, 248);
        Inputs posX = new Inputs(385, 34, 35, 323);
        Inputs posY = new Inputs(385, 34, 35, 398);
        label.add(name);
        label.add(cpf);
        label.add(posX);
        label.add(posY);

        Buttons signUp = new Buttons(338,488,196,65);
        label.add(signUp);

    }
    public static void main(String[] args) {
        SignUpClient frame = new SignUpClient();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
