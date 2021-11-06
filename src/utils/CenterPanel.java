package utils;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    private double rate;//stretch rate
    private JComponent c; //the components to show
    private boolean stretch; //stretch or not

    public CenterPanel(double rate, boolean strech){
        this.setLayout(null);
        this.rate = rate;
        this.stretch = strech;
    }
    public CenterPanel(double rate){
        this(rate, true);
    }

    public void repaint(){
        if (c != null){
            Dimension containerSize = this.getSize();
            Dimension componentSize = c.getPreferredSize();

            if (stretch){
                c.setSize((int) (containerSize.width * rate), (int) (containerSize.height * rate));
            }
            else {
                c.setSize(componentSize);
            }

            c.setLocation(containerSize.width / 2 - c.getSize().width / 2,
                    containerSize.height / 2 - c.getSize().height / 2);
        }
        super.repaint();
    }

    public void show(JComponent p) {
        this.c = p;
        Component[] cs = getComponents();
        for (Component c : cs) {
            remove(c);
        }
        add(p);
        this.updateUI();
    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(0.85,true);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JButton b  =new JButton("abc");
        cp.show(b);

    }
}
