/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Helpers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author win10
 */
public class Datavalidator {
    public static void validateEmpty(JTextField field, StringBuffer sb, String errorMessage){
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.YELLOW);
            field.requestFocus();
        }
        else field.setBackground(Color.WHITE);
    }
    public static void validateEmpty(JPasswordField field, StringBuffer sb, String errorMessage){
        String s = new String(field.getPassword());
        if(s.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.YELLOW);
            field.requestFocus();
        }
        else field.setBackground(Color.WHITE);
    }
}
