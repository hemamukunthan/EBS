package L1_10_EBS;

import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {
    public Registration() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Register_Label = new javax.swing.JLabel();
        UserID_Label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Contact_Label = new javax.swing.JLabel();
        Address_Label = new javax.swing.JLabel();
        Mail_Label = new javax.swing.JLabel();
        Register_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Gender_Label = new javax.swing.JLabel();
        DOB_Label = new javax.swing.JLabel();
        Address_TF = new javax.swing.JTextField();
        UserID_TF = new javax.swing.JTextField();
        Contact_TF = new javax.swing.JTextField();
        Mail_TF = new javax.swing.JTextField();
        Username_TF = new javax.swing.JTextField();
        Password_TF = new javax.swing.JTextField();
        Password_Label = new javax.swing.JLabel();
        DOB_DateChooser = new com.toedter.calendar.JDateChooser();
        Male_RButton = new javax.swing.JRadioButton();
        Female_RButton = new javax.swing.JRadioButton();
        Meter_Label = new javax.swing.JLabel();
        Meter_TF = new javax.swing.JTextField();
        UserID_Empty = new javax.swing.JLabel();
        Username_Empty = new javax.swing.JLabel();
        Gender_Empty = new javax.swing.JLabel();
        Password_Empty = new javax.swing.JLabel();
        DOB_Empty = new javax.swing.JLabel();
        Address_Empty = new javax.swing.JLabel();
        Contact_Empty = new javax.swing.JLabel();
        Mail_Empty = new javax.swing.JLabel();
        Meter_Empty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 233, 148));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 211, 144), 5, true));

        jPanel2.setBackground(new java.awt.Color(186, 220, 88));

        Register_Label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Register_Label.setText("REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(Register_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Register_Label)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        UserID_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        UserID_Label.setText("User ID:");

        Username_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Username_Label.setText("User name:");

        Contact_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Contact_Label.setText("Contact no:");

        Address_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Address_Label.setText("Address:");

        Mail_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Mail_Label.setText("E-mail ID:");

        Register_Button.setBackground(new java.awt.Color(153, 153, 153));
        Register_Button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Register_Button.setText("REGISTER");
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setBackground(new java.awt.Color(153, 153, 153));
        Cancel_Button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cancel_Button.setText("CANCEL");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        Gender_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Gender_Label.setText("Gender:");

        DOB_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DOB_Label.setText("DOB:");

        Address_TF.setBackground(new java.awt.Color(215, 215, 239));
        Address_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        UserID_TF.setBackground(new java.awt.Color(215, 215, 239));
        UserID_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        UserID_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserID_TFKeyTyped(evt);
            }
        });

        Contact_TF.setBackground(new java.awt.Color(215, 215, 239));
        Contact_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Contact_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Contact_TFKeyTyped(evt);
            }
        });

        Mail_TF.setBackground(new java.awt.Color(215, 215, 239));
        Mail_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Username_TF.setBackground(new java.awt.Color(215, 215, 239));
        Username_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Password_TF.setBackground(new java.awt.Color(215, 215, 239));
        Password_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Password_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Password_Label.setText("Set password:");

        DOB_DateChooser.setBackground(new java.awt.Color(215, 215, 239));
        DOB_DateChooser.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Male_RButton.setBackground(new java.awt.Color(215, 215, 239));
        Male_RButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Male_RButton.setText("Male");
        Male_RButton.setOpaque(false);
        Male_RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Male_RButtonActionPerformed(evt);
            }
        });

        Female_RButton.setBackground(new java.awt.Color(215, 215, 239));
        Female_RButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Female_RButton.setText("Female");
        Female_RButton.setOpaque(false);
        Female_RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Female_RButtonActionPerformed(evt);
            }
        });

        Meter_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Meter_Label.setText("Meter number:");

        Meter_TF.setBackground(new java.awt.Color(215, 215, 239));
        Meter_TF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Meter_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Meter_TFKeyTyped(evt);
            }
        });

        UserID_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserID_Empty.setForeground(new java.awt.Color(255, 0, 0));
        UserID_Empty.setFocusable(false);
        UserID_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        UserID_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Username_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Username_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Username_Empty.setFocusable(false);
        Username_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Username_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Gender_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gender_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Gender_Empty.setFocusable(false);
        Gender_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Gender_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Password_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Password_Empty.setFocusable(false);
        Password_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Password_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        DOB_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DOB_Empty.setForeground(new java.awt.Color(255, 0, 0));
        DOB_Empty.setFocusable(false);
        DOB_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DOB_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Address_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Address_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Address_Empty.setFocusable(false);
        Address_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Address_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Contact_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Contact_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Contact_Empty.setFocusable(false);
        Contact_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Contact_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Mail_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Mail_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Mail_Empty.setFocusable(false);
        Mail_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Mail_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Meter_Empty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Meter_Empty.setForeground(new java.awt.Color(255, 0, 0));
        Meter_Empty.setFocusable(false);
        Meter_Empty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Meter_Empty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Password_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Meter_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Username_Empty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UserID_Empty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserID_Label))
                            .addComponent(Username_Label, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DOB_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DOB_Label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Gender_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Gender_Label))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Mail_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Mail_Label))
                                .addComponent(Meter_Label))
                            .addComponent(Password_Label)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Contact_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Address_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Address_Label))
                                    .addComponent(Contact_Label, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Address_TF)
                            .addComponent(Contact_TF)
                            .addComponent(Mail_TF)
                            .addComponent(DOB_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Meter_TF)
                            .addComponent(UserID_TF)
                            .addComponent(Username_TF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Female_RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Male_RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 98, Short.MAX_VALUE)))
                        .addContainerGap(117, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserID_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UserID_Label)
                        .addComponent(UserID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Username_Label)
                            .addComponent(Username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Password_Label)
                                .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Password_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Gender_Label)
                                .addComponent(Male_RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Female_RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DOB_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DOB_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOB_Label))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Address_Label)
                                    .addComponent(Address_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Contact_Label)
                                        .addComponent(Contact_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Contact_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Address_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mail_Label)
                                    .addComponent(Mail_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Meter_Label)
                                            .addComponent(Meter_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Meter_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Mail_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Username_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
       if(UserID_TF.getText().trim().isEmpty()) {
            UserID_Empty.setText("*");
        }
        if(Username_TF.getText().trim().isEmpty()) {
            Username_Empty.setText("*");
        }
        if(Password_TF.getText().trim().isEmpty()) {
            Password_Empty.setText("*");
        }
        if(Gender.isEmpty()) {
            Gender_Empty.setText("*");
        }
        if(Date.isEmpty()) {
            DOB_Empty.setText("*");
        }
        if(Address_TF.getText().trim().isEmpty()) {
            Address_Empty.setText("*");
        }
        if(Contact_TF.getText().trim().isEmpty()) {
            Contact_Empty.setText("*");
        }
        if(Mail_TF.getText().trim().isEmpty()) {
            Mail_Empty.setText("*");
        }
        if(Meter_TF.getText().trim().isEmpty()) {
            Meter_Empty.setText("*");
        }
        try {
            ID = UserID_TF.getText();
            Name = Username_TF.getText();
            Pass = Password_TF.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date = dateFormat.format(DOB_DateChooser.getDate());
            Add = Address_TF.getText();
            Num = Contact_TF.getText();
            Mail = Mail_TF.getText();
            Meter = Meter_TF.getText();
            
            
            if(ID.length()>3 || ID.length()<3) {
                JOptionPane.showMessageDialog(null, "User ID should be a 3 digit number");
            }
            else if(Num.length()>10 || Num.length()<10) {
                JOptionPane.showMessageDialog(null, "Enter a valid mobile number");
            }
            else {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login", "root", "");
            String sql = "Insert into login_info (User_ID, Username, Password, Gender, DOB, Address, Number, Mail, MeterNo) values(" + "'" + ID + "','" + Name + "','" + Pass + "','" + Gender + "','" + Date + "','" + Add + "','" + Num + "','" + Mail + "','" + Meter + "')";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Welcome to our service!");
            setVisible(false);
            new Welcome().setVisible(true);
            con.close();
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void Female_RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Female_RButtonActionPerformed
        Gender = "Female";
        if(Female_RButton.isSelected()) {
            Male_RButton.setSelected(false);
        }
    }//GEN-LAST:event_Female_RButtonActionPerformed

    private void Male_RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Male_RButtonActionPerformed
       Gender = "Male";
        if(Male_RButton.isSelected()) {
            Female_RButton.setSelected(false);
        }
    }//GEN-LAST:event_Male_RButtonActionPerformed

    private void Contact_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contact_TFKeyTyped
       if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Contact_TFKeyTyped

    private void UserID_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserID_TFKeyTyped
       if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_UserID_TFKeyTyped

    private void Meter_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Meter_TFKeyTyped
       if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Meter_TFKeyTyped

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_Empty;
    private javax.swing.JLabel Address_Label;
    private javax.swing.JTextField Address_TF;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel Contact_Empty;
    private javax.swing.JLabel Contact_Label;
    private javax.swing.JTextField Contact_TF;
    private com.toedter.calendar.JDateChooser DOB_DateChooser;
    private javax.swing.JLabel DOB_Empty;
    private javax.swing.JLabel DOB_Label;
    private javax.swing.JRadioButton Female_RButton;
    private javax.swing.JLabel Gender_Empty;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JLabel Mail_Empty;
    private javax.swing.JLabel Mail_Label;
    private javax.swing.JTextField Mail_TF;
    private javax.swing.JRadioButton Male_RButton;
    private javax.swing.JLabel Meter_Empty;
    private javax.swing.JLabel Meter_Label;
    private javax.swing.JTextField Meter_TF;
    private javax.swing.JLabel Password_Empty;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JTextField Password_TF;
    private javax.swing.JButton Register_Button;
    private javax.swing.JLabel Register_Label;
    private javax.swing.JLabel UserID_Empty;
    private javax.swing.JLabel UserID_Label;
    private javax.swing.JTextField UserID_TF;
    private javax.swing.JLabel Username_Empty;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JTextField Username_TF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
private String ID = "", Name = "", Pass = "", Gender = "", Date = "", Add = "", Num = "", Mail = "", Meter = "";
}