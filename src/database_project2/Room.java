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
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Room extends javax.swing.JFrame {

    /**
     * Creates new form Room
     */
    String AdminId;
    int currentLength = 0;
    int modIndex  =0;
    ArrayList<RoomInfo> arr  = new ArrayList();
    public Room() {
        initComponents();
    }
    public Room(String AdminId) {
        this.AdminId = AdminId;
        initComponents();
        arr  = new ConnectMSSQL().getRoomInfo("");
        clearTable(jTable1);
        
        if((modIndex+1)*16>=arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());
        
            jTable1.getModel().setValueAt(arr.get(i).getRoomId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getBuildingNo(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getFloor(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getType(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTotalBed(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getEmptyBed(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
        
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));
        
        prevButton.setVisible(false);
        if(arr.size()<16)
            nextButton.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        searchRoomId = new javax.swing.JTextField();
        addRoomButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Report");

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
                .addGap(26, 26, 26)
                .addComponent(backButton)
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

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
                "Room Id", "Building No", "Floor", "Type", "Total Bed", "Empty Bed", "Action"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 970, 280));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search By Room ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 190, -1));

        searchRoomId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchRoomIdKeyTyped(evt);
            }
        });
        getContentPane().add(searchRoomId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 220, 30));

        addRoomButton.setText("Add New Room");
        addRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 220, 40));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomButtonActionPerformed
        new AddNewRoom(AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addRoomButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new HomePage(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
        
            jTable1.getModel().setValueAt(arr.get(i).getRoomId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getBuildingNo(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getFloor(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getType(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTotalBed(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getEmptyBed(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        modIndex--;
        if(modIndex==0)
            prevButton.setVisible(false);
        nextButton.setVisible(true);
        clearTable(jTable1);
        if((modIndex+1)*16>=arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        for(int i=0;i<currentLength;i++)
        {
            //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());
        
            jTable1.getModel().setValueAt(arr.get(i).getRoomId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getBuildingNo(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getFloor(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getType(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getTotalBed(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getEmptyBed(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void searchRoomIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchRoomIdKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
    }//GEN-LAST:event_searchRoomIdKeyTyped

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
            String query  = searchRoomId.getText();
            modIndex  =0;
            if(query.length()==0)
                arr  = new ConnectMSSQL().getRoomInfo(query);
            else arr  = new ConnectMSSQL().getRoomInfo("where RoomId =  '"+query+"'");
            clearTable(jTable1);

            if((modIndex+1)*16>=arr.size())
                currentLength = arr.size()%16;
            else currentLength = 16;

            for(int i=0;i<currentLength;i++)
            {
                //System.out.println(arr.get(i).getMemberId()+" "+arr.get(i).getName()+" "+arr.get(i).getContactNo()+" "+arr.get(i).getBloodGroup()+" "+arr.get(i).getSeatNo()+" "+arr.get(i).getMealType());

                jTable1.getModel().setValueAt(arr.get(i).getRoomId(),i, 0);
                jTable1.getModel().setValueAt(arr.get(i).getBuildingNo(),i, 1);
                jTable1.getModel().setValueAt(arr.get(i).getFloor(),i, 2);
                jTable1.getModel().setValueAt(arr.get(i).getType(),i, 3);
                jTable1.getModel().setValueAt(arr.get(i).getTotalBed(),i, 4);
                jTable1.getModel().setValueAt(arr.get(i).getEmptyBed(),i, 5);
                jTable1.getModel().setValueAt("Delete", i,6);



            }



            prevButton.setVisible(false);
            if(arr.size()<16)
                nextButton.setVisible(false);
            else nextButton.setVisible(true);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        if(col==6 && row<currentLength)
        {
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if(x==0)
            {
                if(jTable1.getValueAt(row, 4).equals(jTable1.getValueAt(row, 5)))
                {
                    try
                    {
                        new ConnectMSSQL().delete("Room"," where RoomId = '"+jTable1.getValueAt(row, 0)+"'");
                        new ConnectMSSQL().delete("Seat"," where SeatId Like '"+jTable1.getValueAt(row, 0)+"%'");
                        JOptionPane.showMessageDialog(this, "Room deleted Succesfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        new Room(this.AdminId).setVisible(true);
                        this.setVisible(false);

                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this, "Error Occured", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "This Room Has Some Member Already.Delete Them First!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchRoomId;
    // End of variables declaration//GEN-END:variables
}
