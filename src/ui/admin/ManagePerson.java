/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Business.Business;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.UserAccountManagement.UserAccount;

/**
 *
 * @author prasa
 */
public class ManagePerson extends javax.swing.JPanel {

    private Container ui;
    private Business business;
    private UserAccount userAccount;

    /**
     * Creates new form ManageSupplier
     */
    public ManagePerson(Container ui, Business business, UserAccount userAccount) {
        this.ui = ui;
        this.business = business;
        this.userAccount = userAccount;
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

        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnViewPerson = new javax.swing.JButton();
        btnAddPerson = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Delete Person");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnViewPerson.setText("View Person");
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Person");

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personTable);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewPerson)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(12, 12, 12)
                .addComponent(btnBack)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPerson)
                    .addComponent(btnViewPerson)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemove)
                        .addComponent(btnSearch)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ui.remove(this);
        Component[] componentArray = ui.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (component instanceof WorkArea) {
            WorkArea workArea = (WorkArea) component;
            workArea.setWelcomeName(userAccount.getProfile().getPerson().getPersonId());
        }
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.previous(ui);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select the person you want to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Person person = (Person) personTable.getValueAt(row, 0);
        if (userAccount.getProfile().getPerson() == person) {
            JOptionPane.showMessageDialog(this, "You cannot delete yourself.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Person related account should be deleted
        // For security reasons, we still need to access the transaction history of the user, so we cannot delete the user instance
        if (person.getProfile() != null) {
            JOptionPane.showMessageDialog(this, "The user has associated account, you cannot delete it for security reasons.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        business.getPersonDirectory().getPersonList().remove(person);
        JOptionPane.showMessageDialog(this, "Person deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed
        int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select the person you want to view.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Person person = (Person) personTable.getValueAt(row, 0);
        ViewPerson viewPerson = new ViewPerson(ui, business, person);
        ui.add("ViewPerson" + viewPerson.toString(), viewPerson);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnViewPersonActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        CreatePerson addPerson = new CreatePerson(ui, business);
        ui.add("AddPerson" + addPerson.toString(), addPerson);
        CardLayout cardLayout = (CardLayout) ui.getLayout();
        cardLayout.next(ui);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO: Unimplemented
        JOptionPane.showMessageDialog(this, "Not implemented.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSearchActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        model.setRowCount(0);

        for (Person person : business.getPersonDirectory().getPersonList()) {
            Object[] row = new Object[2];
            row[0] = person;
            row[1] = person.getRole();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable personTable;
    // End of variables declaration//GEN-END:variables
}
