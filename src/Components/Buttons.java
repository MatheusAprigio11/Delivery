package Components;

import javax.swing.*;

public class Buttons extends JButton {
    public Buttons(int x, int y, int wd, int hg) {
        setBounds(x,y,wd,hg);
//        setContentAreaFilled(false);
//        setOpaque(false);
        setBorder(null);
    }
}
