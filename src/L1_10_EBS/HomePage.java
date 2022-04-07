package L1_10_EBS;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public HomePage(String UserID) {
        initComponents();
        setLocationRelativeTo(null);
        ID = UserID;
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login", "root", "");
            String sql = "Select Username, MeterNo, J_unit, J_Amt from login_info where User_ID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, UserID);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                UserID_TFL.setText(UserID);
                String User = rs.getString(1);
                Username_TFL.setText(User);
                String Meter = rs.getString(2);
                Meter_TFL.setText(Meter);
                String Unit = rs.getString(3);
                if(Unit==null) {
                    Unit = "Not available";
                }
                Unit_TFL.setText(Unit);
                String AMT;
                if(Unit=="Not available") {
                    AMT = Unit;
                }
                else {
                int unit = Integer.parseInt(Unit);
                double amt;
                if(unit<=100) {
                    amt = 0;
                }
                else if(unit>100 && unit<=200) {
                    amt = unit * 3;
                }
                else if(unit>200 && unit<=350) {
                    amt = unit * 4.50;
                }
                else if(unit>350 && unit <500) {
                    amt = unit * 6;
                }
                else {
                    amt = unit * 8.50;
                }
                AMT = "Rs. " + Double.toString(amt);
                }
                amount = AMT;
                Bill_TFL.setText(AMT);
                String stat = rs.getString(4);
                Status = (stat==null) ? "NOT PAID" : "PAID";
                Status_TFL.setText(Status);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        EBS_Label = new javax.swing.JLabel();
        Print_Panel = new javax.swing.JPanel();
        UserID_Label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Meter_Label = new javax.swing.JLabel();
        Unit_Label = new javax.swing.JLabel();
        Bill_Label = new javax.swing.JLabel();
        Status_Label = new javax.swing.JLabel();
        Status_TFL = new javax.swing.JLabel();
        Bill_TFL = new javax.swing.JLabel();
        Unit_TFL = new javax.swing.JLabel();
        Meter_TFL = new javax.swing.JLabel();
        Username_TFL = new javax.swing.JLabel();
        UserID_TFL = new javax.swing.JLabel();
        Pay_Button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Home_Menu = new javax.swing.JMenu();
        Home_MI = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Logout_MI = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Exit_MI = new javax.swing.JMenuItem();
        Edit_Menu = new javax.swing.JMenu();
        ChanPass_MI = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 233, 148));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 211, 144), 5, true));

        jPanel2.setBackground(new java.awt.Color(186, 220, 88));
        jPanel2.setPreferredSize(new java.awt.Dimension(880, 158));

        EBS_Label.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        EBS_Label.setText("ELECTRICITY BILLING SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EBS_Label)
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(EBS_Label)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Print_Panel.setBackground(new java.awt.Color(189, 197, 129));

        UserID_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        UserID_Label.setText("User ID:");

        Username_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Username_Label.setText("Username:");

        Meter_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Meter_Label.setText("Meter no:");

        Unit_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Unit_Label.setText("No of units:");

        Bill_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Bill_Label.setText("Bill amt:");

        Status_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Status_Label.setText("Status:");

        Status_TFL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        Bill_TFL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        Unit_TFL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        Meter_TFL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        Username_TFL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        UserID_TFL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout Print_PanelLayout = new javax.swing.GroupLayout(Print_Panel);
        Print_Panel.setLayout(Print_PanelLayout);
        Print_PanelLayout.setHorizontalGroup(
            Print_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Print_PanelLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(Print_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Meter_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Unit_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bill_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Status_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Username_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserID_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(Print_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Meter_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Unit_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bill_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        Print_PanelLayout.setVerticalGroup(
            Print_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Print_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Print_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Print_PanelLayout.createSequentialGroup()
                        .addComponent(UserID_Label)
                        .addGap(23, 23, 23)
                        .addComponent(Username_Label)
                        .addGap(23, 23, 23)
                        .addComponent(Meter_Label)
                        .addGap(23, 23, 23)
                        .addComponent(Unit_Label)
                        .addGap(23, 23, 23)
                        .addComponent(Bill_Label)
                        .addGap(23, 23, 23)
                        .addComponent(Status_Label)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Print_PanelLayout.createSequentialGroup()
                        .addComponent(UserID_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Username_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Meter_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Unit_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bill_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Status_TFL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );

        Pay_Button.setBackground(new java.awt.Color(153, 153, 153));
        Pay_Button.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Pay_Button.setText("PAY BILL");
        Pay_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Print_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Pay_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(370, 370, 370))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Print_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Pay_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        Edit_Menu.add(jSeparator3);

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

    private void ChanPass_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChanPass_MIActionPerformed
        new ChangePassword(ID).setVisible(true);
    }//GEN-LAST:event_ChanPass_MIActionPerformed

    private void Logout_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_MIActionPerformed
        setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_Logout_MIActionPerformed

    private void Exit_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_MIActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Exit_MIActionPerformed

    private void Pay_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pay_ButtonActionPerformed
        if(Status=="PAID") {
            JOptionPane.showMessageDialog(null, "Already paid!");
        }
        else {
            setVisible(false);
            new Payment(ID, amount).setVisible(true);
        }
    }//GEN-LAST:event_Pay_ButtonActionPerformed

    
    private void Home_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_MIActionPerformed
        setVisible(true);
    }//GEN-LAST:event_Home_MIActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bill_Label;
    private javax.swing.JLabel Bill_TFL;
    private javax.swing.JMenuItem ChanPass_MI;
    private javax.swing.JLabel EBS_Label;
    private javax.swing.JMenu Edit_Menu;
    private javax.swing.JMenuItem Exit_MI;
    private javax.swing.JMenuItem Home_MI;
    private javax.swing.JMenu Home_Menu;
    private javax.swing.JMenuItem Logout_MI;
    private javax.swing.JLabel Meter_Label;
    private javax.swing.JLabel Meter_TFL;
    private javax.swing.JButton Pay_Button;
    private javax.swing.JPanel Print_Panel;
    private javax.swing.JLabel Status_Label;
    private javax.swing.JLabel Status_TFL;
    private javax.swing.JLabel Unit_Label;
    private javax.swing.JLabel Unit_TFL;
    private javax.swing.JLabel UserID_Label;
    private javax.swing.JLabel UserID_TFL;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JLabel Username_TFL;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
private String ID, amount, Status;
}
