package Screens;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class DishesScreen extends JFrame{
    JLabel label;
    public DishesScreen() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIDishes.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);

        System.out.println(NewOrder.selectRestaurant.getSelectedItem());


        frame.add(label);
    }

    public void openDishesScreen(){
        DishesScreen frame = new DishesScreen();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
