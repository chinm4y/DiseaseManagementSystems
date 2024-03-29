/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Admins.LaboratoryAdmin;
import Business.Ecosystem;
import Business.Model.City;
import Business.Model.Hospital;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shreya
 */
public class AddLabAdminJPanelUI extends javax.swing.JPanel {

    /**
     * Creates new form AddLabAdminJPanelUI
     */
    Ecosystem ecosystem;
        JPanel workArea;
    
    public AddLabAdminJPanelUI(JPanel workArea,Ecosystem e) {
        initComponents();
        this.ecosystem = e;
        this.workArea = workArea;
        populateCombos();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtLabAdminName = new javax.swing.JTextField();
        txtLabAdminUname = new javax.swing.JTextField();
        txtLabAdminPwd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtLabAdminCity = new javax.swing.JComboBox<>();
        txtLabAdminHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Lab Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Password:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 225, 102, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("City:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 264, 102, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Hospital:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 302, 95, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Laboratory Name:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 151, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Username:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 185, 102, -1));

        txtLabAdminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabAdminNameActionPerformed(evt);
            }
        });
        add(txtLabAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 148, 139, -1));

        txtLabAdminUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabAdminUnameActionPerformed(evt);
            }
        });
        add(txtLabAdminUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 182, 139, -1));

        txtLabAdminPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabAdminPwdActionPerformed(evt);
            }
        });
        add(txtLabAdminPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 222, 139, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Lab Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 366, 127, 35));

        add(txtLabAdminCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 140, -1));

        add(txtLabAdminHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 140, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/bg2 small.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLabAdminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabAdminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabAdminNameActionPerformed

    private void txtLabAdminUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabAdminUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabAdminUnameActionPerformed

    private void txtLabAdminPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabAdminPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabAdminPwdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:String labAdminName = txtLabAdminName.getText();
            String labAdminName = txtLabAdminName.getText();
            String labAdminUsername = txtLabAdminUname.getText();
            String labAdminPassword = txtLabAdminPwd.getText();
           String cityName = txtLabAdminCity.getSelectedItem().toString();
            String hospitalName =txtLabAdminHospital.getSelectedItem().toString();
            
            
     if(labAdminName.isEmpty() || labAdminUsername.isEmpty() || labAdminPassword.isEmpty() || cityName.isEmpty() || hospitalName.isEmpty())
     {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
     }
     
     else
     {            
             for(LaboratoryAdmin la  : ecosystem.getLaboratoryAdminList().getLaboratoryAdminList())
        {
            if((la.getUsername().equalsIgnoreCase(labAdminUsername))&& (la.getPassword().equalsIgnoreCase(labAdminPassword)))
            {          
                        JOptionPane.showMessageDialog(this, "Laboratory Admin's Username and password should be unique");
                        return;   
            }
        }
            
           
            
            City c = ecosystem.getCityList().findCityByCityName(cityName);
            Hospital h = ecosystem.getHospitalList().findHospitalByHospitalName(hospitalName);
            
            LaboratoryAdmin la = ecosystem.getLaboratoryAdminList().addLaboratoryAdmin();
            la.setName(labAdminName);
            la.setUsername(labAdminUsername);
            la.setPassword(labAdminPassword);
            la.setCity(c);
            la.setHospital(h);
            
                    JOptionPane.showMessageDialog(this, "Laboratory and Laboratory Admin added");
     }
            
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JComboBox<String> txtLabAdminCity;
    private javax.swing.JComboBox<String> txtLabAdminHospital;
    private javax.swing.JTextField txtLabAdminName;
    private javax.swing.JTextField txtLabAdminPwd;
    private javax.swing.JTextField txtLabAdminUname;
    // End of variables declaration//GEN-END:variables

    private void populateCombos() {
        if(!ecosystem.getCityList().getCityList().isEmpty()){
            for(City c: ecosystem.getCityList().getCityList()){
                txtLabAdminCity.addItem(c.getCityName());
            }
        }
        if(!ecosystem.getHospitalList().getHospitalList().isEmpty()){
            for(Hospital h : ecosystem.getHospitalList().getHospitalList()){
                txtLabAdminHospital.addItem(h.getHospitalName());
            }
        }
    }
}
