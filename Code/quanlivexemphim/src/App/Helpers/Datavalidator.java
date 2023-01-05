/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Helpers;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author win10
 */
public class Datavalidator {

    public static void validateEmpty(JTextField field, StringBuffer sb, String errorMessage) {
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.YELLOW);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    public static void validateEmpty(JPasswordField field, StringBuffer sb, String errorMessage) {
        String s = new String(field.getPassword());
        if (s.equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.YELLOW);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    public static void validateEmpty(JDateChooser dateCalendar, StringBuffer sb, String errorMessage) {
        String s = dateCalendar.getDate() + "";
        if (s.equals("null")) {
            sb.append(errorMessage).append("\n");
            dateCalendar.setBackground(Color.YELLOW);
            dateCalendar.requestFocus();
        } else {
            dateCalendar.setBackground(Color.WHITE);
        }
    }

    public static void validateEmpty(ButtonGroup btn, StringBuffer sb, String errorMessage) {
        String genDer = "";
        Enumeration<AbstractButton> btn1 = btn.getElements();
        while (btn1.hasMoreElements()) {
            AbstractButton b = btn1.nextElement();
            if (b.isSelected()) {
                genDer = b.getText();
            }
        }
        if (genDer.equals("")) {
            sb.append(errorMessage).append("\n");
        }
    }
}
