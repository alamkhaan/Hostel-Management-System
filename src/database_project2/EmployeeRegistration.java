/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import javax.swing.JFileChooser;
import java.io.File;      
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author SARK
 */
public class EmployeeRegistration extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeRegistration
     */
    String AdminId;
    public EmployeeRegistration() {
        initComponents();
    }
    
    public EmployeeRegistration(String AdminId) {
        this.AdminId  =AdminId;
        initComponents();
        footerName.setOpaque(true);
        footerFathersName.setOpaque(true);
        footerMothersName.setOpaque(true);
        footerEmail.setOpaque(true);
        footerContact.setOpaque(true);
        footerAddress.setOpaque(true);
        footerGContact.setOpaque(true);
        footerSalary.setOpaque(true);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dateOfBirth.getDateEditor();editor.setEnabled(false);
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
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        fathersName = new javax.swing.JTextField();
        mothersName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        gContactNo = new javax.swing.JTextField();
        addImageButton = new javax.swing.JButton();
        bloodGroup = new javax.swing.JComboBox<>();
        post = new javax.swing.JComboBox<>();
        footerFathersName = new javax.swing.JLabel();
        footerName = new javax.swing.JLabel();
        footerMothersName = new javax.swing.JLabel();
        footerEmail = new javax.swing.JLabel();
        footerContact = new javax.swing.JLabel();
        footerAddress = new javax.swing.JLabel();
        footerGContact = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        footerSalary = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        setPreferredSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setText("Employee Registration");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backButton)
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addContainerGap(477, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mother's Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Contact No:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date of Birth:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Blood Group:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Father's Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 30));

        jLabel9.setText("Post:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Guardian Contact No:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Name:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));

        image.setBackground(new java.awt.Color(102, 102, 102));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/DSC_0335.jpg"))); // NOI18N
        image.setText("Image");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 120, 120));

        fathersName.setPreferredSize(new java.awt.Dimension(59, 27));
        fathersName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fathersNameKeyTyped(evt);
            }
        });
        getContentPane().add(fathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 190, 30));

        mothersName.setPreferredSize(new java.awt.Dimension(59, 27));
        mothersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mothersNameActionPerformed(evt);
            }
        });
        mothersName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mothersNameKeyTyped(evt);
            }
        });
        getContentPane().add(mothersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 30));

        email.setPreferredSize(new java.awt.Dimension(59, 27));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, 30));

        contactNo.setPreferredSize(new java.awt.Dimension(59, 27));
        contactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactNoKeyTyped(evt);
            }
        });
        getContentPane().add(contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 190, 30));

        dateOfBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateOfBirthKeyTyped(evt);
            }
        });
        getContentPane().add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, 30));

        address.setColumns(20);
        address.setRows(5);
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 190, 60));

        name.setPreferredSize(new java.awt.Dimension(59, 27));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 190, 30));

        gContactNo.setPreferredSize(new java.awt.Dimension(59, 27));
        gContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gContactNoKeyTyped(evt);
            }
        });
        getContentPane().add(gContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 190, 30));

        addImageButton.setText("Add Image");
        addImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 100, 20));

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 190, 30));

        post.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Accountant", "Cook", "Cleaner", "Others" }));
        getContentPane().add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 190, 30));

        footerFathersName.setBackground(new java.awt.Color(255, 0, 0));
        footerFathersName.setText("Fathers Name is Empty");
        getContentPane().add(footerFathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, 13));

        footerName.setBackground(new java.awt.Color(255, 0, 0));
        footerName.setText("Name is Empty");
        getContentPane().add(footerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 190, 13));

        footerMothersName.setBackground(new java.awt.Color(255, 0, 0));
        footerMothersName.setText("Mothers Name is Empty");
        getContentPane().add(footerMothersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 190, 13));

        footerEmail.setBackground(new java.awt.Color(255, 0, 0));
        footerEmail.setText("Email is not valid");
        getContentPane().add(footerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 190, 13));

        footerContact.setBackground(new java.awt.Color(255, 0, 0));
        footerContact.setText("Contact No. is Empty");
        getContentPane().add(footerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 190, 13));

        footerAddress.setBackground(new java.awt.Color(255, 0, 0));
        footerAddress.setText("Address is Empty");
        getContentPane().add(footerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 190, 13));

        footerGContact.setBackground(new java.awt.Color(255, 0, 0));
        footerGContact.setText("Guardian Contact No is Empty");
        getContentPane().add(footerGContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 190, 13));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Salary");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 110, 30));

        salary.setPreferredSize(new java.awt.Dimension(59, 27));
        salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryKeyTyped(evt);
            }
        });
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 190, 30));

        footerSalary.setBackground(new java.awt.Color(255, 0, 0));
        footerSalary.setText("Salary is Empty");
        getContentPane().add(footerSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 190, 13));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));

        submitButton.setText("Submit");
        submitButton.setBackground(new java.awt.Color(51, 204, 255));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.setBackground(new java.awt.Color(255, 51, 51));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addGap(54, 54, 54)
                .addComponent(submitButton)
                .addGap(467, 467, 467))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(resetButton))
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Employee(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void fathersNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fathersNameKeyTyped
        if(fathersName.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerFathersName.setVisible(true);
        else
        footerFathersName.setVisible(false);
    }//GEN-LAST:event_fathersNameKeyTyped
    
     public boolean validate(String email)
    {
        int x = email.indexOf("@");
        if(x==-1)
            return false;
        x = email.indexOf(".", x);
        if(x==-1)
            return false;
        return true;
    }
    
    private void mothersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mothersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mothersNameActionPerformed

    private void mothersNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mothersNameKeyTyped
        if(mothersName.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerMothersName.setVisible(true);
        else
        footerMothersName.setVisible(false);
    }//GEN-LAST:event_mothersNameKeyTyped

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

        if(email.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerEmail.setVisible(true);
        else
        footerEmail.setVisible(false);
    }//GEN-LAST:event_emailKeyTyped

    private void contactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNoKeyTyped

        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }

        if((contactNo.getText().length()==0) && (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()==KeyEvent.VK_DELETE || !((evt.getKeyChar() >= '0') && (evt.getKeyChar()<= '9'))))
        footerContact.setVisible(true);
        else
        footerContact.setVisible(false);

    }//GEN-LAST:event_contactNoKeyTyped

    private void dateOfBirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOfBirthKeyTyped

    }//GEN-LAST:event_dateOfBirthKeyTyped

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
        if(address.getText().length()==0  && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerAddress.setVisible(true);
        else
        footerAddress.setVisible(false);
    }//GEN-LAST:event_addressKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        if(name.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerName.setVisible(true);
        else
        footerName.setVisible(false);

    }//GEN-LAST:event_nameKeyTyped

    private void gContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gContactNoKeyTyped

        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
        if((gContactNo.getText().length()==0) && (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()==KeyEvent.VK_DELETE || !((evt.getKeyChar() >= '0') && (evt.getKeyChar()<= '9'))))
        footerGContact.setVisible(true);
        else
        footerGContact.setVisible(false);
    }//GEN-LAST:event_gContactNoKeyTyped

    private void addImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg"));

        fileChooser.setAcceptAllFileFilterUsed(false);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            String IMG_PATH = selectedFile.getAbsolutePath().toString();
            try {
                BufferedImage img = ImageIO.read(new File(IMG_PATH));
                Image dimg = img.getScaledInstance(image.getWidth(), image.getHeight(),
                    Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(dimg);
                image.setIcon(icon);
                //JOptionPane.showMessageDialog(null, label);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addImageButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        if(name.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(fathersName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Fathers Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(mothersName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Mothers Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(email.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Email is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!validate(email.getText()))
        {
            JOptionPane.showMessageDialog(this, "Email is not valid","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(contactNo.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Contact No is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(((JTextField)dateOfBirth.getDateEditor().getUiComponent()).getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Date Of Birth is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(address.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Address is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(gContactNo.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Guardian Contact No is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(salary.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Salary is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            EmployeeInfo user = new EmployeeInfo();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String f = formatter.format(date);
            user.setEmployeeId(f.substring(2,4)+f.substring(5,7)+new ConnectMSSQL().getSerial("EmployeeSerial"));

            user.setName(name.getText());
            user.setFathersName(fathersName.getText());
            user.setMothersName(mothersName.getText());
            user.setEmail(email.getText());
            user.setContactNo(contactNo.getText());
            user.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth.getDate()).toString());
            user.setBloodGroup(bloodGroup.getSelectedItem().toString());
            user.setPost(post.getSelectedItem().toString());
            user.setAddress(address.getText());
            user.setGuardianContactNo(gContactNo.getText());
            user.setSalary(Integer.valueOf(salary.getText()));
       
            Icon icon = image.getIcon();

            BufferedImage bi = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();

            icon.paintIcon(null, g, 0,0);
            g.setColor(Color.WHITE);
            g.drawString("",10,20);
            g.dispose();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try
            {

                ImageIO.write(bi, "jpg", baos);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            user.setImage(baos.toByteArray());
            ArrayList<EmployeeInfo> arr,arr2 = new ArrayList();
            arr = new ConnectMSSQL().getEmployeeInfo("where Email = '"+user.getEmail()+"'");
            arr2 = new ConnectMSSQL().getEmployeeInfo("where ContactNo = '"+user.getContactNo()+"'");
            if(arr.size()>0)
            {
                JOptionPane.showMessageDialog(this, "Email Already Exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(arr2.size()>0)
            {
                JOptionPane.showMessageDialog(this, "ContactNo Already Exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                
                try
                {
                    new ConnectMSSQL().addEmployee(user);
                    new ConnectMSSQL().update("SerialNo", "EmployeeSerial=EmployeeSerial+1");
                    resetButtonActionPerformed(evt);
                    JOptionPane.showMessageDialog(this, "Employee Added Successfully","Added",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Error Occured\n"+e.getMessage(),"Error",JOptionPane.WARNING_MESSAGE);
                }
            }

        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        name.setText("");
        footerName.setVisible(true);
        fathersName.setText("");
        footerFathersName.setVisible(true);
        mothersName.setText("");
        footerMothersName.setVisible(true);
        email.setText("");
        footerEmail.setVisible(true);
        contactNo.setText("");
        footerContact.setVisible(true);
        address.setText("");
        footerAddress.setVisible(true);
        gContactNo.setText("");
        footerGContact.setVisible(true);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/DSC_0335.jpg")));
        bloodGroup.setSelectedIndex(0);
        post.setSelectedIndex(0);
        salary.setText("");
        footerSalary.setVisible(false);
        
        

    }//GEN-LAST:event_resetButtonActionPerformed

    private void salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
        if((salary.getText().length()==0) && (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()==KeyEvent.VK_DELETE || !((evt.getKeyChar() >= '0') && (evt.getKeyChar()<= '9'))))
        footerSalary.setVisible(true);
        else
        footerSalary.setVisible(false);
    }//GEN-LAST:event_salaryKeyTyped

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
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImageButton;
    private javax.swing.JTextArea address;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> bloodGroup;
    private javax.swing.JTextField contactNo;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fathersName;
    private javax.swing.JLabel footerAddress;
    private javax.swing.JLabel footerContact;
    private javax.swing.JLabel footerEmail;
    private javax.swing.JLabel footerFathersName;
    private javax.swing.JLabel footerGContact;
    private javax.swing.JLabel footerMothersName;
    private javax.swing.JLabel footerName;
    private javax.swing.JLabel footerSalary;
    private javax.swing.JTextField gContactNo;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mothersName;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> post;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField salary;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
