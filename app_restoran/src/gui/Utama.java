/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author RPL22
 */
public class Utama extends javax.swing.JFrame {
    ResultSet rs;
    /**
     * Creates new form index
     */
    public Utama() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DP = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        lblnamauser = new javax.swing.JLabel();
        lbliduser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblhakakses = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lbljam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenuItem();
        menudaftar = new javax.swing.JMenu();
        registrasi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuentrydata = new javax.swing.JMenu();
        masakan = new javax.swing.JMenuItem();
        level = new javax.swing.JMenuItem();
        menupesan = new javax.swing.JMenu();
        order = new javax.swing.JMenuItem();
        menutransaksi = new javax.swing.JMenu();
        transaksi = new javax.swing.JMenuItem();
        logtransaksi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane1.setForeground(new java.awt.Color(153, 153, 153));
        jLayeredPane1.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELAMAT DATANG");

        lblnamauser.setForeground(new java.awt.Color(255, 255, 255));
        lblnamauser.setText("Nama User");

        lbliduser.setBackground(new java.awt.Color(255, 255, 255));
        lbliduser.setForeground(new java.awt.Color(255, 255, 255));
        lbliduser.setText("lbliduser");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Anda disini sebagai");

        lblhakakses.setForeground(new java.awt.Color(255, 255, 255));
        lblhakakses.setText("Hak Akses");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Anda");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbliduser))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblhakakses)))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblnamauser)
                        .addGap(18, 18, 18))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblnamauser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbliduser)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblhakakses))
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblnamauser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lbliduser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblhakakses, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane2.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        lbljam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbljam.setForeground(new java.awt.Color(255, 0, 51));
        lbljam.setText("-");

        javax.swing.GroupLayout DPLayout = new javax.swing.GroupLayout(DP);
        DP.setLayout(DPLayout);
        DPLayout.setHorizontalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DPLayout.createSequentialGroup()
                .addContainerGap(754, Short.MAX_VALUE)
                .addGroup(DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                        .addGroup(DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLayeredPane1)
                            .addComponent(jLayeredPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                        .addComponent(lbljam)
                        .addGap(84, 84, 84))))
        );
        DPLayout.setVerticalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljam)
                .addContainerGap(789, Short.MAX_VALUE))
        );
        DP.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DP.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DP.setLayer(lbljam, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("jLabel1");

        menu.setText("Menu");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menu.add(logout);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        menu.add(keluar);

        jMenuBar1.add(menu);

        menudaftar.setText("Daftar");

        registrasi.setText("Registrasi User");
        registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrasiActionPerformed(evt);
            }
        });
        menudaftar.add(registrasi);

        jMenuBar1.add(menudaftar);
        jMenuBar1.add(jMenu2);

        menuentrydata.setText("Entry Data");

        masakan.setText("Masakan");
        masakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masakanActionPerformed(evt);
            }
        });
        menuentrydata.add(masakan);

        level.setText("Level");
        level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelActionPerformed(evt);
            }
        });
        menuentrydata.add(level);

        jMenuBar1.add(menuentrydata);

        menupesan.setText("Pesan");

        order.setText("Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        menupesan.add(order);

        jMenuBar1.add(menupesan);

        menutransaksi.setText("Transaksi");

        transaksi.setText("Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        menutransaksi.add(transaksi);

        logtransaksi.setText("Log Transaksi");
        logtransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logtransaksiActionPerformed(evt);
            }
        });
        menutransaksi.add(logtransaksi);

        jMenuBar1.add(menutransaksi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void masakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masakanActionPerformed
        // TODO add your handling code here:
        masakan m = new masakan();
        DP.add(m);
        m.setVisible(true);
    }//GEN-LAST:event_masakanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin ingin keluar dari Aplikasi ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
        System.exit(0);
        }
    }//GEN-LAST:event_keluarActionPerformed

    private void levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelActionPerformed
        // TODO add your handling code here:
        level l = new level(this,true);
        l.setVisible(true);
    }//GEN-LAST:event_levelActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(rootPane,"yakin ingin Logout ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
        dispose();
        login l = new login();
        l.setVisible(true);
        } 
    }//GEN-LAST:event_logoutActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        order o = new order(this, true);
        o.txtiduser.setText(lbliduser.getText());
        o.setVisible(true);
    }//GEN-LAST:event_orderActionPerformed

    private void registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrasiActionPerformed
        // TODO add your handling code here:
        user u = new user();
        DP.add(u);
        u.setVisible(true);
    }//GEN-LAST:event_registrasiActionPerformed

    private void logtransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logtransaksiActionPerformed
        // TODO add your handling code here:
        logtransaksi l = new logtransaksi(this, true);
        l.setVisible(true);
    }//GEN-LAST:event_logtransaksiActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        transaksi t = new transaksi(this, true);
        t.txtiduser.setText(lbliduser.getText());
        t.setVisible(true);
    }//GEN-LAST:event_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane DP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem keluar;
    public javax.swing.JLabel lblhakakses;
    public javax.swing.JLabel lbliduser;
    private javax.swing.JLabel lbljam;
    public javax.swing.JLabel lblnamauser;
    public javax.swing.JMenuItem level;
    private javax.swing.JMenuItem logout;
    public javax.swing.JMenuItem logtransaksi;
    public javax.swing.JMenuItem masakan;
    public javax.swing.JMenu menu;
    public javax.swing.JMenu menudaftar;
    public javax.swing.JMenu menuentrydata;
    public javax.swing.JMenu menupesan;
    public javax.swing.JMenu menutransaksi;
    public javax.swing.JMenuItem order;
    private javax.swing.JMenuItem registrasi;
    private javax.swing.JMenuItem transaksi;
    // End of variables declaration//GEN-END:variables
private void jam() {
     Timer tt = new Timer();
    tt.scheduleAtFixedRate(new TimerTask() {

         @Override
         public void run() {
             lbljam.setText(new SimpleDateFormat("HH:mm:ss").format(new java.util.Date()));
             
         }
     }, 0, 1000);
 }
}