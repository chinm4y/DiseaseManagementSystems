/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Shreya
 */
public class AddCityJPanelUI extends javax.swing.JPanel {

    /**
     * Creates new form AddCityJPanelUI
     */ 
        Ecosystem ecosystem;
        JPanel workArea;
    public AddCityJPanelUI(JPanel workArea,Ecosystem e) {
        
        initComponents();
        this.ecosystem = e;
        this.workArea = workArea;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCItyName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCItyName1 = new javax.swing.JTextField();
        btnSaveCity = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        txtCItyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCItyNameActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(102, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add City");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("City (network ) Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 154, -1, -1));

        txtCItyName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCItyName1ActionPerformed(evt);
            }
        });
        add(txtCItyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 151, 167, -1));

        btnSaveCity.setBackground(new java.awt.Color(0, 0, 0));
        btnSaveCity.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCity.setText("Save");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });
        add(btnSaveCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 110, 40));

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/bg2 small.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
CardLayout cardLayout = (CardLayout) workArea.getLayout();
        workArea.remove(this);
        cardLayout.previous(workArea);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCItyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCItyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCItyNameActionPerformed

    private void txtCItyName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCItyName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCItyName1ActionPerformed

    private void btnSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCItyName;
    private javax.swing.JTextField txtCItyName1;
    // End of variables declaration//GEN-END:variables
}
