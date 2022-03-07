
package bankapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ÖZGENUR YILDIZ
 */
public class frmKullaniciBtns extends javax.swing.JFrame {

    /**
     * Creates new form frmKullaniciBtns
     */
    public frmKullaniciBtns() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBtns = new javax.swing.JPanel();
        btnDovizAltin = new javax.swing.JButton();
        btnAnaMenu = new javax.swing.JButton();
        btnEFT = new javax.swing.JButton();
        btnParaYatir = new javax.swing.JButton();
        btnParaCek = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBtns.setBackground(new java.awt.Color(102, 102, 102));
        pnlBtns.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "İşlemler ..", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlBtns.setFont(new java.awt.Font("OCR A Extended", 3, 14)); // NOI18N

        btnDovizAltin.setBackground(new java.awt.Color(0, 0, 0));
        btnDovizAltin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDovizAltin.setForeground(new java.awt.Color(255, 255, 255));
        btnDovizAltin.setText("Döviz ve Altın");
        btnDovizAltin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDovizAltinActionPerformed(evt);
            }
        });

        btnAnaMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnAnaMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnaMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnAnaMenu.setText("Ana Menü");
        btnAnaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaMenuActionPerformed(evt);
            }
        });

        btnEFT.setBackground(new java.awt.Color(0, 0, 0));
        btnEFT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEFT.setForeground(new java.awt.Color(255, 255, 255));
        btnEFT.setText("Başka Hesaba Havale/ EFT");
        btnEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEFTActionPerformed(evt);
            }
        });

        btnParaYatir.setBackground(new java.awt.Color(0, 0, 0));
        btnParaYatir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnParaYatir.setForeground(new java.awt.Color(255, 255, 255));
        btnParaYatir.setText("Para Yatır");
        btnParaYatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaYatirActionPerformed(evt);
            }
        });

        btnParaCek.setBackground(new java.awt.Color(0, 0, 0));
        btnParaCek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnParaCek.setForeground(new java.awt.Color(255, 255, 255));
        btnParaCek.setText("Para Cek");
        btnParaCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaCekActionPerformed(evt);
            }
        });

        btnCikis.setBackground(new java.awt.Color(0, 0, 0));
        btnCikis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCikis.setForeground(new java.awt.Color(255, 255, 255));
        btnCikis.setText("Güvenli Çıkış Yap");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnsLayout = new javax.swing.GroupLayout(pnlBtns);
        pnlBtns.setLayout(pnlBtnsLayout);
        pnlBtnsLayout.setHorizontalGroup(
            pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEFT, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(btnParaYatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnParaCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAnaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDovizAltin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCikis, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlBtnsLayout.setVerticalGroup(
            pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnsLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDovizAltin, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnParaCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnParaYatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEFT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(pnlBtns);
        pnlBtns.setBounds(10, 50, 420, 180);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankapp/whiteBackground2.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 480, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParaCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaCekActionPerformed
        // TODO add your handling code here:
        frmParaCek paraCek=new frmParaCek();
        paraCek.setVisible(true);
        paraCek.setLocationRelativeTo(null);
        paraCek.setTitle("Para Çekme Ekranı ..");
        paraCek.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnParaCekActionPerformed

    private void btnParaYatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaYatirActionPerformed
        // TODO add your handling code here:
         frmParaYatir paraYatir=new frmParaYatir();
        paraYatir.setVisible(true);
        paraYatir.setLocationRelativeTo(null);
        paraYatir.setTitle("Para Yatırma Ekranı ..");
        paraYatir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnParaYatirActionPerformed

    private void btnDovizAltinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDovizAltinActionPerformed
        // TODO add your handling code here:
        frmDovizAltin dovizAltin=new frmDovizAltin();
        dovizAltin.setVisible(true);
        dovizAltin.setSize(450,350);
        dovizAltin.setTitle("Döviz Altın Ekranı ..");
        dovizAltin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnDovizAltinActionPerformed

    private void btnEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEFTActionPerformed
        // TODO add your handling code here:
        frmEFT EFT=new frmEFT();
        EFT.setVisible(true);
        EFT.setSize(420,360);
        EFT.setResizable(false);
        EFT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnEFTActionPerformed

    private void btnAnaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaMenuActionPerformed
        // TODO add your handling code here:
        frmKullaniciEkran anaMenu=new frmKullaniciEkran();
        anaMenu.setVisible(true);
        anaMenu.setSize(485,280);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnaMenuActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        // TODO add your handling code here:
       int input=JOptionPane.showConfirmDialog(rootPane, "Çıkış yapmak istediğinizden emin misiniz?");
       if(input==0){
        frmBankApp cikis=new frmBankApp();
        cikis.setVisible(true);
        cikis.setSize(464,435);
        this.setVisible(false);
       }
    }//GEN-LAST:event_btnCikisActionPerformed

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
            java.util.logging.Logger.getLogger(frmKullaniciBtns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciBtns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciBtns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciBtns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKullaniciBtns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnaMenu;
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnDovizAltin;
    private javax.swing.JButton btnEFT;
    private javax.swing.JButton btnParaCek;
    private javax.swing.JButton btnParaYatir;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JPanel pnlBtns;
    // End of variables declaration//GEN-END:variables
}
