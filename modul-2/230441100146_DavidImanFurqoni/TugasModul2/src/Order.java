
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DAVID IMAN FURQONI
 */
public class Order extends javax.swing.JFrame {
    
        int hargaKebab = 0;
        int hargaTopping = 0;
        int JumlahOrder = 1;
        
    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        
        cash.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                CashKeyReleased(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelOriginal = new javax.swing.JLabel();
        oriSosis = new javax.swing.JRadioButton();
        oriTelur = new javax.swing.JRadioButton();
        oriKeju = new javax.swing.JRadioButton();
        labelTopping = new javax.swing.JLabel();
        sosis = new javax.swing.JRadioButton();
        keju = new javax.swing.JRadioButton();
        telur = new javax.swing.JRadioButton();
        labelJumlah = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        kurangi = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        labelCash = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        labelChange = new javax.swing.JLabel();
        change = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        totalTombol = new javax.swing.JButton();
        tampilanDiskon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORDER HERE!");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("choose your order!!!");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jLabel2.setText("KEBBBABBB ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelOriginal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelOriginal.setText("KEBAB ORIGINAL");

        buttonGroup1.add(oriSosis);
        oriSosis.setText("Original + Sosis = Rp 13k");
        oriSosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oriSosisActionPerformed(evt);
            }
        });

        buttonGroup1.add(oriTelur);
        oriTelur.setText("Original + Telur = Rp 15k");
        oriTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oriTelurActionPerformed(evt);
            }
        });

        buttonGroup1.add(oriKeju);
        oriKeju.setText("Original + Keju = Rp 18K");

        labelTopping.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTopping.setText("Extra Topping");

        buttonGroup2.add(sosis);
        sosis.setText("Sosis = Rp 2k");

        buttonGroup2.add(keju);
        keju.setText("Keju = Rp 2k");
        keju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kejuActionPerformed(evt);
            }
        });

        buttonGroup2.add(telur);
        telur.setText("Telur = Rp 2k");

        labelJumlah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelJumlah.setText("Jumlah pesanan:");

        jumlah.setEditable(false);
        jumlah.setText("1");
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        kurangi.setText("-");
        kurangi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangiActionPerformed(evt);
            }
        });

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        labelCash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCash.setText("CASH");

        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });

        labelChange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelChange.setText("CHANGE");

        change.setEditable(false);

        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        totalTombol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalTombol.setText("TOTAL");
        totalTombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTombolActionPerformed(evt);
            }
        });

        tampilanDiskon.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(labelTopping, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oriSosis)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(oriTelur)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(oriKeju)
                                                .addGap(4, 4, 4))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(totalTombol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sosis)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(keju)
                                                .addGap(4, 4, 4))
                                            .addComponent(telur)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(labelJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelCash)
                                    .addComponent(labelChange))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(tampilanDiskon, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(change))
                                .addGap(18, 18, 18)
                                .addComponent(kurangi)
                                .addGap(18, 18, 18)
                                .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tambah)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(reset)
                                .addGap(23, 23, 23)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOriginal)
                    .addComponent(labelTopping))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oriSosis)
                    .addComponent(sosis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oriTelur)
                    .addComponent(telur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oriKeju)
                    .addComponent(keju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTombol)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJumlah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah)
                    .addComponent(kurangi)
                    .addComponent(tampilanDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChange)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(reset)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oriSosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oriSosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oriSosisActionPerformed

    private void kejuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kejuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kejuActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        oriSosis.setSelected(false);
        oriTelur.setSelected(false);
        oriKeju.setSelected(false);
        oriSosis.setSelected(false);
        sosis.setSelected(false);
        keju.setSelected(false);
        telur.setSelected(false);
        
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        jumlah.setText("1");
        total.setText("");
        cash.setText("");
        change.setText("");
        tampilanDiskon.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void oriTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oriTelurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oriTelurActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        int jumlahInt = Integer.parseInt(jumlah.getText());
        jumlah.setText(Integer.toString(jumlahInt + 1));
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangiActionPerformed
        // TODO add your handling code here:
        int jumlahInt = Integer.parseInt(jumlah.getText());
        if (jumlahInt == 1) {
            jumlahInt= 1;
            return;
        }
        jumlah.setText(Integer.toString(jumlahInt - 1));
    }//GEN-LAST:event_kurangiActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void totalTombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTombolActionPerformed
        // TODO add your handling code here:
        hargaKebab = 0;
        hargaTopping = 0;
        tampilanDiskon.setText(""); 

        if (oriSosis.isSelected()) {
            hargaKebab = 13000;
        } else if (oriTelur.isSelected()) {
            hargaKebab = 15000;
        } else if (oriKeju.isSelected()) {
            hargaKebab = 18000;
        }
        if (hargaKebab == 0) {
            ImageIcon icon = new ImageIcon ("icons8-warning-48.png");
            JOptionPane.showMessageDialog(this, "Pilih menu dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE,icon);
            return;
        }
        if (sosis.isSelected() || keju.isSelected() || telur.isSelected()) {
        hargaTopping = 2000; 
    }
        
        
        int totalHarga = (hargaKebab + hargaTopping) * Integer.parseInt(jumlah.getText());
         int discount = 0;
        
        if (totalHarga > 100000) {
            discount = totalHarga * 5 / 100; 
            totalHarga -= discount; 
            tampilanDiskon.setText("Diskon: " + discount + " IDR"); 
        }
    

    total.setText(Integer.toString(totalHarga));
        hitungKembali();

    }//GEN-LAST:event_totalTombolActionPerformed

    private void hitungKembali() {
        try {
            int totalHarga = Integer.parseInt(total.getText());
            int uangDiberikan = Integer.parseInt(cash.getText());
            int kembali = uangDiberikan - totalHarga;

            if (kembali < 0) {
                change.setText("Uang Tidak Cukup"); 
            } else {
                change.setText(Integer.toString(kembali)); 
            }
        } catch (NumberFormatException e) {
            change.setText(""); 
        }
    }
    
    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void CashKeyReleased(java.awt.event.KeyEvent evt) {                                 
        hitungKembali();
    }
    
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cash;
    private javax.swing.JTextField change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jumlah;
    private javax.swing.JRadioButton keju;
    private javax.swing.JButton kurangi;
    private javax.swing.JLabel labelCash;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelOriginal;
    private javax.swing.JLabel labelTopping;
    private javax.swing.JRadioButton oriKeju;
    private javax.swing.JRadioButton oriSosis;
    private javax.swing.JRadioButton oriTelur;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton sosis;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tampilanDiskon;
    private javax.swing.JRadioButton telur;
    private javax.swing.JTextField total;
    private javax.swing.JButton totalTombol;
    // End of variables declaration//GEN-END:variables
}