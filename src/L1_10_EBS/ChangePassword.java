package L1_10_EBS;

import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {

    public ChangePassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public ChangePassword(String UserID) {
        initComponents();
        setLocationRelativeTo(null);
        ID = UserID;
        UserID_TFL.setText(UserID);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserID_Label = new javax.swing.JLabel();
        CP_Label = new javax.swing.JLabel();
        NewPass_Label = new javax.swing.JLabel();
        Change_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Password_TF = new javax.swing.JPasswordField();
        Password_Empty = new javax.swing.JLabel();
        UserID_TFL = new javax.swing.JLabel();
        ConPass_Label = new javax.swing.JLabel();
        ConfirmP_Empty = new javax.swing.JLabel();
        ConfirmP_TF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserID_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UserID_Label.setText("User ID:");

        CP_Label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        CP_Label.setText("PASSWORD CHANGING");

        NewPass_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NewPass_Label.setText("New password:");

        Change_Button.setBackground(new java.awt.Color(153, 153, 153));
        Change_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Change_Button.setText("CHANGE");
        Change_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setBackground(new java.awt.Color(153, 153, 153));
        Cancel_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel_Button.setText("CANCEL");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        Password_TF.setBackground(new java.awt.Color(215, 215, 239));
        Password_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Password_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Password_Empty.setToolTipText("");
        Password_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Password_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        UserID_TFL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        ConPass_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConPass_Label.setText("Confirm password:");

        ConfirmP_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ConfirmP_Empty.setForeground(new java.awt.Color(255, 0, 0));
        ConfirmP_Empty.setToolTipText("");
        ConfirmP_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ConfirmP_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ConfirmP_TF.setBackground(new java.awt.Color(215, 215, 239));
        ConfirmP_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancel_Button)
                .addGap(42, 42, 42)
                .addComponent(Change_Button)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CP_Label)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Password_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewPass_Label))
                            .addComponent(UserID_Label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ConfirmP_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConPass_Label)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserID_TFL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmP_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CP_Label)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserID_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password_Empty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewPass_Label)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmP_Empty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ConPass_Label)
                        .addComponent(ConfirmP_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Change_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void Change_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_ButtonActionPerformed
        if(Password_TF.getText().trim().isEmpty() && ConfirmP_TF.getText().trim().isEmpty()) {
            Password_Empty.setText("*");
            ConfirmP_Empty.setText("*");
        }
        if(ConfirmP_TF.getText().trim().isEmpty()) {
            ConfirmP_Empty.setText("*");
        }
        if(Password_TF.getText().trim().isEmpty()) {
            Password_Empty.setText("*");
        }
        else {
        try {
            String Pass = Password_TF.getText().toString();
            String Conf = ConfirmP_TF.getText().toString();
            if(Pass.equals(Conf)) {
            String sql = "Select * from login_info where User_ID='" + ID + "'";
            String sql1 = "Update login_info set Password ='" + Pass + "'where User_ID='" + ID + "'";
            
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                st.executeUpdate(sql1);
                JOptionPane.showMessageDialog(null, "Password updated successfully");
                setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Sorry, Update failed");
                Password_TF.setText("");
                ConfirmP_TF.setText("");
            }
            con.close();
            }
            else {
                JOptionPane.showMessageDialog(null, "New password and confirm password does not match!");
                Password_TF.setText("");
                ConfirmP_TF.setText("");
            }
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_Change_ButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CP_Label;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton Change_Button;
    private javax.swing.JLabel ConPass_Label;
    private javax.swing.JLabel ConfirmP_Empty;
    private javax.swing.JPasswordField ConfirmP_TF;
    private javax.swing.JLabel NewPass_Label;
    private javax.swing.JLabel Password_Empty;
    private javax.swing.JPasswordField Password_TF;
    private javax.swing.JLabel UserID_Label;
    private javax.swing.JLabel UserID_TFL;
    // End of variables declaration//GEN-END:variables
private String ID;
}