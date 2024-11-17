/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JOptionPane;

import model.Business.Business;
import model.UserAccountManagement.UserAccount;

/**
 *
 * @author prasa
 */
public class WorkArea extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private UserAccount userAccount;

    /**
     * Creates new form WorkArea
     */
    public WorkArea(Container ui, Business business, UserAccount userAccount) {
        this.ui = ui;
        this.business = business;
        this.userAccount = userAccount;
        initComponents();
        setWelcomeName(userAccount.getProfile().getPerson().getPersonId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnManagePerson = new javax.swing.JButton();
        btnViewProdReport = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setText("Welcome, Administrator!");

        btnManagePerson.setText("Manage Person");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        btnViewProdReport.setText("View Product report");
        btnViewProdReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProdReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnManagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnViewProdReport)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(15, 15, 15)
                .addComponent(btnLogout)
                .addGap(18, 18, 18)
                .addComponent(btnManagePerson)
                .addGap(18, 18, 18)
                .addComponent(btnViewProdReport)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        ui.remove(this);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        ManagePerson managePerson = new ManagePerson(ui, business, userAccount);
        ui.add("ManagePerson" + managePerson.toString(), managePerson);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void btnViewProdReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProdReportActionPerformed
        // TODO: Unimplemented
        JOptionPane.showMessageDialog(this, "Not implemented.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnViewProdReportActionPerformed

    public void setWelcomeName(String name) {
        lblTitle.setText("Welcome, " + name + "!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JButton btnViewProdReport;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
