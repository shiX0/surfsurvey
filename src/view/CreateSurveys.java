package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import database.Dbconnection;
/**
 *
 * @author EGT
 */
public class CreateSurveys extends javax.swing.JFrame {

  
    /**
     * Creates new form myframe
     */
    public CreateSurveys() {
        initComponents();
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
         jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
         jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        jLabel1.setText("Question no.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 80, 80, 20);

        jTextField1.setText("Enter the  Question");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(70, 130, 320, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 380, 120, 40);

        jLabel2.setText("Suevey Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 40, 80, 20);

        jLabel3.setText("00");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 80, 37, 16);

        jLabel4.setText("Survey");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 40, 50, 20);

        jLabel5.setText("Question:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 110, 80, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one", "Radio Button", "Rating", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(70, 190, 110, 20);

        jLabel6.setText("Response type:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 170, 110, 20);

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 380, 120, 40);

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setText("next question");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(190, 380, 120, 40);

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(290, 270, 170, 30);

        jTextField3.setText("jTextField2");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(70, 220, 170, 30);

        jButton6.setText("2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(140, 250, 60, 50);

        jTextField5.setText("jTextField2");
        jPanel1.add(jTextField5);
        jTextField5.setBounds(290, 220, 170, 30);

        jButton5.setText("1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(70, 250, 60, 50);

        jButton4.setText("5");
        jPanel1.add(jButton4);
        jButton4.setBounds(360, 250, 60, 50);

        jButton7.setText("3");
        jPanel1.add(jButton7);
        jButton7.setBounds(210, 250, 60, 50);

        jTextField4.setText("jTextField2");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(70, 270, 170, 30);

        jButton8.setText("4");
        jPanel1.add(jButton8);
        jButton8.setBounds(280, 250, 60, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       int Qid=0;
       String Sname = jLabel4.getText();
       String Question = jTextField1.getText();
       String option1 = jTextField2.getText();
       String option2 = jTextField3.getText();
       String option3 = jTextField4.getText();
       String option4 = jTextField5.getText();
       String selectedbar=jComboBox1.getSelectedItem().toString();
       
       String inquery=String.format("Insert into questions (surveyname,question_id,responce,question,option1,option2,option3, option4) values ('%s',%d,'%s','%s','%s','%s','%s','%s')", Sname,Qid,selectedbar,Question,option1,option2,option3,option4);
       Dbconnection dbconnection = new Dbconnection();
        int out = dbconnection.manipulate(inquery);
        System.out.println(out);
        Qid++;
        jLabel3.setText(String.valueOf(Qid));
        jTextField1.setText("Enter the question");
        jTextField2.setText("option1");
        jTextField3.setText("option2");
        jTextField4.setText("option3");
        jTextField5.setText("option4");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("Enter the question");
        jTextField2.setText("option1");
        jTextField3.setText("option2");
        jTextField4.setText("option3");
        jTextField5.setText("option4");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selected=jComboBox1.getSelectedItem().toString();
        if(selected.equals("Choose one")){
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
         jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
         jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        }
        else if(selected.equals("Radio Button")){
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
         jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
         jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        }
        else if(selected.equals("Rating")){
            jButton4.setVisible(true);
        jButton5.setVisible(true);
         jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
         jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateSurveys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSurveys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSurveys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSurveys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSurveys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
