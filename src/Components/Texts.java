package Components;

import javax.swing.*;
import java.awt.*;

public class Texts extends JTextField{
    public Texts(String phrase, int x, int y, int wd, int hg) {
        super(phrase);
        Font font = new Font("Inter", Font.BOLD, 20);
        setFont(font);
        setOpaque(false);
        setBorder(null);
        setBounds(x, y, wd, hg);
        setEditable(false);
        setVisible(true);
    }
}
