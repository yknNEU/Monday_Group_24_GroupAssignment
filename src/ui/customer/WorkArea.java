/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customer;

/**
 *
 * @author prasa
 */
public class WorkArea extends javax.swing.JPanel {

    /**
     * Creates new form WorkArea
     */
    public WorkArea() {
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

        lblTitle = new javax.swing.JLabel();
        btnBrowseCatalog = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnViewCart = new javax.swing.JButton();
        btnViewTransactions = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Welcome valuable Customer!");
        lblTitle.setIconTextGap(20);

        btnBrowseCatalog.setText("Browse Product Catalog >>");
        btnBrowseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseCatalogActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");

        btnViewCart.setText("View your cart");

        btnViewTransactions.setText("View your transactions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBrowseCatalog))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewTransactions)
                            .addComponent(btnViewCart))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnLogout))
                .addGap(81, 81, 81)
                .addComponent(btnBrowseCatalog)
                .addGap(18, 18, 18)
                .addComponent(btnViewCart)
                .addGap(18, 18, 18)
                .addComponent(btnViewTransactions)
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseCatalogActionPerformed

    }//GEN-LAST:event_btnBrowseCatalogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseCatalog;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewCart;
    private javax.swing.JButton btnViewTransactions;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
