/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sales;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Business.Business;
import model.OrderManagement.Order;
import model.ProductManagement.SolutionOffer;
import model.UserAccountManagement.UserAccount;

/**
 *
 * @author prasa
 */
public class ManageTransactions extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private UserAccount userAccount;
    private SolutionOffer solutionOffer;

    /**
     * Creates new form ManageTransactions
     */
    public ManageTransactions(Container ui, Business business, UserAccount userAccount, SolutionOffer solutionOffer) {
        this.ui = ui;
        this.business = business;
        this.userAccount = userAccount;
        this.solutionOffer = solutionOffer;
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnDecline3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        tblCart.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Items", "Total Price", "Total Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        btnView.setText("View Transactions");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Transactions");

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnApprove.setText("Approve Transaction");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDecline3.setText("Decline Transaction");
        btnDecline3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecline3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(84, 585, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDecline3)
                                .addGap(18, 18, 18)
                                .addComponent(btnApprove)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnApprove)
                        .addComponent(btnDecline3))
                    .addComponent(btnView))
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int row = tblCart.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a transation to view", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Order order = (Order) tblCart.getValueAt(row, 1);
        ViewTransactions viewTransactions = new ViewTransactions(ui, business, userAccount, order, solutionOffer);
        ui.add("ViewTransactions" + viewTransactions.toString(), viewTransactions);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int row = tblCart.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a transation to approve", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Order order = (Order) tblCart.getValueAt(row, 1);
        String status = order.getStatus();
        if ("Pending".equals(status)) {
            order.approve();
            JOptionPane.showMessageDialog(null, "Transaction approved successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Transaction already processed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDecline3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecline3ActionPerformed
        int row = tblCart.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a transation to decline", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Order order = (Order) tblCart.getValueAt(row, 1);
        String status = order.getStatus();
        if ("Pending".equals(status)) {
            order.cancelOrder();
            JOptionPane.showMessageDialog(null, "Transaction declined successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Transaction already processed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecline3ActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        for (Order order : business.getMasterOrderList().getOrders()) {
            if (order.getSalesPerson().getPerson().isMatch(userAccount.getPersonId())) {
                Object[] row = new Object[5];
                row[0] = order.getCustomer().getPerson().getPersonId();
                row[1] = order;
                row[2] = order.getOrderTotal();
                row[3] = order.getProductTotal();
                row[4] = order.getStatus();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline3;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables
}
