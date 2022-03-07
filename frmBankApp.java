/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankapp;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmBankApp extends javax.swing.JFrame {

    /**
     * Creates new form frmBankApp
     **/
    
    public frmBankApp() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGiris = new javax.swing.JButton();
        lblSifre = new javax.swing.JLabel();
        lblAd = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();
        lblHosgeldiniz = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        lblDomuzLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnGiris.setBackground(new java.awt.Color(255, 255, 255));
        btnGiris.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnGiris.setForeground(new java.awt.Color(0, 0, 0));
        btnGiris.setText("Giriş Yap");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnGiris);
        btnGiris.setBounds(190, 310, 90, 30);

        lblSifre.setFont(new java.awt.Font("OCR A Extended", 3, 16)); // NOI18N
        lblSifre.setForeground(new java.awt.Color(255, 255, 255));
        lblSifre.setText("Sifre :");
        getContentPane().add(lblSifre);
        lblSifre.setBounds(80, 270, 77, 16);

        lblAd.setBackground(new java.awt.Color(255, 255, 255));
        lblAd.setFont(new java.awt.Font("OCR A Extended", 3, 16)); // NOI18N
        lblAd.setForeground(new java.awt.Color(255, 255, 255));
        lblAd.setText("Kullanıcı Adı :");
        getContentPane().add(lblAd);
        lblAd.setBounds(10, 230, 230, 30);
        getContentPane().add(txtSifre);
        txtSifre.setBounds(170, 270, 130, 30);

        lblHosgeldiniz.setFont(new java.awt.Font("OCR A Extended", 3, 16)); // NOI18N
        lblHosgeldiniz.setForeground(new java.awt.Color(255, 255, 255));
        lblHosgeldiniz.setText("HOSGELDINIZ ..");
        lblHosgeldiniz.setToolTipText("HOSGELDİNİZ ..");
        getContentPane().add(lblHosgeldiniz);
        lblHosgeldiniz.setBounds(10, 20, 150, 30);
        getContentPane().add(txtAd);
        txtAd.setBounds(170, 232, 130, 30);

        lblDomuzLogo.setFont(new java.awt.Font("OCR A Extended", 3, 16)); // NOI18N
        lblDomuzLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankapp/domuzLogo.png"))); // NOI18N
        lblDomuzLogo.setText("HOŞGELDİNİZ ..");
        lblDomuzLogo.setToolTipText("");
        getContentPane().add(lblDomuzLogo);
        lblDomuzLogo.setBounds(0, 0, 450, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        // TODO add your handling code here:
         
         if("Ozgenur".equals(txtAd.getText())&& "1234".equals(txtSifre.getText()))
         {
            frmKullaniciEkran frmkullaniciEkran=new frmKullaniciEkran();
                frmkullaniciEkran.setVisible(true);
                this.setVisible(false);
                frmkullaniciEkran.setTitle("Giriş Paneli");
                frmkullaniciEkran.setResizable(false);
                frmkullaniciEkran.setSize(460,290);
                
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Yanlış kullanıcı adi veya şifre girdiniz. ","Hata ..",JOptionPane.WARNING_MESSAGE);
             txtAd.setText("");
             txtSifre.setText("");
         }
  
    }//GEN-LAST:event_btnGirisActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmBankApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBankApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBankApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBankApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBankApp frmbankApp=new frmBankApp();
                frmbankApp.setVisible(true);
                frmbankApp.setTitle("Giriş Paneli");
                frmbankApp.setResizable(false);
                frmbankApp.setSize(464,435);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblDomuzLogo;
    private javax.swing.JLabel lblHosgeldiniz;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JTextField txtAd;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
