package bankapp;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frmEFT extends javax.swing.JFrame {
String ucret1;
frmKullaniciEkran frm=new frmKullaniciEkran();

    public frmEFT() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMasaj = new javax.swing.JLabel();
        lblIban = new javax.swing.JLabel();
        txtIban = new javax.swing.JTextField();
        lblAd = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        btnGonder = new javax.swing.JButton();
        lblUcret = new javax.swing.JLabel();
        txtUcret = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        btnDekont = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblMasaj.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblMasaj.setForeground(new java.awt.Color(255, 255, 255));
        lblMasaj.setText("Gondereceginiz kisinin ;");
        getContentPane().add(lblMasaj);
        lblMasaj.setBounds(10, 30, 230, 24);

        lblIban.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIban.setForeground(new java.awt.Color(255, 255, 255));
        lblIban.setText("IBAN");
        getContentPane().add(lblIban);
        lblIban.setBounds(20, 60, 37, 16);
        getContentPane().add(txtIban);
        txtIban.setBounds(20, 80, 165, 30);

        lblAd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAd.setForeground(new java.awt.Color(255, 255, 255));
        lblAd.setText("Ad");
        getContentPane().add(lblAd);
        lblAd.setBounds(20, 110, 37, 20);
        getContentPane().add(txtAd);
        txtAd.setBounds(20, 130, 165, 30);

        btnGonder.setBackground(new java.awt.Color(204, 204, 204));
        btnGonder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGonder.setForeground(new java.awt.Color(0, 0, 0));
        btnGonder.setText("Gönder");
        btnGonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGonderActionPerformed(evt);
            }
        });
        getContentPane().add(btnGonder);
        btnGonder.setBounds(230, 290, 110, 30);

        lblUcret.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUcret.setForeground(new java.awt.Color(255, 255, 255));
        lblUcret.setText("Ucret");
        getContentPane().add(lblUcret);
        lblUcret.setBounds(20, 170, 165, 16);
        getContentPane().add(txtUcret);
        txtUcret.setBounds(20, 190, 165, 30);

        lblText.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Bilgelerini girin.");
        getContentPane().add(lblText);
        lblText.setBounds(10, 240, 200, 15);

        btnDekont.setBackground(new java.awt.Color(204, 204, 204));
        btnDekont.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDekont.setForeground(new java.awt.Color(0, 0, 0));
        btnDekont.setText("Dekont Al");
        btnDekont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDekontActionPerformed(evt);
            }
        });
        getContentPane().add(btnDekont);
        btnDekont.setBounds(230, 250, 110, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankapp/eftBackground.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-90, 0, 500, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGonderActionPerformed
        // TODO add your handling code here:
        
       ucret1=txtUcret.getText();
       double bakiye=Double.parseDouble(frm.bakiye1); 
       double ucret=Double.parseDouble(ucret1);
       if(bakiye>=(ucret+0.60)){
           int input=JOptionPane.showConfirmDialog(null,"Para transfer ücreti 0,60TL dir.","Bilgilendirme",JOptionPane.INFORMATION_MESSAGE);
        if(input==0){
       bakiye=bakiye-(ucret+0.60);
       frm.bakiye1=Double.toString(bakiye);
       JOptionPane.showMessageDialog(rootPane, frm.bakiye1,"Güncel Bakiyeniz ..",JOptionPane.PLAIN_MESSAGE);
     
        String fileName="C:\\Users\\ÖZGENUR YILDIZ\\Documents\\NetBeansProjects\\BankApp\\src\\bankapp\\bankaKullanici.txt";
    try {
        FileWriter fWriter = new FileWriter(fileName);
        fWriter.write(frm.bakiye1+"\nOzgenur"+"\n030120042\n"+frm.dolar1+"\n"+frm.euro1+"\n"+frm.altin1);
        fWriter.close();
           } catch (IOException ex) {
        Logger.getLogger(frmParaCek.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Yetersiz Bakiye");
        }
        
    }//GEN-LAST:event_btnGonderActionPerformed

    private void btnDekontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDekontActionPerformed
        // TODO add your handling code here:
    try {
        FileWriter fWriter = new FileWriter("C:\\Users\\ÖZGENUR YILDIZ\\Documents\\NetBeansProjects\\BankApp\\src\\bankapp\\dekont.txt");
        fWriter.write("Gönderici kişinin adı: "+frm.ad1+
                      "Gönderilen miktar: "+txtUcret.getText()+"\n"+
                      "*********************\n"+
                      "Alıcı kişinin ibanı: "+txtIban.getText()+"\n"+
                      "Alıcı kişinin adı: "+txtAd.getText()+"\n"+
                      "*********************");
        fWriter.close();
    } catch (IOException ex) {
        Logger.getLogger(frmEFT.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_btnDekontActionPerformed

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
            java.util.logging.Logger.getLogger(frmEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEFT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDekont;
    private javax.swing.JButton btnGonder;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblIban;
    private javax.swing.JLabel lblMasaj;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblUcret;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtUcret;
    // End of variables declaration//GEN-END:variables
}
