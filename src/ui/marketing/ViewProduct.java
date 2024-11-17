/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.marketing;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JOptionPane;

import model.Business.Business;
import model.ProductManagement.Product;
import model.Supplier.Supplier;

/**
 *
 * @author prasa
 */
public class ViewProduct extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private Supplier supplier;
    private Product product;

    /**
     * Creates new form ViewProduct
     */
    public ViewProduct(Container ui, Business business, Supplier supplier, Product product) {
        this.ui = ui;
        this.business = business;
        this.supplier = supplier;
        this.product = product;
        initComponents();
        lblSupplierName.setText("Supplier: " + supplier.getName());
        txtName.setText(product.getName());
        txtFPrice.setText(String.valueOf(product.getFloorPrice()));
        txtTPrice.setText(String.valueOf(product.getTargetPrice()));
        txtSPrice.setText(String.valueOf(product.getCeilingPrice()));
        txtProdAvail.setText(String.valueOf(product.getAvailable().getQuantity()));
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
        lblSPrice = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(255, 255, 204));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        lblProdAvail.setText("Product Availability:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Product");

        lblTPrice.setText("Target Price:");

        lblSPrice.setText("Selling Price:");

        lblFPrice.setText("Floor Price:");

        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

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

        lblSupplierName.setText("Supplier:");

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
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProdAvail, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblFPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(lblDescription)
                                                .addGap(1, 1, 1)))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtFPrice)
                                                .addComponent(txtTPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtSPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtProdAvail, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnSave))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addGap(27, 27, 27)
                                .addComponent(lblSupplierName)))
                        .addGap(0, 160, Short.MAX_VALUE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblSupplierName))
                .addGap(18, 18, 18)
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
                    .addComponent(lblSPrice)
                    .addComponent(txtSPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProdAvail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnSave))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Product name
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a product name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (supplier.getProductCatalog().findProduct(txtName.getText()) != null && !txtName.getText().equals(product.getName())) {
            JOptionPane.showMessageDialog(this, "Product already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Floor price
        if (txtFPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a floor price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int floorPrice = 0;
        try {
            floorPrice = Integer.parseInt(txtFPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid floor price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (floorPrice < 0) {
            JOptionPane.showMessageDialog(this, "Floor price cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Target price
        if (txtTPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a target price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int targetPrice = 0;
        try {
            targetPrice = Integer.parseInt(txtTPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid target price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (targetPrice < floorPrice) {
            JOptionPane.showMessageDialog(this, "Target price cannot be less than floor price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Ceiling price
        if (txtSPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a ceiling price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ceilingPrice = 0;
        try {
            ceilingPrice = Integer.parseInt(txtSPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid ceiling price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ceilingPrice < targetPrice) {
            JOptionPane.showMessageDialog(this, "Ceiling price cannot be less than target price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int available = 0;
        try {
            available = Integer.parseInt(txtProdAvail.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid product availability", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (available < 0) {
            JOptionPane.showMessageDialog(this, "Product availability cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        product.setName(txtName.getText());
        product.setFloorPrice(floorPrice);
        product.setTargetPrice(targetPrice);
        product.setCeilingPrice(ceilingPrice);
        product.getAvailable().setQuantity(available);
        // After the new recommended price is set, if the actual price exceeds the limit, the actual price should be set to the limit
        if (product.getAvailable().getActualPrice() < product.getFloorPrice()) {
            product.getAvailable().setActualPrice(product.getFloorPrice());
        } else if (product.getAvailable().getActualPrice() > product.getCeilingPrice()) {
            product.getAvailable().setActualPrice(product.getCeilingPrice());
        }
        JOptionPane.showMessageDialog(this, "Product updated successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void setViewMode() {
        txtName.setEditable(false);
        txtFPrice.setEditable(false);
        txtTPrice.setEditable(false);
        txtSPrice.setEditable(false);
        txtProdAvail.setEditable(false);
        txtDescription.setEditable(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }

    private void setEditMode() {
        txtName.setEditable(true);
        txtFPrice.setEditable(true);
        txtTPrice.setEditable(true);
        txtSPrice.setEditable(true);
        txtProdAvail.setEditable(true);
        txtDescription.setEditable(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFPrice;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProdAvail;
    private javax.swing.JLabel lblSPrice;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblTPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtFPrice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProdAvail;
    private javax.swing.JTextField txtSPrice;
    private javax.swing.JTextField txtTPrice;
    // End of variables declaration//GEN-END:variables
}
