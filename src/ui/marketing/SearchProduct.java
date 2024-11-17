/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.marketing;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Business.Business;
import model.Supplier.Supplier;

/**
 *
 * @author prasa
 */
public class SearchProduct extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private Supplier supplier;

    /**
     * Creates new form SearchProduct
     */
    public SearchProduct(Container ui, Business business, Supplier supplier) {
        this.ui = ui;
        this.business = business;
        this.supplier = supplier;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProductName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblProductName = new javax.swing.JLabel();
        lblBetween = new javax.swing.JLabel();
        txtLow = new javax.swing.JTextField();
        txtHigh = new javax.swing.JTextField();
        lblTo = new javax.swing.JLabel();
        cmbPrice = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 204));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search for Product");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProductName.setText("Product Name:");

        lblBetween.setText("between:");

        lblTo.setText("~");

        cmbPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ceiling Price", "Target Price", "Floor Price", "Quantity" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSearch)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblProductName)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBetween)))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHigh))
                                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBetween)
                    .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTo)
                    .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSearch)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // Read data from the table in the previous panel
        Component[] components = ui.getComponents();
        Component component = components[components.length - 2];
        DefaultTableModel model = null;
        if (component instanceof ManageProduct) {
            ManageProduct manageProduct = (ManageProduct) component;
            model = (DefaultTableModel) manageProduct.getTable().getModel();
        } else {
            JOptionPane.showMessageDialog(this, "Unexpected panel detected, unable to show the search result.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("[Warning] Unexpected panel detected, unable to show the search result. [Class: SearchProduct, Method: btnSearchActionPerformed]");
            return;
        }
        if (txtProductName.getText().isEmpty() && txtLow.getText().isEmpty() && txtHigh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You need to enter at least one search criteria.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Prase search criteria
        String queryName = txtProductName.getText();
        String cmbType = cmbPrice.getSelectedItem().toString();
        int low = -1;
        int high = -1;

        try {
            if (!txtLow.getText().isEmpty()) {
                low = Integer.parseInt(txtLow.getText());
            }
            if (!txtHigh.getText().isEmpty()) {
                high = Integer.parseInt(txtHigh.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input for the range. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ((low < 0 && !txtLow.getText().isEmpty()) || (high < 0 && !txtHigh.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Range cannot be negative. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (low > high && !txtLow.getText().isEmpty() && !txtHigh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Low range cannot be greater than high range. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Remove rows that do not match the search criteria
        try {
            for (int i = 0; i < model.getRowCount(); i++) {
                String productName = model.getValueAt(i, 0).toString();
                int floorPrice = Integer.parseInt(model.getValueAt(i, 1).toString());
                int targetPrice = Integer.parseInt(model.getValueAt(i, 2).toString());
                int ceilingPrice = Integer.parseInt(model.getValueAt(i, 3).toString());
                int availability = Integer.parseInt(model.getValueAt(i, 4).toString());

                if (!queryName.isEmpty() && !productName.toLowerCase().contains(queryName.toLowerCase())) {
                    model.removeRow(i);
                    i--;
                    continue;
                } 
                boolean isPassLow = false;
                boolean isPassHigh = false;
                if ("Ceiling Price".equals(cmbType)) {    
                    if (low == -1 || ceilingPrice >= low) {
                        isPassLow = true;
                    }
                    if (high == -1 || ceilingPrice <= high) {
                        isPassHigh = true;
                    }
                    if (isPassLow == false || isPassHigh == false) {
                        model.removeRow(i);
                        i--;
                        continue;
                    }
                } else if ("Target Price".equals(cmbType)) {
                    if (low == -1 || targetPrice >= low) {
                        isPassLow = true;
                    }
                    if (high == -1 || targetPrice <= high) {
                        isPassHigh = true;
                    }
                    if (isPassLow == false || isPassHigh == false) {
                        model.removeRow(i);
                        i--;
                        continue;
                    }
                } else if ("Floor Price".equals(cmbType)) {
                    if (low == -1 || floorPrice >= low) {
                        isPassLow = true;
                    }
                    if (high == -1 || floorPrice <= high) {
                        isPassHigh = true;
                    }
                    if (isPassLow == false || isPassHigh == false) {
                        model.removeRow(i);
                        i--;
                        continue;
                    }
                } else if ("Quantity".equals(cmbType)) {
                    if (low == -1 || availability >= low) {
                        isPassLow = true;
                    }
                    if (high == -1 || availability <= high) {
                        isPassHigh = true;
                    }
                    if (isPassLow == false || isPassHigh == false) {
                        model.removeRow(i);
                        i--;
                        continue;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Unrichable code.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("[Error] Unrichable code executed [Class: SearchProduct, Method: btnSearchActionPerformed]");
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to read data from the table. Search failed.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("[Warning] Unable to read data from the table. Search failed. [Class: SearchProduct, Method: btnSearchActionPerformed]");
        }
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbPrice;
    private javax.swing.JLabel lblBetween;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTo;
    private javax.swing.JTextField txtHigh;
    private javax.swing.JTextField txtLow;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
