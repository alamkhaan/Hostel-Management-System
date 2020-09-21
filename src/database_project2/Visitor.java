/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tanjim
 */
package database_project2;

import static database_project2.Member.clearTable;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class Visitor extends javax.swing.JFrame {

    /**
     * Creates new form Visitor
     */
    String AdminId;
    int modIndex = 0;
    int currentLength;
    ArrayList<VisitorInfo> arr = new ArrayList();

    ;
    public Visitor() {
        initComponents();

    }

    public Visitor(String AdminId) {
        this.AdminId = AdminId;
        initComponents();
        clearTable(jTable1);
        timeIn.getSettings().setAllowKeyboardEditing(false);
        timeOut.getSettings().setAllowKeyboardEditing(false);
        arr = new ConnectMSSQL().getVisitorInfo("");
        jTable1.setDefaultEditor(Object.class, null);
        //System.out.println(arr.size());

        if ((modIndex + 1) * 16 >= arr.size()) {
            currentLength = arr.size() % 16;
        } else {
            currentLength = 16;
        }

        for (int i = 0; i < currentLength; i++) {

            jTable1.getModel().setValueAt(arr.get(i).getVisitorId(), i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getVisitorsName(), i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(), i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getTimeIn(), i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTimeOut(), i, 4);

        }

        prevButton.setVisible(false);
        if (arr.size() < 16) {
            nextButton.setVisible(false);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addVisitorButton = new javax.swing.JButton();
        memberId = new javax.swing.JTextField();
        visitorName = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timeIn = new com.github.lgooddatepicker.components.DatePicker();
        timeOut = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        setPreferredSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setText("Visitor's Report");
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
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addGap(336, 336, 336)
                .addComponent(jLabel1)
                .addContainerGap(595, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Visitor ID", "Visitor Name", "Member ID", "Time In", "Time Out"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1000, 300));

        addVisitorButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addVisitorButton.setText("Add New Visitor");
        addVisitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addVisitorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        memberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberIdActionPerformed(evt);
            }
        });
        memberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                memberIdKeyTyped(evt);
            }
        });
        getContentPane().add(memberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));
        getContentPane().add(visitorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 70, -1));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        searchButton.setText("Search");
        searchButton.setBackground(new java.awt.Color(51, 51, 255));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 70, -1));

        jLabel2.setText("Search by Member Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 10));

        jLabel3.setText("Search by Visitor Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 10));

        jLabel4.setText("Search by Time Out Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, 10));

        jLabel5.setText("Search by Time In Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 10));
        getContentPane().add(timeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 170, 30));
        getContentPane().add(timeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberIdActionPerformed

    }//GEN-LAST:event_memberIdActionPerformed
    public static void clearTable(final JTable table) 
    {
        for (int i = 0; i < table.getRowCount(); i++) 
        {
            for(int j = 0; j < table.getColumnCount(); j++) 
            {
                table.setValueAt("", i, j);
            }   
        }
    }
    private void addVisitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitorButtonActionPerformed
        new AddNewVisitor(AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addVisitorButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new HomePage(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        modIndex++;
        prevButton.setVisible(true);
        if ((modIndex + 1) * 16 >= arr.size()) {
            nextButton.setVisible(false);
        }
        clearTable(jTable1);
        if ((modIndex + 1) * 16 >= arr.size()) {
            currentLength = arr.size() % 16;
        } else {
            currentLength = 16;
        }
        for (int i = 0; i < currentLength; i++) {

            jTable1.getModel().setValueAt(arr.get(i).getVisitorId(), i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getVisitorsName(), i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(), i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getTimeIn(), i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTimeOut(), i, 4);

        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        modIndex--;
        if (modIndex == 0) {
            prevButton.setVisible(false);
        }
        nextButton.setVisible(true);
        clearTable(jTable1);
        if ((modIndex + 1) * 16 >= arr.size()) {
            currentLength = arr.size() % 16;
        } else {
            currentLength = 16;
        }
        for (int i = 0; i < currentLength; i++) {

            jTable1.getModel().setValueAt(arr.get(i).getVisitorId(), i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getVisitorsName(), i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(), i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getTimeIn(), i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTimeOut(), i, 4);

        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void memberIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberIdKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_memberIdKeyTyped

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        memberId.setText("");
        visitorName.setText("");
        timeIn.clear();
        timeOut.clear();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String query = "";
        String temp;

        temp = visitorName.getText();
        if (temp.length() > 0) {
            if (query.length() == 0) {
                query += "where VisitorsName='" + temp + "'";
            } else {
                query += "and VisitorsName='" + temp + "'";
            }
        }

        temp = memberId.getText();
        if (temp.length() > 0) {
            if (query.length() == 0) {
                query += "where MemberId='" + temp + "'";
            } else {
                query += "and MemberId='" + temp + "'";
            }
        }
        temp = timeIn.getText();
        if (temp.length() > 0) {
            if (query.length() == 0) {
                query += "where TimeIn like '" + temp + "%'";
            } else {
                query += "and TimeIn like '" + temp + "%'";
            }
        }

        temp = timeOut.getText();
        if (temp.length() > 0) {
            if (query.length() == 0) {
                query += "where TimeOut like '" + temp + "%'";
            } else {
                query += "and TimeOut like '" + temp + "%'";
            }
        }

        arr.clear();
        arr = new ConnectMSSQL().getVisitorInfo(query);

        modIndex = 0;

        clearTable(jTable1);

        if ((modIndex + 1) * 16 >= arr.size()) {
            currentLength = arr.size() % 16;
        } else {
            currentLength = 16;
        }

        for (int i = 0; i < currentLength; i++) {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());

            jTable1.getModel().setValueAt(arr.get(i).getVisitorId(), i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getVisitorsName(), i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(), i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getTimeIn(), i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTimeOut(), i, 4);

        }

        prevButton.setVisible(false);
        if (arr.size() < 16) {
            nextButton.setVisible(false);
        } else {
            nextButton.setVisible(true);
        }


    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVisitorButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField memberId;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private com.github.lgooddatepicker.components.DatePicker timeIn;
    private com.github.lgooddatepicker.components.DatePicker timeOut;
    private javax.swing.JTextField visitorName;
    // End of variables declaration//GEN-END:variables
}
