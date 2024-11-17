/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sales;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JOptionPane;

import model.Business.Business;
import model.ProductManagement.Product;
import model.ProductManagement.SolutionOffer;
import model.Supplier.Supplier;
import model.UserAccountManagement.UserAccount;
import ui.admin.ManagePerson;

/**
 *
 * @author prasa
 */
public class ViewProduct extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private UserAccount userAccount;
    private Product product;
    private Supplier supplier;
    private SolutionOffer solutionOffer;

    /**
     * Creates new form ViewProduct
     */
    public ViewProduct(Container ui, Business business, UserAccount userAccount, Product product, Supplier supplier, SolutionOffer solutionOffer) {
        this.ui = ui;
        this.business = business;
        this.userAccount = userAccount;
        this.product = product;
        this.supplier = supplier;
        this.solutionOffer = solutionOffer;
        initComponents();
        txtSupplierName.setText(supplier.getName());
        txtName.setText(product.getName());
        txtFPrice.setText(String.valueOf(product.getFloorPrice()));
        txtTPrice.setText(String.valueOf(product.getTargetPrice()));
        txtSPrice.setText(String.valueOf(product.getCeilingPrice()));
        txtProdAvail.setText(String.valueOf(product.getAvailable().getQuantity()));
        txtStatus.setText(product.getStatus(solutionOffer));
        // TODO: availability and status
        setViewMode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblProdAvail = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblTPrice = new javax.swing.JLabel();
        lblCPrice = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtFPrice = new javax.swing.JTextField();
        txtTPrice = new javax.swing.JTextField();
        lblFPrice = new javax.swing.JLabel();
        txtSPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtProdAvail = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblSupplierName = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnAddToMarket = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setEnabled(false);
        jScrollPane1.setViewportView(txtDescription);

        lblProdAvail.setText("Product Availability:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Product");

        lblTPrice.setText("Target Price:");

        lblCPrice.setText("Ceiling Price:");

        txtName.setEnabled(false);

        txtFPrice.setEnabled(false);

        lblFPrice.setText("Floor Price:");

        txtSPrice.setEnabled(false);

        btnUpdate.setText("Update Price");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtProdAvail.setEnabled(false);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDescription.setText("Description:");

        lblName.setText("Product Name:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblSupplierName.setText("Supplier Name:");

        txtSupplierName.setEnabled(false);

        lblStatus.setText("Status:");

        txtStatus.setEnabled(false);

        btnAddToMarket.setText("Add to Market");
        btnAddToMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToMarketActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove from Market");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProdAvail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSupplierName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSupplierName)
                                    .addComponent(txtName)
                                    .addComponent(txtFPrice)
                                    .addComponent(txtTPrice)
                                    .addComponent(txtSPrice)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStatus)
                                    .addComponent(txtProdAvail)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddToMarket)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave)))
                        .addGap(108, 108, 108))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(10, 10, 10)
                .addComponent(btnBack)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierName)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPrice)
                    .addComponent(txtSPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProdAvail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)
                            .addComponent(btnAddToMarket)
                            .addComponent(btnRemove)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        Component[] componentArray = ui.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (component instanceof ManageProduct) {
            ManageProduct managePerson = (ManageProduct) component;
            managePerson.populateTable();
        }
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddToMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToMarketActionPerformed
        if (solutionOffer.getProducts().contains(product)) {
            JOptionPane.showMessageDialog(this, "Product already added to the market.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        solutionOffer.addProduct(product);
        txtStatus.setText(product.getStatus(solutionOffer));
        JOptionPane.showMessageDialog(this, "Product added from market sucessfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnAddToMarketActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtTPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a actual price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int actualPrice = 0;
        try {
            actualPrice = Integer.parseInt(txtTPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid actual price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (actualPrice < product.getFloorPrice() || actualPrice > product.getCeilingPrice()) {
            JOptionPane.showMessageDialog(this, "Actual price must be between floor price and ceiling price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        product.getAvailable().setActualPrice(actualPrice);
        JOptionPane.showMessageDialog(this, "Product price updated successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (!solutionOffer.getProducts().contains(product)) {
            JOptionPane.showMessageDialog(this, "Product not in the market.", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        solutionOffer.getProducts().remove(product);
        txtStatus.setText(product.getStatus(solutionOffer));
        JOptionPane.showMessageDialog(this, "Product removed from market sucessfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void setViewMode() {
        txtTPrice.setEditable(false);
        btnAddToMarket.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
    }

    private void setEditMode() {
        txtTPrice.setEditable(true);
        btnAddToMarket.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToMarket;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPrice;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFPrice;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProdAvail;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblTPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtFPrice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProdAvail;
    private javax.swing.JTextField txtSPrice;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtTPrice;
    // End of variables declaration//GEN-END:variables
}
