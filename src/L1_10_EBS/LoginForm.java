package L1_10_EBS;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        UserID_TF = new javax.swing.JTextField();
        Password_TF = new javax.swing.JPasswordField();
        UserID_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        ForPass_Button = new javax.swing.JButton();
        UserID_Empty = new javax.swing.JLabel();
        Password_Empty = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Login_Label = new javax.swing.JLabel();
        Cancel_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(184, 233, 148));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 211, 144), 5, true));

        Panel1.setBackground(new java.awt.Color(189, 197, 129));
        Panel1.setPreferredSize(new java.awt.Dimension(750, 500));

        UserID_TF.setBackground(new java.awt.Color(215, 215, 239));
        UserID_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UserID_TF.setPreferredSize(new java.awt.Dimension(80, 25));
        UserID_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserID_TFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserID_TFKeyTyped(evt);
            }
        });

        Password_TF.setBackground(new java.awt.Color(215, 215, 239));
        Password_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Password_TF.setPreferredSize(new java.awt.Dimension(80, 25));
        Password_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Password_TFKeyReleased(evt);
            }
        });

        UserID_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UserID_Label.setText("User ID:");

        Password_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Password_Label.setText("Password:");

        Login_Button.setBackground(new java.awt.Color(153, 153, 153));
        Login_Button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Login_Button.setText("LOGIN");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        ForPass_Button.setBackground(new java.awt.Color(153, 153, 153));
        ForPass_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ForPass_Button.setText("Forgot password");
        ForPass_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForPass_ButtonActionPerformed(evt);
            }
        });

        UserID_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserID_Empty.setForeground(new java.awt.Color(255, 0, 51));
        UserID_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        UserID_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Password_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password_Empty.setForeground(new java.awt.Color(255, 0, 51));
        Password_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Password_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(UserID_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserID_Label))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(Password_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password_Label))
                    .addComponent(ForPass_Button))
                .addGap(30, 30, 30)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserID_Label)
                            .addComponent(UserID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UserID_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Password_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(ForPass_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.setBackground(new java.awt.Color(186, 220, 88));

        Login_Label.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Login_Label.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(Login_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(Login_Label)
                .addGap(48, 48, 48))
        );

        Cancel_Button.setBackground(new java.awt.Color(153, 153, 153));
        Cancel_Button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cancel_Button.setText("CANCEL");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Welcome to our services!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("Login to pay");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("your bill easily!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        if(UserID_TF.getText().trim().isEmpty() && Password_TF.getText().trim().isEmpty()) {
            UserID_Empty.setText("*");
            Password_Empty.setText("*");
        }
        else if(UserID_TF.getText().trim().isEmpty()) {
            UserID_Empty.setText("*");
        }
        else if(Password_TF.getText().trim().isEmpty()) {
            Password_Empty.setText("*");
        }
        else {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login", "root", "");
            String sql = "Select * from login_info where User_ID=? and Password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            String x = UserID_TF.getText();
            pst.setString(1, x);
            pst.setString(2, Password_TF.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "You have successfully logged in!");
                new HomePage(x).setVisible(true);
                setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "User ID and password not matched!");
                UserID_TF.setText("");
                Password_TF.setText("");
            }
            con.close();
            
            }
            
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void UserID_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserID_TFKeyReleased
        UserID_Empty.setText("");
    }//GEN-LAST:event_UserID_TFKeyReleased

    private void Password_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password_TFKeyReleased
        Password_Empty.setText("");
    }//GEN-LAST:event_Password_TFKeyReleased

    private void ForPass_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForPass_ButtonActionPerformed
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_ForPass_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void UserID_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserID_TFKeyTyped
      if(Character.isDigit(evt.getKeyChar())) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_UserID_TFKeyTyped

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton ForPass_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel Login_Label;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel Password_Empty;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JPasswordField Password_TF;
    private javax.swing.JLabel UserID_Empty;
    private javax.swing.JLabel UserID_Label;
    private javax.swing.JTextField UserID_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}