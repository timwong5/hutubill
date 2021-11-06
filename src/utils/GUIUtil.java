package utils;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUIUtil {
    private static String imageFolder = "./img";
    //check the blanket is empty or not
    public static boolean checkEmpty(JTextField textField,String input){
        String text = textField.getText().trim();
        //check the empty return false
        if (input.length() == 0){
            JOptionPane.showMessageDialog(null, input + " 不能为空");
            textField.grabFocus();
            return false;
        }
        return true;
    }

    //check the blanket is number or not
    public static boolean checkNumber(JTextField textField, String input){
        if (!checkEmpty(textField, input)){
            return false;
        }
        String text = textField.getText().trim();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, input + " 需要是整数");
            textField.grabFocus();
            return false;
        }
    }

    //check the blanket is zero or not
    public static boolean checkZero(JTextField textField, String input){
        if (!checkEmpty(textField, input)){
            return false;
        }
        String text = textField.getText().trim();
        if (Integer.parseInt(text) == 0){
            textField.grabFocus();
            return false;
        }
        return true;
    }

    //set the colors
    public static void setColor(Color color, JComponent... components) {
        for (JComponent c : components) {
            c.setForeground(color);
        }
    }

    public static void setImageIcon(JButton b, String fileName, String tip) {
        ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
        b.setIcon(i);
        b.setPreferredSize(new Dimension(61, 81));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setText(tip);
    }

    public static void useLNF() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
