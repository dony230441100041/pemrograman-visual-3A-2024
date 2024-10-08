/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulir;

import javax.swing.JOptionPane;

/**
 *
 * @author Ridho
 */
public class FrameFormPendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form FrameFormPendaftaran
     */
    public FrameFormPendaftaran() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupKelamin = new javax.swing.ButtonGroup();
        alas = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNegara = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        txtDisc = new javax.swing.JTextField();
        txtUID = new javax.swing.JTextField();
        txtWaifu = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlasan = new javax.swing.JTextArea();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        txtVerif = new javax.swing.JCheckBox();
        AgakLaen = new javax.swing.JRadioButton();
        btnSimpan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 630));

        alas.setPreferredSize(new java.awt.Dimension(625, 580));
        alas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(45, 66, 134));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 1, 36)); // NOI18N
        jLabel3.setText("PERINDO");
        jLabel3.setIconTextGap(0);
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 40));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setText("Pencinta Furina Indonesia");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, -1));

        jLabel2.setText("Let's Join Us, Make Our Wife More Proud !");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulir/icon-furina.png"))); // NOI18N
        header.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 557, 130));

        alas.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 130));

        main.setBackground(new java.awt.Color(105, 138, 232));
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setPreferredSize(new java.awt.Dimension(630, 630));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nationality :");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender / Sex :");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone :");

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Discord Username :");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Genshin UID :");

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Best Waifu ?");

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reason :");

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NEW MEMBER REGISTRATION FORM ! :)");

        txtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelpActionPerformed(evt);
            }
        });

        txtDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscActionPerformed(evt);
            }
        });

        txtWaifu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pick Your Best Waifu ---", "Furina", "Keqing ( Wangy Wangy )", "Jean", "Thoma", "Qiqi ( *Skull )", "Maviuka ( Coming Soon )" }));
        txtWaifu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaifuActionPerformed(evt);
            }
        });

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setWheelScrollingEnabled(false);

        txtAlasan.setColumns(20);
        txtAlasan.setRows(5);
        jScrollPane1.setViewportView(txtAlasan);

        groupKelamin.add(Male);
        Male.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        groupKelamin.add(Female);
        Female.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        txtVerif.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtVerif.setForeground(new java.awt.Color(255, 255, 255));
        txtVerif.setText("Are you sure u are a furina main?");
        txtVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerifActionPerformed(evt);
            }
        });

        groupKelamin.add(AgakLaen);
        AgakLaen.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        AgakLaen.setForeground(new java.awt.Color(255, 255, 255));
        AgakLaen.setText("Stress");

        btnSimpan.setBackground(new java.awt.Color(53, 59, 167));
        btnSimpan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Proceed !");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(53, 59, 167));
        btnReset.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(53, 59, 167));
        btnQuit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Loser Button !");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel12))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainLayout.createSequentialGroup()
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtNegara)))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(mainLayout.createSequentialGroup()
                                        .addComponent(btnQuit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(btnSimpan))
                                    .addGroup(mainLayout.createSequentialGroup()
                                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDisc)
                                                    .addComponent(txtUID)
                                                    .addComponent(txtWaifu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(mainLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(mainLayout.createSequentialGroup()
                                                        .addComponent(Male)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(Female)
                                                        .addGap(52, 52, 52)
                                                        .addComponent(AgakLaen))
                                                    .addComponent(txtTelp)))
                                            .addGroup(mainLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtVerif))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(70, 70, 70)))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(71, 71, 71))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNegara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Male)
                    .addComponent(Female)
                    .addComponent(AgakLaen))
                .addGap(6, 6, 6)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtWaifu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVerif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuit)
                    .addComponent(btnReset)
                    .addComponent(btnSimpan))
                .addGap(38, 38, 38))
        );

        alas.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 630, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void txtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpActionPerformed

    private void txtDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscActionPerformed

    private void txtWaifuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaifuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaifuActionPerformed

    private void txtVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerifActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (!txtVerif.isSelected()){
            JOptionPane.showMessageDialog(this, 
                "Kasih centang dulu bang pertanyaan terakhirnya!","Kasih Fokus Dikit Bang!",JOptionPane.ERROR_MESSAGE);
        }else{
            hasilForm hasil = new hasilForm();
            hasil.fieldNama.setText(txtNama.getText());
            hasil.fieldNegara.setText(txtNegara.getText());
//            gender
            if (Male.isSelected()){
                hasil.fieldGender.setText("Laki-Laki");
            }else if(Female.isSelected()){
                hasil.fieldGender.setText("Perempuan (Women *Cup a coffe)");
            }else if (AgakLaen.isSelected()){
                hasil.fieldGender.setText("LGTVHD+");
            }else{
                hasil.fieldGender.setText("Tidak Terdevinisi");
            }
            hasil.fieldPhone.setText(txtTelp.getText());
            hasil.fieldDisc.setText(txtDisc.getText());
            hasil.fieldUID.setText(txtUID.getText());
            
//         combo box
                String valueCombo;
                valueCombo = txtWaifu.getSelectedItem().toString();
                hasil.fieldWaifu.setText(valueCombo);
            
            
//            validasi isi 
if (txtNama.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nama harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (txtNegara.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Negara harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (!Male.isSelected() && !Female.isSelected() && !AgakLaen.isSelected()) {
        JOptionPane.showMessageDialog(this, "Pilih gender dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (txtTelp.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nomor telepon harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (txtUID.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "UID harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (txtWaifu.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Pilih waifu dulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (txtAlasan.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Alasan harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

            
            
            
            hasil.fieldReason.setText(txtAlasan.getText());
            hasil.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        groupKelamin.clearSelection();
        txtNama.setText(null);
        txtNegara.setText(null);
        txtTelp.setText(null);
        txtDisc.setText(null);
        txtUID.setText(null);
        txtWaifu.setSelectedIndex(0);
        txtAlasan.setText(null);
        txtVerif.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(FrameFormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFormPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AgakLaen;
    private javax.swing.JLabel BG;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JPanel alas;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup groupKelamin;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main;
    private javax.swing.JTextArea txtAlasan;
    private javax.swing.JTextField txtDisc;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNegara;
    private javax.swing.JTextField txtTelp;
    private javax.swing.JTextField txtUID;
    private javax.swing.JCheckBox txtVerif;
    private javax.swing.JComboBox<String> txtWaifu;
    // End of variables declaration//GEN-END:variables
}