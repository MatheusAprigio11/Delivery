package Components;

import javax.swing.*;
import java.awt.*;

public class Inputs extends JTextField {
    public Inputs(int wd, int hg, int x, int y){
        setSize(wd, hg);
        setLocation(x, y);
        setBorder(null);
        setBackground(new Color(0, 0, 0, 0));
        setOpaque(false);
    }

}
