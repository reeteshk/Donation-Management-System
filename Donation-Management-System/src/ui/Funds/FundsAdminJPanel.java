/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Funds;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import static Donation.Organization.Organization.orgType.FundsOrg;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.FundsWorkRequest;
import Donation.WorkQueue.WorkQueue;
import Donation.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raushan
 */
public class FundsAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundsAdminJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public FundsAdminJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        populateTable();
        populateTableOrg();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFunds = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setToolTipText("");

        tblOrg.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrg);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 950, 140);
        jPanel1.add(txtUsername);
        txtUsername.setBounds(410, 340, 220, 40);
        jPanel1.add(txtName);
        txtName.setBounds(410, 260, 220, 40);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(410, 420, 220, 40);

        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 430, 80, 16);

        jLabel10.setText("Username");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 350, 100, 16);

        jLabel12.setText("Organization Name");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(260, 270, 120, 16);

        jLabel15.setText("List of Organization");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 40, 150, 16);

        jButton6.setText("Add Organization");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(470, 490, 140, 22);

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        tableFunds.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableFunds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Organization Name", "Organization Type", "Funds", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableFunds);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 110, 1000, 177);

        jLabelIncomingKit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIncomingKit.setText("Incoming funds");
        jPanel3.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(10, 80, 110, 20);

        btnAccept.setBackground(new java.awt.Color(2, 55, 108));
        btnAccept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        jPanel3.add(btnAccept);
        btnAccept.setBounds(1010, 320, 123, 36);

        jLabel2.setText("Welcome Funds Admin");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(440, 50, 160, 16);

        jButton5.setText("Process");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(900, 340, 78, 22);

        jTabbedPane1.addTab("Manage Work Requests", jPanel3);

        jLabel1.setText("Welcome Funds Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText().trim();
        Organization.orgType type = FundsOrg;
        if(!name.isEmpty()){
            Organization organization = enterprise.getOrgDirectory().addOrganization(type, txtName.getText());

            JOptionPane.showMessageDialog(null, "Organization created.");
            txtName.setText("");

        } else{
            JOptionPane.showMessageDialog(null, "Please enter Organization name");
        }
        populateTableOrg();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableFunds.getSelectedRow();

        if (selectedRow >= 0) {
            FundsWorkRequest wreq = (FundsWorkRequest) tableFunds.getValueAt(selectedRow, 0);
            if (wreq.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Funds processed already!");
                return;
            }
            else if (wreq.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to Donation Organization.");
                return;
            }
            else {
                wreq.setReceiver(userAccount);
                wreq.setStatus("Processed to Donation Organization");

                JOptionPane.showMessageDialog(null, "Request processed to Donation Organization.");
                populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableFunds;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTableOrg() {
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
            for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                Object[] row = new Object[1];
                row[0] = org.getName();
                model.addRow(row);
            }   
    }
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableFunds.getModel();
        model.setRowCount(0);

        if (enterprise.getWorkQueue() == null) {
            enterprise.setWorkQueue(new WorkQueue());
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkReqList()) {
            if (workRequest instanceof FundsWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((FundsWorkRequest) workRequest).getRequestDateTime());
                row[2] = ((FundsWorkRequest) workRequest).getName();
                row[3] = ((FundsWorkRequest) workRequest).getOrgType();
                row[4] = ((FundsWorkRequest) workRequest).getFunds();
                row[5] = ((FundsWorkRequest) workRequest).getName();
                row[6] = ((FundsWorkRequest) workRequest).getType();
                row[7] = ((FundsWorkRequest) workRequest).getStatus();

                model.addRow(row);
            }
        }

    }
}