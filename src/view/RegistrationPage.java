/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserController;
import javax.swing.JOptionPane;
import model.UserModel;

/**
 *
 * @author ACER
 */
public class RegistrationPage extends javax.swing.JFrame {

    /**
     * Creates new form test2
     */
    public RegistrationPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        uPassword = new javax.swing.JPasswordField();
        uDob = new javax.swing.JTextField();
        cPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        fName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fName1 = new javax.swing.JTextField();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 90, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 125, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DOB");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 55, -1));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 125, -1));

        lName.setBackground(new java.awt.Color(0, 0, 0));
        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 200, 30));

        uPassword.setBackground(new java.awt.Color(0, 0, 0));
        uPassword.setForeground(new java.awt.Color(255, 255, 255));
        uPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        uPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(uPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 200, 30));

        uDob.setBackground(new java.awt.Color(0, 0, 0));
        uDob.setForeground(new java.awt.Color(255, 255, 255));
        uDob.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        uDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uDobActionPerformed(evt);
            }
        });
        getContentPane().add(uDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 200, 30));

        cPassword.setBackground(new java.awt.Color(0, 0, 0));
        cPassword.setForeground(new java.awt.Color(255, 255, 255));
        cPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 255, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(cPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 200, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 51));
        jButton1.setText("Sign Up");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 102), new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 150, 60));

        fName.setBackground(new java.awt.Color(0, 0, 0));
        fName.setForeground(new java.awt.Color(255, 255, 255));
        fName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        getContentPane().add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\Pictures\\Saved Pictures\\Frame 2.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -30, 230, 160));

        uEmail.setBackground(new java.awt.Color(0, 0, 0));
        uEmail.setForeground(new java.awt.Color(255, 255, 255));
        uEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(uEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 210, 40));

        jLabel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\Pictures\\Saved Pictures\\Desktop - 6.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 630));

        fName1.setBackground(new java.awt.Color(0, 0, 0));
        fName1.setForeground(new java.awt.Color(255, 255, 255));
        fName1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        fName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fName1ActionPerformed(evt);
            }
        });
        getContentPane().add(fName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uDobActionPerformed

    private void uPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        String firstName = fName.getText();
        String lastName = lName.getText();
        String email = uEmail.getText();
        String dob = uDob.getText();
        String passwordd = uPassword.getText();
        String confirmPass = cPassword.getText();
        
        if (firstName.equals("")|| lastName.equals("")|| email.equals("")|| dob.equals("")){
            JOptionPane.showMessageDialog(this,"empty field not accepted!!", "error",JOptionPane.ERROR_MESSAGE);
                  
        }
        else{
            
            
            
        
        
        if(passwordd.equals(confirmPass)){
            UserModel user= new UserModel(firstName,lastName,email,dob,passwordd);
            UserController uc= new UserController();
            uc.insertUser(user); 
        }
        else{
            JOptionPane.showMessageDialog(this,"password and confirm passoword do not match!!", "error",JOptionPane.ERROR_MESSAGE);
            
            
        }
        
        
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void fName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fName1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField fName1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField uDob;
    private javax.swing.JTextField uEmail;
    private javax.swing.JPasswordField uPassword;
    // End of variables declaration//GEN-END:variables
}