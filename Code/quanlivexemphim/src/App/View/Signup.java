/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package App.View;

import App.Dao.UserDao;
import App.Helpers.Datavalidator;
import App.Helpers.MessageDialog;
import App.Model.User;
import java.util.Calendar;
import java.util.Enumeration;
import javax.swing.AbstractButton;

/**
 *
 * @author win10
 */
public class Signup extends javax.swing.JDialog {

    /**
     * Creates new form Singup
     */
    public Signup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel_Signup = new javax.swing.JPanel();
        jLabel_FullName = new javax.swing.JLabel();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jTextField_Password = new javax.swing.JTextField();
        jLabel_DateOfBirth = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jLabel_PhoneNumber = new javax.swing.JLabel();
        jTextField_FullName = new javax.swing.JTextField();
        jButton_SignUp = new javax.swing.JButton();
        jButton_BackLogin = new javax.swing.JButton();
        jDateChooser_DateOfBirth = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel_Signup.setBackground(new java.awt.Color(255, 204, 204));
        jPanel_Signup.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "????NG K??", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jLabel_FullName.setText("H??? V?? T??n");

        jTextField_PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneNumberActionPerformed(evt);
            }
        });

        jLabel_Password.setText("M???t Kh???u");

        jLabel_DateOfBirth.setText("Ng??y Sinh");

        jLabel_Gender.setText("Gi???i T??nh");

        buttonGroup1.add(jRadioButton_Male);
        jRadioButton_Male.setText("Nam");
        jRadioButton_Male.setAlignmentX(2.0F);
        jRadioButton_Male.setAlignmentY(2.0F);
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Female);
        jRadioButton_Female.setText("N???");
        jRadioButton_Female.setAlignmentX(2.0F);
        jRadioButton_Female.setAlignmentY(2.0F);
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });

        jLabel_PhoneNumber.setText("T??i Kho???n");

        jTextField_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FullNameActionPerformed(evt);
            }
        });

        jButton_SignUp.setText("Ho??n Th??nh");
        jButton_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SignUpActionPerformed(evt);
            }
        });

        jButton_BackLogin.setText("Quay L???i");
        jButton_BackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackLoginActionPerformed(evt);
            }
        });

        jDateChooser_DateOfBirth.setDateFormatString("yyyy-MM-dd");
        jDateChooser_DateOfBirth.setMinSelectableDate(new java.util.Date(-62135791131000L));

        javax.swing.GroupLayout jPanel_SignupLayout = new javax.swing.GroupLayout(jPanel_Signup);
        jPanel_Signup.setLayout(jPanel_SignupLayout);
        jPanel_SignupLayout.setHorizontalGroup(
            jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SignupLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SignupLayout.createSequentialGroup()
                        .addGroup(jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_SignupLayout.createSequentialGroup()
                                .addComponent(jLabel_Gender)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButton_Male))
                            .addComponent(jButton_BackLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SignUp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SignupLayout.createSequentialGroup()
                                .addComponent(jRadioButton_Female)
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel_SignupLayout.createSequentialGroup()
                        .addGroup(jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_FullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_PhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DateOfBirth, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_DateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FullName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_SignupLayout.setVerticalGroup(
            jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SignupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_FullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PhoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DateOfBirth)
                .addGap(2, 2, 2)
                .addComponent(jDateChooser_DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_Female)
                    .addComponent(jRadioButton_Male, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton_BackLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel_Signup);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneNumberActionPerformed

    private void jTextField_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FullNameActionPerformed

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed

    private void jButton_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SignUpActionPerformed
        StringBuffer sb = new StringBuffer();
        Datavalidator.validateEmpty(jTextField_FullName, sb, "H??? v?? t??n kh??ng ???????c ????? tr???ng");
        Datavalidator.validateEmpty(jTextField_PhoneNumber, sb, "S??? ??i???n tho???i kh??ng ???????c ????? tr???ng");
        Datavalidator.validateEmpty(jTextField_Password, sb, "M???t kh???u kh??ng ???????c ????? tr???ng");
        Datavalidator.validateEmpty(jDateChooser_DateOfBirth, sb, "Ng??y sinh kh??ng ???????c ????? tr???ng");
        Datavalidator.validateEmpty(buttonGroup1, sb, "Gi???i t??nh kh??ng ???????c ????? tr???ng");
        if(sb.length() > 0){
            MessageDialog.showErrorDialog(this, "Th??ng b??o", sb.toString());
            return ;
        }
        UserDao dao = new UserDao();
         String genDer = "";
         Enumeration<AbstractButton> btn = buttonGroup1.getElements();
         while(btn.hasMoreElements()){
             AbstractButton b = btn.nextElement();
             if(b.isSelected()) genDer = b.getText();
         }
         try{
             User user = new User();
             user = dao.checkSignUp(jTextField_PhoneNumber.getText());
             if(user != null){
                 MessageDialog.showErrorDialog(this, "T??i kho???n ???? ???????c ????ng k??", "????ng k?? l???i");
             }
             else{
                 dao.Singup(jTextField_PhoneNumber.getText(), jTextField_FullName.getText(), jTextField_Password.getText(), jDateChooser_DateOfBirth.getDate() + "", genDer,"Kh??ch h??ng");
                 MessageDialog.showMessageDialog(this, "????ng k?? th??nh c??ng", "Ho??n th??nh");
             }
         } catch(Exception e){
            e.printStackTrace();
            MessageDialog.showErrorDialog(this, e.getMessage(), "L???i");
        }
    }//GEN-LAST:event_jButton_SignUpActionPerformed

    private void jButton_BackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackLoginActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_BackLoginActionPerformed

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Signup dialog = new Signup(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_BackLogin;
    private javax.swing.JButton jButton_SignUp;
    private com.toedter.calendar.JDateChooser jDateChooser_DateOfBirth;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel_DateOfBirth;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_PhoneNumber;
    private javax.swing.JPanel jPanel_Signup;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JTextField jTextField_FullName;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_PhoneNumber;
    // End of variables declaration//GEN-END:variables
}
