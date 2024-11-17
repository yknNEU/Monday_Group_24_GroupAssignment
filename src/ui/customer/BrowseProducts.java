/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customer;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Business.Business;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.ProductManagement.Product;
import model.ProductManagement.SolutionOffer;
import model.SalesManagement.SalesPersonProfile;
import model.UserAccountManagement.UserAccount;

/**
 *
 * @author prasa
 */
public class BrowseProducts extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private UserAccount userAccount;

    /**
     * Creates new form BrowseProducts
     */
    public BrowseProducts(Container ui, Business business, UserAccount userAccount) {
        this.ui = ui;
        this.business = business;
        this.userAccount = userAccount;
        initComponents();
        populateCmb();
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

        lblProductCatalogue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblSalesPrice = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        spnQuantity = new javax.swing.JSpinner();
        lblSupplier = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        cmbSupplier = new javax.swing.JComboBox();
        btnProductDetails = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        btnViewCart = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblProductCatalogue.setText("Product Catalog:");

        tblProductCatalog.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        lblSalesPrice.setText("Sales Price:");

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Have a wonderful shopping experience!");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        lblQuantity.setText("Quantity:");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblSupplier.setText("Supplier:");

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        btnProductDetails.setText("View Product Details");
        btnProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDetailsActionPerformed(evt);
            }
        });

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnViewCart.setText("View your cart");
        btnViewCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCartActionPerformed(evt);
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
                                .addGap(6, 6, 6)
                                .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchProduct))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblProductCatalogue))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblSalesPrice)
                                .addGap(12, 12, 12)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblQuantity)
                                .addGap(6, 6, 6)
                                .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnViewCart))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitle)
                .addGap(1, 1, 1)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(lblProductCatalogue)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart)
                    .addComponent(btnProductDetails)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalesPrice)
                            .addComponent(lblQuantity))))
                .addGap(52, 52, 52)
                .addComponent(btnViewCart)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int selectedRow = tblProductCatalog.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a product to add to cart.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Product product = (Product) tblProductCatalog.getValueAt(selectedRow, 0);
        OrderItem orderItem = new OrderItem(product, product.getAvailable().getActualPrice(), (int) spnQuantity.getValue());
        Person person = (Person) cmbSupplier.getSelectedItem();
        SalesPersonProfile salesPersonProfile = business.getSalesPersonDirectory().findSalesPerson(person.getPersonId());
        CustomerProfile yourOwnProfile = (CustomerProfile) userAccount.getProfile();
        yourOwnProfile.addItemToCart(orderItem, yourOwnProfile, salesPersonProfile);
        JOptionPane.showMessageDialog(this, "Product added to cart successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        populateTable();
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDetailsActionPerformed
        int row = tblProductCatalog.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a product to view details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Product product = (Product) tblProductCatalog.getValueAt(row, 0);
        ViewProduct viewProduct = new ViewProduct(ui, business, product);
        ui.add("ViewProduct" + viewProduct.toString(), viewProduct);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnProductDetailsActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        String keyword = txtSearch.getText();
        if (keyword.isEmpty()) {
            populateTable();
        }
        populateTable(keyword);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCartActionPerformed
        ViewCart viewCart = new ViewCart(ui, business, userAccount);
        ui.add("ViewCart" + viewCart.toString(), viewCart);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnViewCartActionPerformed

    public void populateCmb() {
        cmbSupplier.removeAllItems();
        for (SolutionOffer solutionOffer : business.getSolutionOfferCatalog().getSolutionOffers()) {
            cmbSupplier.addItem(solutionOffer.getSalesPerson());
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);
        Person person = (Person) cmbSupplier.getSelectedItem();
        if (person == null) {
            return;
        }
        SolutionOffer solutionOffer = business.getSolutionOfferCatalog().findSolutionOffer(person.getPersonId());
        if (solutionOffer == null) {
            return;
        }
        for (Product product : solutionOffer.getProducts()) {
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getAvailable().getActualPrice();
            row[2] = product.getAvailable().getQuantity();
            model.addRow(row);
        }
    }

    public void populateTable(String keyword) {
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);
        for (SolutionOffer solutionOffer : business.getSolutionOfferCatalog().getSolutionOffers()) {
            for (Product product : solutionOffer.getProducts()) {
                if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    Object[] row = new Object[3];
                    row[0] = product;
                    row[1] = product.getAvailable().getActualPrice();
                    row[2] = product.getAvailable().getQuantity();
                    model.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProductDetails;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewCart;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProductCatalogue;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSalesPrice;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
