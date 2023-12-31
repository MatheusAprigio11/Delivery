package Screens;

import Components.Buttons;
import Components.Inputs;
import Entities.App;
import Entities.Dish;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class RestaurantDish extends JFrame{
    JLabel label;
    public RestaurantDish() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIRestaurantDish.png")));
        label = new JLabel(wallpaper);
        label.setBounds(0, -5, 800, 600);
        frame.add(label);

        Inputs nameDish = new Inputs(395, 34, 212, 310);
        Inputs priceDish = new Inputs(395, 34, 212, 385);
        label.add(nameDish);
        label.add(priceDish);



        Buttons register = new Buttons(338,485,140,59);
        label.add(register);

        register.addActionListener(e -> {
            App.restaurantLogged.dishes.add(new Dish(nameDish.getText(), priceDish.getText()));
            JOptionPane.showMessageDialog(null, "Prato " + nameDish.getText() + " cadastrado com sucesso.");
            RestaurantHome.openRestaurantHome();
            dispose();
        });

    }
    public void openRestaurantDish() {
        RestaurantDish frame = new RestaurantDish();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
