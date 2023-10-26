package Screens;

import Components.Buttons;
import Entities.App;
import Entities.Restaurant;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class NewOrder extends JFrame{
    static JComboBox<Restaurant> selectRestaurant = new JComboBox<>(App.restaurants.toArray(new Restaurant[0]));
    JLabel label;
    public NewOrder() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GISelectRestaurant.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);

        Buttons back = new Buttons(48,511,39,39);
        Buttons next = new Buttons(709,511,39,39);
        label.add(back);
        label.add(next);

        selectRestaurant.setBounds(316, 292, 180, 35);
        label.add(selectRestaurant);

        frame.add(label);


        back.addActionListener(e -> {
            ClientHome screenCHome = new ClientHome();
            screenCHome.abrirClientHome();
            dispose();
        });

        next.addActionListener(e -> {
            DishesScreen dishesScreen = new DishesScreen();
            dishesScreen.openDishesScreen();
            dispose();
        });
    }

    public static void openNewOrderScreen(){
        NewOrder frame = new NewOrder();
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
