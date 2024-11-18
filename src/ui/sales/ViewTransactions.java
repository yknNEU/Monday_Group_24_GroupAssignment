/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sales;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Business.Business;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.SolutionOffer;
import model.UserAccountManagement.UserAccount;
import ui.admin.ManagePerson;

/**
 *
 * @author prasa
 */
public class ViewTransactions extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private UserAccount userAccount;
    private Order order;
    private SolutionOffer solutionOffer;

    /**
     * Creates new form ManageTransactions
     */
    public ViewTransactions(Container ui, Business business, UserAccount userAccount, Order order, SolutionOffer solutionOffer) {
        this.ui = ui;
        this.business = business;
        this.userAccount = userAccount;
        this.order = order;
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

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnDecline = new javax.swing.JButton();
        lblTotalPrice = new javax.swing.JLabel();
        btnViewOrderItem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Product Summary");

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

        tblCart.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        btnDecline.setText("Decline Transaction");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        lblTotalPrice.setText("Total Price:");

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
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
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalPrice)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnViewOrderItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDecline)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(lblTotalPrice))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnDecline)
                    .addComponent(btnViewOrderItem))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
        int row = tblCart.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item to view", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        OrderItem orderItem = (OrderItem) tblCart.getValueAt(row, 0);
        Product product = orderItem.getSelectedProduct();
        ViewProduct viewProduct = new ViewProduct(ui, business, userAccount, product, business.getSuppliers().findSupplier(product), solutionOffer);
        ui.add("ViewProduct" + viewProduct.toString(), viewProduct);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        Component[] componentArray = ui.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (component instanceof ManageTransactions) {
            ManageTransactions managePerson = (ManageTransactions) component;
            managePerson.populateTable();
        }
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        if ("Pending".equals(order.getStatus())) {
            order.cancelOrder();
            JOptionPane.showMessageDialog(null, "Transaction Declined", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Transaction already processed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        if ("Pending".equals(order.getStatus())) {
            order.approve(business.getMasterOrderList());
            JOptionPane.showMessageDialog(null, "Transaction Approved", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Transaction already processed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);
        lblTotalPrice.setText("Total Price: " + order.getOrderTotal());
        for (OrderItem orderItem : order.getOrderItems()) {
            Object[] row = new Object[4];
            row[0] = orderItem;
            row[1] = orderItem.getQuantity();
            row[2] = orderItem.getActualPrice();
            row[3] = orderItem.getActualPrice() * orderItem.getQuantity();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables
}
