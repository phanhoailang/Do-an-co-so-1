/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Helpers;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageDialog {

    public static void showMessageDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showErrorDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.ERROR_MESSAGE);
    }

    public static int showConfirmialog(Component parent, String content, String title) {
        int choose = JOptionPane.showConfirmDialog(parent, title, content,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return choose;
    }

}
