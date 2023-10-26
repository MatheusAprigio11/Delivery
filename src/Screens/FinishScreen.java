package Screens;

import Components.Buttons;
import Components.Texts;
import Entities.Dish;
import Entities.Order;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Objects;

public class FinishScreen extends JFrame{
    JLabel label;
    JScrollPane scrollPane;
    Texts textField;
    float value = 0.0f;
    public static String valueShow;

    public static JComboBox<String> payment;
    public FinishScreen() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = getContentPane();
        frame.setLayout(null);



        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("../images/GICart.png")));
        label = new JLabel(wallpaper);
        label.setBounds(-5, -30, 800, 600);

        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Dish", "Price"},0);

        for (Dish order : Order.orderList) {
            Object[] row = {order.dishName, order.price};
            tableModel.addRow(row);
        }

        for (Dish priceDish : Order.orderList) {
            float dishPrice = Float.parseFloat(priceDish.price);
            value += dishPrice;
            valueShow = String.valueOf(value);
        }


        payment = new JComboBox<>();
        payment.addItem("Debit");
        payment.addItem("Credit");
        payment.addItem("Money");

        payment.setBounds(594,168,156,67);

        textField = new Texts("R$: " + valueShow, 633,369,77,100);

        JTable table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        scrollPane.setBounds(40,90,445,380);

        Buttons back = new Buttons(48,511,39,39);
        Buttons finish = new Buttons(340, 505, 112, 52);

        finish.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "The order has been sent. Printing the order...");
            Order.printOrder();
            ClientHome clientHome = new ClientHome();
            clientHome.abrirClientHome();
            dispose();
        });

        back.addActionListener(e -> {
            DishesScreen dishesScreen = new DishesScreen();
            dishesScreen.openDishesScreen();
            dispose();
        });


        label.add(payment);
        label.add(textField);
        label.add(finish);
        label.add(back);
        label.add(scrollPane);
        frame.add(label);
    }

    public void openFinishScreen(){
        FinishScreen frame = new FinishScreen();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
