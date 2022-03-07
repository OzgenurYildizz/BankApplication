/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class frmKullaniciEkran extends javax.swing.JFrame {

    String bakiye1;
    String iban1;
    String ad1;
    String dolar1;
    String altin1;
    String euro1;
    
    public frmKullaniciEkran()  {
        initComponents();
        readFile("C:\\Users\\ÖZGENUR YILDIZ\\Documents\\NetBeansProjects\\BankApp\\src\\bankapp\\bankaKullanici.txt");
    }
     public void readFile(String fileName)
    {
        String fileDataStr = "";
        int satir=0;
        
        try{
            FileReader fileReader = new FileReader(fileName);
            Scanner inFile = new Scanner(fileReader);
            
            while(inFile.hasNext() == true)
           {
                fileDataStr = fileDataStr + inFile.nextLine() + "\n";
                 satir++;
               
                 switch(satir)
                 {
                     case 1:
                       bakiye1=fileDataStr;
                       lblBakiyeYazi.setText(bakiye1);
                         fileDataStr="";
                         break;
                     case 2:
                        ad1=fileDataStr; 
                        lblMerhaba.setText("Merhaba "+ad1+ " .."); 
                        fileDataStr="";
                      break;
                      
                     case 3:
                         iban1=fileDataStr;
                         lblIbanYazi.setText(iban1);
                           fileDataStr="";
                           break;
                     case 4:
                         dolar1=fileDataStr;
                          fileDataStr="";
                           break;
                     case 5:
                         euro1=fileDataStr;
                          fileDataStr="";
                           break;
                     case 6:
                         altin1=fileDataStr;
                          fileDataStr="";
                           break;
                     default :
                         System.out.print("Bir hata ile karşılaştık :(");
                         break;
                 }
            }
            inFile.close();
            fileReader.close();
        }
        catch(IOException error)
        {
            lblBakiyeYazi.setText("Error was handled...");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHesap = new javax.swing.JPanel();
        lblBakiyeYazi = new javax.swing.JLabel();
        lblIban = new javax.swing.JLabel();
        lblHesabim = new javax.swing.JLabel();
        lblIbanYazi = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        lblMerhaba = new javax.swing.JLabel();
        btnIslemler = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlHesap.setBackground(new java.awt.Color(51, 51, 51));
        pnlHesap.setForeground(new java.awt.Color(204, 204, 255));

        lblBakiyeYazi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBakiyeYazi.setForeground(new java.awt.Color(255, 255, 255));

        lblIban.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIban.setForeground(new java.awt.Color(255, 255, 255));
        lblIban.setText("IBAN :");

        lblHesabim.setBackground(new java.awt.Color(255, 255, 255));
        lblHesabim.setFont(new java.awt.Font("OCR A Extended", 3, 18)); // NOI18N
        lblHesabim.setForeground(new java.awt.Color(255, 255, 255));
        lblHesabim.setText("      *Hesabım*");

        lblIbanYazi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIbanYazi.setForeground(new java.awt.Color(255, 255, 255));

        lblBakiye.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblBakiye.setForeground(new java.awt.Color(255, 255, 255));
        lblBakiye.setText("Bakiye :");

        javax.swing.GroupLayout pnlHesapLayout = new javax.swing.GroupLayout(pnlHesap);
        pnlHesap.setLayout(pnlHesapLayout);
        pnlHesapLayout.setHorizontalGroup(
            pnlHesapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(lblIban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlHesapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBakiyeYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIbanYazi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHesapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHesabim, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        pnlHesapLayout.setVerticalGroup(
            pnlHesapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHesabim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlHesapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBakiyeYazi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBakiye))
                .addGap(18, 18, 18)
                .addGroup(pnlHesapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIbanYazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pnlHesap);
        pnlHesap.setBounds(40, 30, 392, 140);

        lblMerhaba.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(lblMerhaba);
        lblMerhaba.setBounds(45, 6, 113, 20);

        btnIslemler.setBackground(new java.awt.Color(0, 0, 0));
        btnIslemler.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIslemler.setForeground(new java.awt.Color(255, 255, 255));
        btnIslemler.setText("İslemler Ekranı");
        btnIslemler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIslemlerActionPerformed(evt);
            }
        });
        getContentPane().add(btnIslemler);
        btnIslemler.setBounds(60, 190, 120, 30);

        btnCikis.setBackground(new java.awt.Color(0, 0, 0));
        btnCikis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCikis.setForeground(new java.awt.Color(255, 255, 255));
        btnCikis.setText("Güvenli Çıkış Yap");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });
        getContentPane().add(btnCikis);
        btnCikis.setBounds(280, 190, 130, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankapp/whiteBackground1.jpg.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 470, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIslemlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIslemlerActionPerformed
        frmKullaniciBtns islemler=new frmKullaniciBtns();
        islemler.setVisible(true);
        islemler.setTitle("İşlemler Ekranı ..");
        islemler.setResizable(false);
        islemler.setSize(485,280);
        this.setVisible(false);
    }//GEN-LAST:event_btnIslemlerActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
      
        int input=JOptionPane.showConfirmDialog(rootPane, "Çıkış yapmak istediğinizden emin misiniz?");
        if(input==0){
        frmBankApp cikis=new frmBankApp();
        cikis.setVisible(true);
        cikis.setSize(464,435);
        this.setVisible(false);
        }      
    }//GEN-LAST:event_btnCikisActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new frmKullaniciEkran().setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnIslemler;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblBakiyeYazi;
    private javax.swing.JLabel lblHesabim;
    private javax.swing.JLabel lblIban;
    private javax.swing.JLabel lblIbanYazi;
    private javax.swing.JLabel lblMerhaba;
    private javax.swing.JPanel pnlHesap;
    // End of variables declaration//GEN-END:variables
}
