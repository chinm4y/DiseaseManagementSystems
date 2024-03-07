/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Dashboard.Patient;

import Business.Model.Patient;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shreya
 */
public class PatientRaiseReqJPanelUI extends javax.swing.JPanel {

    /**
     * Creates new form PatientRaiseReqJPanelUI
     */
    Patient patient;
    JPanel workArea;
    public PatientRaiseReqJPanelUI(Patient p,JPanel workArea) {
        initComponents();
        this.patient = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtPatientEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Raise a request to NGO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 287, -1, 37));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Raise a request to NGO!");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Raise Request to NGO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 36, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));
        add(txtPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 220, -1));

        jLabel3.setText("Email : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/Patient/bg2 small.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(txtPatientEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter email before proceeding");
        }
        else{
        patient.setEmail(txtPatientEmail.getText());
        patient.setNgoRequest(true);
        JOptionPane.showMessageDialog(this, "Request for NGO funds is raised");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) workArea.getLayout();
        workArea.remove(this);
        cardLayout.previous(workArea);    
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPatientEmail;
    // End of variables declaration//GEN-END:variables
}
