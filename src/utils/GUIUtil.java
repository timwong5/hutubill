package utils;

import javax.swing.*;

public class GUIUtil {

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
        if (checkEmpty(textField, input)){
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
}
