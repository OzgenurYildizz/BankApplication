/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class frmParaCek extends javax.swing.JFrame {
String ucret1;
frmKullaniciEkran frm=new frmKullaniciEkran();
    public frmParaCek() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlParaCek = new javax.swing.JPanel();
        lblBakiyeYazi = new javax.swing.JLabel();
        lblUcretCek = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();
        lblBakiye = new javax.swing.JLabel();
        lblMoneyIcon = new javax.swing.JLabel();
        txtUcretCek = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlParaCek.setBackground(new java.awt.Color(51, 51, 51));

        lblBakiyeYazi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBakiyeYazi.setForeground(new java.awt.Color(255, 255, 255));

        lblUcretCek.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblUcretCek.setForeground(new java.awt.Color(255, 255, 255));
        lblUcretCek.setText("Çekmek istediginiz ucreti girin :");

        btnCek.setBackground(new java.awt.Color(204, 204, 204));
        btnCek.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCek.setForeground(new java.awt.Color(0, 0, 0));
        btnCek.setText("Parayı Çek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        lblBakiye.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblBakiye.setForeground(new java.awt.Color(255, 255, 255));
        lblBakiye.setText("Yeni Bakiyeniz :");

        lblMoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankapp/refund_100px.png"))); // NOI18N
        lblMoneyIcon.setText("jLabel1");

        javax.swing.GroupLayout pnlParaCekLayout = new javax.swing.GroupLayout(pnlParaCek);
        pnlParaCek.setLayout(pnlParaCekLayout);
        pnlParaCekLayout.setHorizontalGroup(
            pnlParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParaCekLayout.createSequentialGroup()
                .addGroup(pnlParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlParaCekLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblBakiye)
                        .addGap(18, 18, 18)
                        .addComponent(lblBakiyeYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlParaCekLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCek, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlParaCekLayout.createSequentialGroup()
                                .addComponent(lblUcretCek, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUcretCek, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlParaCekLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblMoneyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlParaCekLayout.setVerticalGroup(
            pnlParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParaCekLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblMoneyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUcretCek, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUcretCek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnCek, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlParaCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBakiye, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBakiyeYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnlParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
   
        // TODO add your handling code here:
        ucret1=txtUcretCek.getText();
       double bakiye=Double.parseDouble(frm.bakiye1); 
       double ucret=Double.parseDouble(ucret1);
       if(bakiye>=ucret){
       bakiye=bakiye-ucret;
       frm.bakiye1=Double.toString(bakiye);
       lblBakiyeYazi.setText(frm.bakiye1);
        
        String fileName="C:\\Users\\ÖZGENUR YILDIZ\\Documents\\NetBeansProjects\\BankApp\\src\\bankapp\\bankaKullanici.txt";
    try {
        FileWriter fWriter = new FileWriter(fileName);
        fWriter.write(frm.bakiye1+"\nOzgenur"+"\n030120042"+"\n0\n0\n0");
        fWriter.close();
           } catch (IOException ex) {
        Logger.getLogger(frmParaCek.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
       else
       {
           JOptionPane.showMessageDialog(rootPane, "Yetersiz Bakiye");
       }
         
    }//GEN-LAST:event_btnCekActionPerformed
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmParaCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmParaCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmParaCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmParaCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmParaCek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblBakiyeYazi;
    private javax.swing.JLabel lblMoneyIcon;
    private javax.swing.JLabel lblUcretCek;
    private javax.swing.JPanel pnlParaCek;
    private javax.swing.JTextField txtUcretCek;
    // End of variables declaration//GEN-END:variables
}
