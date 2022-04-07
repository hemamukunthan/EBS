package L1_10_EBS;

import java.sql.*;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserID_Label = new javax.swing.JLabel();
        Contact_Label = new javax.swing.JLabel();
        Click_Button = new javax.swing.JButton();
        UserID_TF = new javax.swing.JTextField();
        Password_Label = new javax.swing.JLabel();
        Contact_TF = new javax.swing.JTextField();
        Contact_Empty = new javax.swing.JLabel();
        UserID_Empty = new javax.swing.JLabel();
        Done_Button = new javax.swing.JButton();
        Password_TF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserID_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UserID_Label.setText("User ID:");

        Contact_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contact_Label.setText("Registered contact no:");

        Click_Button.setBackground(new java.awt.Color(153, 153, 153));
        Click_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Click_Button.setText("CLICK");
        Click_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Click_ButtonActionPerformed(evt);
            }
        });

        UserID_TF.setBackground(new java.awt.Color(215, 215, 239));
        UserID_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UserID_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserID_TFKeyTyped(evt);
            }
        });

        Password_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Password_Label.setText("Password:");

        Contact_TF.setBackground(new java.awt.Color(215, 215, 239));
        Contact_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contact_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Contact_TFKeyTyped(evt);
            }
        });

        Contact_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Contact_Empty.setForeground(new java.awt.Color(250, 0, 50));
        Contact_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Contact_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        UserID_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserID_Empty.setForeground(new java.awt.Color(250, 0, 50));
        UserID_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        UserID_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Done_Button.setBackground(new java.awt.Color(153, 153, 153));
        Done_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Done_Button.setText("DONE");
        Done_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_ButtonActionPerformed(evt);
            }
        });

        Password_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contact_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact_Label))
                    .addComponent(Password_Label)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserID_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserID_Label)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Click_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(UserID_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(Contact_TF)
                    .addComponent(Password_TF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Done_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserID_Label)
                    .addComponent(UserID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_Label)
                    .addComponent(Contact_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Click_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Label))
                .addGap(18, 18, 18)
                .addComponent(Done_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Click_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Click_ButtonActionPerformed
        if(UserID_TF.getText().trim().isEmpty() && Contact_TF.getText().trim().isEmpty()) {
            UserID_Empty.setText("*");
            Contact_Empty.setText("*");
        }
        else if(UserID_TF.getText().trim().isEmpty()) {
            UserID_Empty.setText("*");
        }
        else if(Contact_TF.getText().trim().isEmpty()) {
            Contact_Empty.setText("*");
        }
        else {
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login", "root", "");
            String sql = "Select Password from login_info where User_ID=? and Number=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, UserID_TF.getText());
            pst.setString(2, Contact_TF.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                String Pass = rs.getString(1);
                Password_TF.setText(Pass);
            }
            else {
                JOptionPane.showMessageDialog(null, "User ID and registered number does not match");
                UserID_TF.setText("");
                Contact_TF.setText("");
            }
            con.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_Click_ButtonActionPerformed

    private void Done_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_ButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Done_ButtonActionPerformed

    private void UserID_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserID_TFKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_UserID_TFKeyTyped

    private void Contact_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contact_TFKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Contact_TFKeyTyped

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Click_Button;
    private javax.swing.JLabel Contact_Empty;
    private javax.swing.JLabel Contact_Label;
    private javax.swing.JTextField Contact_TF;
    private javax.swing.JButton Done_Button;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JLabel Password_TF;
    private javax.swing.JLabel UserID_Empty;
    private javax.swing.JLabel UserID_Label;
    private javax.swing.JTextField UserID_TF;
    // End of variables declaration//GEN-END:variables
}
