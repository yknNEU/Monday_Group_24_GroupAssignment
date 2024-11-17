/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.marketing;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Business.Business;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;

/**
 *
 * @author prasa
 */
public class ViewSummary extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private Product product;

    /**
     * Creates new form ViewSummary
     */
    public ViewSummary(Container ui, Business business, Product product) {
        this.ui = ui;
        this.business = business;
        this.product = product;
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewProductSummary = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewTransactionDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Product Summary");

        tblViewProductSummary.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        tblViewProductSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer", "Price", "Quantity", "Profit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewProductSummary);

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewTransactionDetails.setText("View Transaction Details ");
        btnViewTransactionDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTransactionDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewTransactionDetails)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnViewTransactionDetails)
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewTransactionDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTransactionDetailsActionPerformed
        int row = tblViewProductSummary.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        OrderItem orderItem = (OrderItem) tblViewProductSummary.getValueAt(row, 0);
        CustomerProfile customer = (CustomerProfile) tblViewProductSummary.getValueAt(row, 1);
        ViewTransactions viewTransactions = new ViewTransactions(ui, orderItem, customer);
        ui.add("ViewTransactions" + viewTransactions.toString(), viewTransactions);
        CardLayout layout = (CardLayout) ui.getLayout();
        layout.next(ui);
    }//GEN-LAST:event_btnViewTransactionDetailsActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewProductSummary.getModel();
        model.setRowCount(0);

        MasterOrderList masterOrderList = business.getMasterOrderList();
        for (Order order : masterOrderList.getOrders()) {
            for (OrderItem orderItem : order.getOrderItems()) {
                if (orderItem.getSelectedProduct() == product) {
                    Object[] row = new Object[5];
                    row[0] = orderItem;
                    row[1] = order.getCustomer();
                    row[2] = orderItem.getActualPrice();
                    row[3] = orderItem.getQuantity();
                    row[4] = orderItem.calculatePricePerformance();
                    model.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewTransactionDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblViewProductSummary;
    // End of variables declaration//GEN-END:variables
}
