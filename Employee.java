/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database_project2;

import static database_project2.Member.clearTable;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author SARK
 */
public class Employee extends javax.swing.JFrame {

    /** Creates new form Employee */
    String AdminId;
    int currentLength = 0;
    int modIndex  =0;
    ArrayList<EmployeeInfo> arr = new ArrayList ();
    public Employee() {
        initComponents();
    }
    public Employee(String AdminId) {
        this.AdminId = AdminId;
        initComponents();
        
        arr = new ConnectMSSQL().getEmployeeInfo("");
        jTable1.setDefaultEditor(Object.class, null);
        clearTable(jTable1);
        
        if((modIndex+1)*16>arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getEmployeeId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getPost(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getSalary(),i, 5);
            jTable1.getModel().setValueAt("Details", i,6);
            
            
             
        }
        
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));
        
        prevButton.setVisible(false);
        if(arr.size()<=16)
            nextButton.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backToHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchByContact = new javax.swing.JTextField();
        searchBySalary = new javax.swing.JTextField();
        searchById = new javax.swing.JTextField();
        searchByName = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        searchByBlood = new javax.swing.JComboBox<>();
        searchByPost = new javax.swing.JComboBox<>();
        search1 = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        addNewEmployee = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        setPreferredSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        backToHome.setText("Back");
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backToHome)
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backToHome))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact No", "Blood Group", "Post", "Salary", "Action"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(1245, 6789));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1010, 270));

        searchByContact.setText("Search By Contact No");
        searchByContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByContactMouseClicked(evt);
            }
        });
        searchByContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByContactActionPerformed(evt);
            }
        });
        getContentPane().add(searchByContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 90, 160, 30));

        searchBySalary.setText("Search By Salary");
        searchBySalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBySalaryMouseClicked(evt);
            }
        });
        getContentPane().add(searchBySalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 140, 160, 30));

        searchById.setText("Search By Id");
        searchById.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByIdMouseClicked(evt);
            }
        });
        searchById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdActionPerformed(evt);
            }
        });
        getContentPane().add(searchById, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 90, 160, 30));

        searchByName.setText("Search By Name");
        searchByName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchByName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByNameMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchByNameMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchByNameMouseReleased(evt);
            }
        });
        getContentPane().add(searchByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 90, 160, 30));

        reset.setText("Reset");
        reset.setBackground(new java.awt.Color(255, 153, 153));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 93, 80, -1));

        searchByBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By Blood Group", "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));
        getContentPane().add(searchByBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 140, 160, 30));

        searchByPost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By Post", "Manager", "Accountant", "Cook", "Cleaner", "Others" }));
        getContentPane().add(searchByPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 140, 160, 30));

        search1.setText("Search");
        search1.setBackground(new java.awt.Color(0, 102, 153));
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        getContentPane().add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 139, 80, -1));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 481, 70, 20));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 481, 70, 20));

        addNewEmployee.setBackground(new java.awt.Color(15, 19, 52));
        addNewEmployee.setForeground(new java.awt.Color(255, 255, 255));
        addNewEmployee.setPreferredSize(new java.awt.Dimension(130, 40));
        addNewEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addNewEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewEmployeeMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/user_add.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add New Employee");

        javax.swing.GroupLayout addNewEmployeeLayout = new javax.swing.GroupLayout(addNewEmployee);
        addNewEmployee.setLayout(addNewEmployeeLayout);
        addNewEmployeeLayout.setHorizontalGroup(
            addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewEmployeeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        addNewEmployeeLayout.setVerticalGroup(
            addNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(addNewEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 97, 176, 43));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/hostel room-01.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1050, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
        HomePage obj2 = new HomePage(AdminId);
        this.setVisible(false);
        obj2.setVisible(true);
    }//GEN-LAST:event_backToHomeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();

        if(col==6 && row<currentLength)
        {

            new EmployeeDetails(AdminId,arr.get(row+16*modIndex).getEmployeeId()).setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void searchByContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByContactMouseClicked
        if(searchByContact.getText().equals("Search By Contact No"))
        searchByContact.setText("");
    }//GEN-LAST:event_searchByContactMouseClicked

    private void searchByContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByContactActionPerformed

    private void searchBySalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBySalaryMouseClicked
        if(searchBySalary.getText().equals("Search By Salary"))
        searchBySalary.setText("");
    }//GEN-LAST:event_searchBySalaryMouseClicked

    private void searchByIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByIdMouseClicked
        if(searchById.getText().equals("Search By Id"))
        searchById.setText("");
    }//GEN-LAST:event_searchByIdMouseClicked

    private void searchByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByIdActionPerformed

    private void searchByNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByNameMouseClicked
        if(searchByName.getText().equals("Search By Name"))
        searchByName.setText("");
    }//GEN-LAST:event_searchByNameMouseClicked

    private void searchByNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByNameMouseExited

    }//GEN-LAST:event_searchByNameMouseExited

    private void searchByNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByNameMouseReleased

    }//GEN-LAST:event_searchByNameMouseReleased

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        searchById.setText("Search By Id");
        searchByName.setText("Search By Name");
        searchByContact.setText("Search By Contact No");
        searchBySalary.setText("Search By Salary");
        searchByPost.setSelectedItem(0);
        searchByBlood.setSelectedIndex(0);

    }//GEN-LAST:event_resetActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        String query = "";
        String temp;

        temp = searchById.getText();
        if(temp.equals("Search By Id")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where EmployeeId='"+temp+"'";
            }
            else query+="and EmployeeId='"+temp+"'";
        }

        temp = searchByName.getText();
        if(temp.equals("Search By Name")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where Name='"+temp+"'";
            }
            else query+="and Name='"+temp+"'";
        }
        temp = searchByContact.getText();
        if(temp.equals("Search By Contact No")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where ContactNo='"+temp+"'";
            }
            else query+="and ContactNo='"+temp+"'";
        }
        temp = searchBySalary.getText();
        if(temp.equals("Search By Salary")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where Salary="+temp;
            }
            else query+="and Salary="+temp;
        }
        temp = searchByBlood.getSelectedItem().toString();
        if(temp.equals("Search By Blood Group")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where BloodGroup='"+temp+"'";
            }
            else query+="and BloodGroup='"+temp+"'";
        }
        temp = searchByPost.getSelectedItem().toString();
        if(temp.equals("Search By Post")==false && temp.length()>0)
        {

            if(query.length()==0)
            {
                query+= "where Post='"+temp+"'";
            }
            else query+="and Post='"+temp+"'";
        }

        arr.clear();
        arr = new ConnectMSSQL().getEmployeeInfo(query);

        modIndex = 0;

        clearTable(jTable1);

        if((modIndex+1)*16>arr.size())
        currentLength = arr.size()%16;
        else currentLength = 16;

        for(int i=0;i<currentLength;i++)
        {
            
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getEmployeeId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getPost(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getSalary(),i, 5);
            jTable1.getModel().setValueAt("Details", i,6);

        }
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));

        prevButton.setVisible(false);
        if(arr.size()<=16)
        nextButton.setVisible(false);
        else nextButton.setVisible(true);

    }//GEN-LAST:event_search1ActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        modIndex--;
        if(modIndex==0)
            prevButton.setVisible(false);
        nextButton.setVisible(true);
        clearTable(jTable1);
        if((modIndex+1)*16>arr.size())
        currentLength = arr.size()%16;
        else currentLength = 16;
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());

            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getEmployeeId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getPost(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getSalary(),i, 5);
            jTable1.getModel().setValueAt("Details", i,6);

        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        modIndex++;
        prevButton.setVisible(true);
        if((modIndex+1)*16>=arr.size())
        nextButton.setVisible(false);
        clearTable(jTable1);
        if((modIndex+1)*16>=arr.size())
        currentLength = arr.size()%16;
        else currentLength = 16;
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());

            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getEmployeeId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getName(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getContactNo(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getBloodGroup(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getPost(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i+16*modIndex).getSalary(),i, 5);
            jTable1.getModel().setValueAt("Details", i,6);

        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void addNewEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewEmployeeMouseClicked
        new EmployeeRegistration(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addNewEmployeeMouseClicked

    private void addNewEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewEmployeeMouseEntered
        addNewEmployee.setBorder(new MatteBorder(3,3,3,3,new Color(153,153,153)));

    }//GEN-LAST:event_addNewEmployeeMouseEntered

    private void addNewEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewEmployeeMouseExited
       addNewEmployee.setBorder(new EmptyBorder(0,0,0,0));
    }//GEN-LAST:event_addNewEmployeeMouseExited

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addNewEmployee;
    private javax.swing.JButton backToHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton reset;
    private javax.swing.JButton search1;
    private javax.swing.JComboBox<String> searchByBlood;
    private javax.swing.JTextField searchByContact;
    private javax.swing.JTextField searchById;
    private javax.swing.JTextField searchByName;
    private javax.swing.JComboBox<String> searchByPost;
    private javax.swing.JTextField searchBySalary;
    // End of variables declaration//GEN-END:variables

}
