package L1_10_EBS;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class Payment extends javax.swing.JFrame {

    public Payment() {
        initComponents();
    }

    public Payment(String UserID, String AMT) {
        initComponents();
        setLocationRelativeTo(null);
        ID = UserID;
        Amount = AMT;
        Amount_TF.setText(AMT);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        EBS_Label = new javax.swing.JLabel();
        CCV_Label = new javax.swing.JLabel();
        CardNo_Label = new javax.swing.JLabel();
        Amount_Label = new javax.swing.JLabel();
        ExpiryM_Label = new javax.swing.JLabel();
        CardNo_TF = new javax.swing.JTextField();
        CCV_TF = new javax.swing.JTextField();
        Amount_TF = new javax.swing.JLabel();
        Confirm_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        CardNo_EW = new javax.swing.JLabel();
        CCV_EW = new javax.swing.JLabel();
        Month_Spinner = new javax.swing.JSpinner();
        Year_Spinner = new javax.swing.JSpinner();
        ExpiryY_Label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Home_Menu = new javax.swing.JMenu();
        Home_MI = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Logout_MI = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Exit_MI = new javax.swing.JMenuItem();
        Edit_Menu = new javax.swing.JMenu();
        ChanPass_MI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 233, 148));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 211, 144), 5, true));

        jPanel2.setBackground(new java.awt.Color(186, 220, 88));

        EBS_Label.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        EBS_Label.setText("BILL PAYMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EBS_Label)
                .addGap(339, 339, 339))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(EBS_Label)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        CCV_Label.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        CCV_Label.setText("CCV:");

        CardNo_Label.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        CardNo_Label.setText("Card number:");

        Amount_Label.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        Amount_Label.setText("Amount:");

        ExpiryM_Label.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ExpiryM_Label.setText("Expiry month:");

        CardNo_TF.setBackground(new java.awt.Color(215, 215, 239));
        CardNo_TF.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        CardNo_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CardNo_TFKeyTyped(evt);
            }
        });

        CCV_TF.setBackground(new java.awt.Color(215, 215, 239));
        CCV_TF.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        CCV_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CCV_TFKeyTyped(evt);
            }
        });

        Amount_TF.setBackground(new java.awt.Color(215, 215, 239));
        Amount_TF.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N

        Confirm_Button.setBackground(new java.awt.Color(153, 153, 153));
        Confirm_Button.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Confirm_Button.setText("CONFIRM");
        Confirm_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setBackground(new java.awt.Color(153, 153, 153));
        Cancel_Button.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Cancel_Button.setText("CANCEL");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        CardNo_EW.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        CCV_EW.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Month_Spinner.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        Month_Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        Month_Spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Month_SpinnerStateChanged(evt);
            }
        });

        Year_Spinner.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        Year_Spinner.setModel(new javax.swing.SpinnerNumberModel(21, 21, 45, 1));
        Year_Spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Year_SpinnerStateChanged(evt);
            }
        });

        ExpiryY_Label.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ExpiryY_Label.setText("Expiry year:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(Cancel_Button)
                        .addGap(59, 59, 59)
                        .addComponent(Confirm_Button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExpiryM_Label)
                            .addComponent(CardNo_Label)
                            .addComponent(CCV_Label)
                            .addComponent(Amount_Label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CCV_EW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CardNo_EW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CCV_TF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Month_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(ExpiryY_Label)
                                .addGap(18, 18, 18)
                                .addComponent(Year_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CardNo_TF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Amount_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardNo_Label)
                    .addComponent(CardNo_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CardNo_EW, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Month_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExpiryM_Label)
                    .addComponent(Year_Spinner)
                    .addComponent(ExpiryY_Label))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCV_Label)
                    .addComponent(CCV_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CCV_EW, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Amount_Label)
                    .addComponent(Amount_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jMenuBar1.setBackground(new java.awt.Color(250, 211, 144));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(157, 50));

        Home_Menu.setText("HOME ");
        Home_Menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Home_MI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home_MI.setText("Home Page");
        Home_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_MIActionPerformed(evt);
            }
        });
        Home_Menu.add(Home_MI);
        Home_Menu.add(jSeparator1);

        Logout_MI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Logout_MI.setText("Logout");
        Logout_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_MIActionPerformed(evt);
            }
        });
        Home_Menu.add(Logout_MI);
        Home_Menu.add(jSeparator4);

        Exit_MI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Exit_MI.setText("Exit");
        Exit_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_MIActionPerformed(evt);
            }
        });
        Home_Menu.add(Exit_MI);

        jMenuBar1.add(Home_Menu);

        Edit_Menu.setText("EDIT");
        Edit_Menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        ChanPass_MI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ChanPass_MI.setText("Change password");
        ChanPass_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChanPass_MIActionPerformed(evt);
            }
        });
        Edit_Menu.add(ChanPass_MI);

        jMenuBar1.add(Edit_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_MIActionPerformed
        setVisible(false);
        new HomePage(ID).setVisible(true);
    }//GEN-LAST:event_Home_MIActionPerformed

    private void Logout_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_MIActionPerformed
        setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_Logout_MIActionPerformed

    private void Exit_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_MIActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Exit_MIActionPerformed

    private void ChanPass_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChanPass_MIActionPerformed
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_ChanPass_MIActionPerformed

    private void Confirm_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_ButtonActionPerformed
       String card = CardNo_TF.getText().toString();
        String ccv = CCV_TF.getText().toString();
        if(card.length()!=16 && ccv.length()!=3) {
            CardNo_EW.setText("Enter valid card number");
            CCV_EW.setText("Enter valid CCV");
        }
        else if(card.length()!=16) {
            CardNo_EW.setText("Enter valid card number");
        }
        else if(ccv.length()!=3) {
            CCV_EW.setText("Enter valid CCV");
        }
        else if(Month<=6 && Year<=21) {
            JOptionPane.showMessageDialog(null, "You cannot pay as your card expired");
        }
        else {
            try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login", "root", "");
            String sql = "Update login_info set J_Amt=? where User_ID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Amount);
            pst.setString(2, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Payment success!");
            setVisible(false);
            new HomePage(ID).setVisible(true);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } 
    }//GEN-LAST:event_Confirm_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        setVisible(false);
        new HomePage(ID).setVisible(true);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void Month_SpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Month_SpinnerStateChanged
       Month = (int) ((JSpinner)evt.getSource()).getValue();
    }//GEN-LAST:event_Month_SpinnerStateChanged

    private void Year_SpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Year_SpinnerStateChanged
        Year = (int) ((JSpinner)evt.getSource()).getValue();
    }//GEN-LAST:event_Year_SpinnerStateChanged

    private void CardNo_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CardNo_TFKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_CardNo_TFKeyTyped

    private void CCV_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CCV_TFKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_CCV_TFKeyTyped

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount_Label;
    private javax.swing.JLabel Amount_TF;
    private javax.swing.JLabel CCV_EW;
    private javax.swing.JLabel CCV_Label;
    private javax.swing.JTextField CCV_TF;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel CardNo_EW;
    private javax.swing.JLabel CardNo_Label;
    private javax.swing.JTextField CardNo_TF;
    private javax.swing.JMenuItem ChanPass_MI;
    private javax.swing.JButton Confirm_Button;
    private javax.swing.JLabel EBS_Label;
    private javax.swing.JMenu Edit_Menu;
    private javax.swing.JMenuItem Exit_MI;
    private javax.swing.JLabel ExpiryM_Label;
    private javax.swing.JLabel ExpiryY_Label;
    private javax.swing.JMenuItem Home_MI;
    private javax.swing.JMenu Home_Menu;
    private javax.swing.JMenuItem Logout_MI;
    private javax.swing.JSpinner Month_Spinner;
    private javax.swing.JSpinner Year_Spinner;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
private String ID, Amount="Not available";
private int Month = 1, Year = 2021;
}