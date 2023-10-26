package Screens;

import Components.Buttons;
import Entities.Dish;
import Entities.Order;
import Entities.Restaurant;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class DishesScreen extends JFrame{
    JComboBox<Dish> allDishes;
    JLabel label;
    public DishesScreen() {
        Order order = new Order();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);

        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GIDishes.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);

        Restaurant selectedRestaurant = (Restaurant) NewOrder.selectRestaurant.getSelectedItem();

        DefaultComboBoxModel<Dish> model = new DefaultComboBoxModel<>(selectedRestaurant.dishes.toArray(new Dish[0]));
        allDishes = new JComboBox<>(model);

        allDishes.setBounds(100, 100, 300, 100);
        label.add(allDishes);

        Buttons back = new Buttons(48,511,39,39);
        Buttons addCart = new Buttons(331, 498, 137, 65);
        Buttons finish = new Buttons(639, 505, 112, 52);
        label.add(back);
        label.add(addCart);
        label.add(finish);


        frame.add(label);


        addCart.addActionListener(e -> {
            Dish selectedDish = (Dish) allDishes.getSelectedItem();
            Order.orderList.add(selectedDish);
        });

        finish.addActionListener(e -> {
            FinishScreen finishScreen = new FinishScreen();
            finishScreen.openFinishScreen();
            dispose();
        });

        back.addActionListener(e -> {
            NewOrder.openNewOrderScreen();
            dispose();
        });
    }

    public void openDishesScreen(){
        DishesScreen frame = new DishesScreen();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
