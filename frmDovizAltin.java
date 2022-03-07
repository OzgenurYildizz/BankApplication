/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankapp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmDovizAltin extends javax.swing.JFrame {
 frmKullaniciEkran frm=new frmKullaniciEkran();
 String fileName="C:\\Users\\ÖZGENUR YILDIZ\\Documents\\NetBeansProjects\\BankApp\\src\\bankapp\\bankaKullanici.txt";
 String dolarAl1;
 String euroAl1;
 String altinAl1;

    public frmDovizAltin() {
        initComponents();
        lblDolar.setText(frm.dolar1);
          lblEuro.setText(frm.euro1);
            lblAltin.setText(frm.altin1);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lblDolarYazi = new javax.swing.JLabel();
        lblEuroYazi = new javax.swing.JLabel();
        lblAltinYazi = new javax.swing.JLabel();
        lblDolarAlis = new javax.swing.JLabel();
        btnDolarAl = new javax.swing.JButton();
        lblEuroAlis = new javax.swing.JLabel();
        btnEuroAlis = new javax.swing.JButton();
        lblAltinAlis = new javax.swing.JLabel();
        btnAltinAlis = new javax.swing.JButton();
        lblBakiyeYazi = new javax.swing.JLabel();
        lblDolar = new javax.swing.JLabel();
        lblAltin = new javax.swing.JLabel();
        lblEuro = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblDolarYazi.setFont(new java.awt.Font("OCR A Extended", 3, 12)); // NOI18N
        lblDolarYazi.setForeground(new java.awt.Color(255, 255, 255));
        lblDolarYazi.setText("Guncel Dolar Kuru :");
        getContentPane().add(lblDolarYazi);
        lblDolarYazi.setBounds(20, 40, 150, 20);

        lblEuroYazi.setFont(new java.awt.Font("NSimSun", 3, 12)); // NOI18N
        lblEuroYazi.setForeground(new java.awt.Color(255, 255, 255));
        lblEuroYazi.setText("Guncel Euro Kuru :");
        getContentPane().add(lblEuroYazi);
        lblEuroYazi.setBounds(20, 130, 130, 20);

        lblAltinYazi.setFont(new java.awt.Font("OCR A Extended", 3, 12)); // NOI18N
        lblAltinYazi.setForeground(new java.awt.Color(255, 255, 255));
        lblAltinYazi.setText("Guncel Altın Kuru :");
        getContentPane().add(lblAltinYazi);
        lblAltinYazi.setBounds(20, 220, 210, 20);

        lblDolarAlis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDolarAlis.setForeground(new java.awt.Color(255, 255, 255));
        lblDolarAlis.setText("11.89");
        getContentPane().add(lblDolarAlis);
        lblDolarAlis.setBounds(30, 80, 37, 16);

        btnDolarAl.setBackground(new java.awt.Color(204, 204, 204));
        btnDolarAl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDolarAl.setForeground(new java.awt.Color(0, 0, 0));
        btnDolarAl.setText("Alış");
        btnDolarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolarAlActionPerformed(evt);
            }
        });
        getContentPane().add(btnDolarAl);
        btnDolarAl.setBounds(80, 70, 77, 30);

        lblEuroAlis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEuroAlis.setForeground(new java.awt.Color(255, 255, 255));
        lblEuroAlis.setText("13.42");
        getContentPane().add(lblEuroAlis);
        lblEuroAlis.setBounds(30, 170, 37, 16);

        btnEuroAlis.setBackground(new java.awt.Color(204, 204, 204));
        btnEuroAlis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEuroAlis.setForeground(new java.awt.Color(0, 0, 0));
        btnEuroAlis.setText("Alış");
        btnEuroAlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuroAlisActionPerformed(evt);
            }
        });
        getContentPane().add(btnEuroAlis);
        btnEuroAlis.setBounds(80, 160, 77, 30);

        lblAltinAlis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAltinAlis.setForeground(new java.awt.Color(255, 255, 255));
        lblAltinAlis.setText("690.17");
        getContentPane().add(lblAltinAlis);
        lblAltinAlis.setBounds(30, 260, 50, 16);

        btnAltinAlis.setBackground(new java.awt.Color(204, 204, 204));
        btnAltinAlis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAltinAlis.setForeground(new java.awt.Color(0, 0, 0));
        btnAltinAlis.setText("Alış");
        btnAltinAlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltinAlisActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltinAlis);
        btnAltinAlis.setBounds(80, 250, 77, 30);

        lblBakiyeYazi.setFont(new java.awt.Font("OCR A Extended", 3, 14)); // NOI18N
        lblBakiyeYazi.setForeground(new java.awt.Color(255, 255, 255));
        lblBakiyeYazi.setText("Bakiyeniz ");
        getContentPane().add(lblBakiyeYazi);
        lblBakiyeYazi.setBounds(170, 10, 100, 20);

        lblDolar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDolar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblDolar);
        lblDolar.setBounds(170, 70, 72, 30);

        lblAltin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAltin.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblAltin);
        lblAltin.setBounds(170, 252, 72, 30);

        lblEuro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEuro.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblEuro);
        lblEuro.setBounds(170, 163, 72, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankapp/kurEkraniBackground.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 450, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDolarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolarAlActionPerformed

        dolarAl1=lblDolarAlis.getText();
       double bakiye=Double.parseDouble(frm.dolar1); 
       double dolarAl=Double.parseDouble(dolarAl1);
       bakiye=bakiye+dolarAl;
       frm.dolar1=Double.toString(bakiye);
       lblDolar.setText(frm.dolar1);
      
    try {
        FileWriter fWriter = new FileWriter(fileName);
        fWriter.write(frm.bakiye1+"Ozgenur\n"+"030120042\n"+frm.dolar1+"\n"+frm.euro1+"\n"+frm.altin1);
        fWriter.close();
           } catch (IOException ex) {
        Logger.getLogger(frmParaCek.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_btnDolarAlActionPerformed

    private void btnEuroAlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuroAlisActionPerformed
        // TODO add your handling code here:
        
        euroAl1=lblEuroAlis.getText();
       double bakiye=Double.parseDouble(frm.euro1); 
       double euroAl=Double.parseDouble(euroAl1);
       bakiye=bakiye+euroAl;
       frm.euro1=Double.toString(bakiye);
       lblEuro.setText(frm.euro1);
      
    try {
        FileWriter fWriter = new FileWriter(fileName);
        fWriter.write(frm.bakiye1+"Ozgenur\n"+"030120042\n"+frm.dolar1+"\n"+frm.euro1+"\n"+frm.altin1);
        fWriter.close();
           } catch (IOException ex) {
        Logger.getLogger(frmParaCek.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_btnEuroAlisActionPerformed

    private void btnAltinAlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltinAlisActionPerformed
        // TODO add your handling code here:
           altinAl1=lblAltinAlis.getText();
       double bakiye=Double.parseDouble(frm.altin1); 
       double altinAl=Double.parseDouble(altinAl1);
       bakiye=bakiye+altinAl;
       frm.altin1=Double.toString(bakiye);
       lblAltin.setText(frm.altin1);
      
    try {
        FileWriter fWriter = new FileWriter(fileName);
        fWriter.write(frm.bakiye1+"Ozgenur\n"+"030120042\n"+frm.dolar1+"\n"+frm.euro1+"\n"+frm.altin1);
        fWriter.close();
           } catch (IOException ex) {
        Logger.getLogger(frmParaCek.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_btnAltinAlisActionPerformed

   
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
            java.util.logging.Logger.getLogger(frmDovizAltin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDovizAltin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDovizAltin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDovizAltin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               frmDovizAltin frmdovizAltin =new frmDovizAltin();
            
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltinAlis;
    private javax.swing.JButton btnDolarAl;
    private javax.swing.JButton btnEuroAlis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltin;
    private javax.swing.JLabel lblAltinAlis;
    private javax.swing.JLabel lblAltinYazi;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBakiyeYazi;
    private javax.swing.JLabel lblDolar;
    private javax.swing.JLabel lblDolarAlis;
    private javax.swing.JLabel lblDolarYazi;
    private javax.swing.JLabel lblEuro;
    private javax.swing.JLabel lblEuroAlis;
    private javax.swing.JLabel lblEuroYazi;
    // End of variables declaration//GEN-END:variables
}
