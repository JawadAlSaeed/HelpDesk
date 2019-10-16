/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itApplictaion;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jawad.saeed
 */
public class ServerUI extends javax.swing.JFrame {

    LoginDB loginDb;
    Connection conn;

    /**
     * Creates new form ServerUI
     */
    public ServerUI() {
        initComponents();
        setTitle("HelpDesk");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("help.png")));
        loginDb = new LoginDB("helpdeskdb", "root", "");
        conn = loginDb.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        serverTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        searchButtton = new javax.swing.JButton();
        departmentComboBox = new javax.swing.JComboBox<>();
        closeOpenButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        emialButton = new javax.swing.JButton();
        footerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        serverTextArea.setColumns(20);
        serverTextArea.setRows(5);
        jScrollPane2.setViewportView(serverTextArea);

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "requestID", "User ID", "telephone", "department", "priority", "description", "date", "state"
            }
        ));
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        searchButtton.setText("Search");
        searchButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButttonActionPerformed(evt);
            }
        });

        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Network Department", "Support Department", "System Department", "Sales Department" }));

        closeOpenButton.setText("Close/Open");
        closeOpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeOpenButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Department");

        confirmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emialButton.setText("Email user");
        emialButton.setActionCommand("");
        emialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emialButton)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departmentComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(closeOpenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeOpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        footerLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        footerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footerLabel.setText("Designed by Jawad Al-Saeed   |   +96653690662 • JawadAlSaeed266@gmail.com • @JawadAlSaeed266   |   Copyright 2019, HelpDeskProject");
        footerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                footerLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                footerLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(footerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(footerLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButttonActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
            model.setRowCount(0);
            String SQL;
            String dep = departmentComboBox.getSelectedItem().toString();

            if (dep == "All") {
                SQL = "select * from requests";
                confirmLabel.setText("All reqeuests displayed");
            } else {
                SQL = "select * from requests where dpartment = '" + dep + "'";
                confirmLabel.setText("All " + dep + " reqeuests displayed");
            }

            System.out.println(SQL);
            ResultSet rs = loginDb.getResultSet(conn, SQL);
            boolean hasNext = false;

            while (rs.next()) {
                hasNext = true;
                model.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getDate(7),
                    rs.getString(8)
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_searchButttonActionPerformed

    private void closeOpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeOpenButtonActionPerformed
        String SQL;
        if (requestTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "please select a row", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int index = requestTable.getSelectedRow();
            TableModel model = requestTable.getModel();
            String rID = model.getValueAt(index, 0).toString();
            String state = model.getValueAt(index, 7).toString();

            System.out.println(state);

            if ("open".equals(state)) {
                model.setValueAt("closed", index, 7);
                SQL = "UPDATE `requests` SET `state` = 'closed' WHERE `requests`.`requestID` = '" + rID + "'";
                System.out.println(SQL);
                confirmLabel.setText("Request closed");
                Statement statement;
                try {
                    statement = conn.createStatement();
                    statement.executeUpdate(SQL);
                } catch (SQLException ex) {
                    Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if ("closed".equals(state)) {
                model.setValueAt("open", index, 7);
                SQL = "UPDATE `requests` SET `state` = 'open' WHERE `requests`.`requestID` = '" + rID + "'";
                System.out.println(SQL);
                confirmLabel.setText("Request opened");
                Statement statement;
                try {
                    statement = conn.createStatement();
                    statement.executeUpdate(SQL);
                } catch (SQLException ex) {
                    Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("error: worng state, restart");
            }
        }
    }//GEN-LAST:event_closeOpenButtonActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        int index = requestTable.getSelectedRow();
        TableModel model = requestTable.getModel();
        String description = model.getValueAt(index, 5).toString();
        serverTextArea.setText(description);
    }//GEN-LAST:event_requestTableMouseClicked

    private void footerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_footerLabelMouseClicked
        JEditorPane editorPane = new JEditorPane();
        try {
            editorPane.setPage(new URL("http://www.google.com"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_footerLabelMouseClicked

    private void footerLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_footerLabelMousePressed
        JEditorPane editorPane = new JEditorPane();
        try {
            editorPane.setPage(new URL("http://www.google.com"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_footerLabelMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
            model.setRowCount(0);
            String SQL;
            String dep = departmentComboBox.getSelectedItem().toString();

            if (dep == "All") {
                SQL = "select * from requests";
                confirmLabel.setText("All reqeuests displayed");
            } else {
                SQL = "select * from requests where dpartment = '" + dep + "'";
                confirmLabel.setText("All " + dep + " reqeuests displayed");
            }

            System.out.println(SQL);
            ResultSet rs = loginDb.getResultSet(conn, SQL);
            boolean hasNext = false;

            while (rs.next()) {
                hasNext = true;
                model.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getDate(7),
                    rs.getString(8)
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServerUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void emialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emialButtonActionPerformed
        String SQL;
        if (requestTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "please select a row", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
        }

    }//GEN-LAST:event_emialButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeOpenButton;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JButton emialButton;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable requestTable;
    private javax.swing.JButton searchButtton;
    private javax.swing.JTextArea serverTextArea;
    // End of variables declaration//GEN-END:variables
}
