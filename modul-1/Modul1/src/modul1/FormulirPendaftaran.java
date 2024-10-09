/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul1;

import javax.swing.JOptionPane;


/**
 *
 * @author TOSHIBA
 */
public class FormulirPendaftaran extends javax.swing.JFrame {
    public FormulirPendaftaran() {
        initComponents();
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
        PanelBG = new javax.swing.JPanel();
        ButtonGrup = new modul1.PanelRound();
        Formulir = new javax.swing.JLabel();
        lb_nama = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        LbTempatLahir = new javax.swing.JLabel();
        LbTanggalLahir = new javax.swing.JLabel();
        LbAlamat = new javax.swing.JLabel();
        LbNoTelpon = new javax.swing.JLabel();
        LbFakultas = new javax.swing.JLabel();
        LbEmail1 = new javax.swing.JLabel();
        LbProdi1 = new javax.swing.JLabel();
        LbJenisKelamin = new javax.swing.JLabel();
        TFTelp = new javax.swing.JTextField();
        TFTL = new javax.swing.JTextField();
        RBLaki = new javax.swing.JRadioButton();
        RBPerempuan = new javax.swing.JRadioButton();
        TFTglLahir = new javax.swing.JTextField();
        TFEmail = new javax.swing.JTextField();
        CBProdi = new javax.swing.JComboBox<>();
        CBFakultas = new javax.swing.JComboBox<>();
        BG_Gunung = new javax.swing.JLabel();
        TFAlamat = new javax.swing.JTextField();
        BTRiset = new rojerusan.RSMaterialButtonRectangle();
        BTSimpan = new rojerusan.RSMaterialButtonRectangle();
        BTBatal2 = new rojerusan.RSMaterialButtonRectangle();
        Centang = new javax.swing.JCheckBox();
        UKM = new javax.swing.JLabel();
        PA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBG.setBackground(new java.awt.Color(0, 190, 210));

        ButtonGrup.setBackground(new java.awt.Color(255, 255, 255));
        ButtonGrup.setRoundBottomLeft(50);
        ButtonGrup.setRoundBottomRight(50);
        ButtonGrup.setRoundTopLeft(50);
        ButtonGrup.setRoundTopRight(50);

        Formulir.setFont(new java.awt.Font("Blackadder ITC", 1, 18)); // NOI18N
        Formulir.setText("FORMULIR PENDAFTARAN");

        lb_nama.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lb_nama.setText("Nama              :");

        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });

        LbTempatLahir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbTempatLahir.setText("Tenpat Lahir    :");

        LbTanggalLahir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbTanggalLahir.setText("Tanggal Lahir  :");

        LbAlamat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbAlamat.setText("Alamat            :");

        LbNoTelpon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbNoTelpon.setText("No.Telp           :");

        LbFakultas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbFakultas.setText("Fakultas          :");

        LbEmail1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbEmail1.setText("Email              :");

        LbProdi1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbProdi1.setText("Prodi               :");

        LbJenisKelamin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LbJenisKelamin.setText("Jenis Kelamin :");

        TFTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTelpActionPerformed(evt);
            }
        });

        TFTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTLActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBLaki);
        RBLaki.setText("Laki-laki");

        buttonGroup1.add(RBPerempuan);
        RBPerempuan.setText("Perempuan");

        TFTglLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTglLahirActionPerformed(evt);
            }
        });

        TFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEmailActionPerformed(evt);
            }
        });

        CBProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Prodi--", "Teknik Industri", "Teknik Elektro", "Sistem Informasi", "Teknik Mesin", "Teknik Informatika", "Teknik Mekatronika" }));
        CBProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBProdiActionPerformed(evt);
            }
        });

        CBFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Fakultas--", "TEKNIK", "FEB", "FISIB", "HUKUM", "PERTANIAN", "KEISLAMAN", "KEDOKTERAN" }));

        BG_Gunung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul1/komponen/2.png"))); // NOI18N

        TFAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAlamatActionPerformed(evt);
            }
        });

        BTRiset.setBackground(new java.awt.Color(0, 190, 210));
        BTRiset.setText("Riset");
        BTRiset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRisetActionPerformed(evt);
            }
        });

        BTSimpan.setBackground(new java.awt.Color(0, 190, 210));
        BTSimpan.setText("Simpan");
        BTSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSimpanActionPerformed(evt);
            }
        });

        BTBatal2.setBackground(new java.awt.Color(0, 190, 210));
        BTBatal2.setText("Batal");
        BTBatal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBatal2ActionPerformed(evt);
            }
        });

        Centang.setText("Data Yang Saya Masukkan Sudah Benar");
        Centang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CentangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonGrupLayout = new javax.swing.GroupLayout(ButtonGrup);
        ButtonGrup.setLayout(ButtonGrupLayout);
        ButtonGrupLayout.setHorizontalGroup(
            ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonGrupLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonGrupLayout.createSequentialGroup()
                        .addComponent(BTBatal2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(BTRiset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(BTSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(ButtonGrupLayout.createSequentialGroup()
                        .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonGrupLayout.createSequentialGroup()
                                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LbTempatLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFNama)
                                    .addComponent(TFTL, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(ButtonGrupLayout.createSequentialGroup()
                                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbTanggalLahir, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LbJenisKelamin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbNoTelpon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbEmail1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbProdi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbFakultas, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFEmail)
                                    .addComponent(TFTglLahir)
                                    .addComponent(TFTelp)
                                    .addComponent(CBProdi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBFakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ButtonGrupLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(RBLaki)
                                        .addGap(12, 12, 12)
                                        .addComponent(RBPerempuan)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TFAlamat)))
                            .addGroup(ButtonGrupLayout.createSequentialGroup()
                                .addComponent(Centang, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(ButtonGrupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG_Gunung, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonGrupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Formulir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        ButtonGrupLayout.setVerticalGroup(
            ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonGrupLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Formulir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ButtonGrupLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbTempatLahir)
                    .addComponent(TFTL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTanggalLahir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBLaki)
                    .addComponent(RBPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNoTelpon)
                    .addComponent(TFTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbEmail1)
                    .addComponent(TFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbProdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbAlamat)
                    .addComponent(TFAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Centang)
                .addGap(8, 8, 8)
                .addGroup(ButtonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTRiset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTBatal2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BG_Gunung, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        UKM.setFont(new java.awt.Font("Blackadder ITC", 1, 36)); // NOI18N
        UKM.setForeground(new java.awt.Color(255, 255, 255));
        UKM.setText("UKM");

        PA.setFont(new java.awt.Font("Blackadder ITC", 1, 36)); // NOI18N
        PA.setForeground(new java.awt.Color(255, 255, 255));
        PA.setText("Pecinta Alam");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul1/komponen/logom1.png"))); // NOI18N

        javax.swing.GroupLayout PanelBGLayout = new javax.swing.GroupLayout(PanelBG);
        PanelBG.setLayout(PanelBGLayout);
        PanelBGLayout.setHorizontalGroup(
            PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addGroup(PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBGLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ButtonGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UKM, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelBGLayout.setVerticalGroup(
            PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(UKM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonGrup, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PanelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed
 
    private void TFTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTelpActionPerformed

    private void TFTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTLActionPerformed

    private void TFTglLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTglLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTglLahirActionPerformed

    private void TFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEmailActionPerformed

    private void CBProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBProdiActionPerformed

    private void TFAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAlamatActionPerformed

    private void BTBatal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBatal2ActionPerformed
        // TODO add your handling code here:
        dispose();
        JOptionPane.showMessageDialog(this, "Pendaftaran Dibatalkan", "Batal", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BTBatal2ActionPerformed

    private void BTRisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRisetActionPerformed
        // TODO add your handling code here:
        TFNama.setText("");
        TFTL.setText("");
        TFTglLahir.setText("");
        TFAlamat.setText("");
        TFTelp.setText("");
        TFEmail.setText("");
        CBProdi.setSelectedItem("--Pilih Prodi--");
        CBFakultas.setSelectedItem("--Fakultas--");
        buttonGroup1.clearSelection();
        Centang.setSelected(false);
        JOptionPane.showMessageDialog(this, "Berhasil Diriset!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BTRisetActionPerformed

    private void BTSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSimpanActionPerformed
        // TODO add your handling code here:
        if (Centang.isSelected()) {
        if (TFNama.getText().isEmpty() || TFTL.getText().isEmpty() || TFTglLahir.getText().isEmpty() ||
        TFTelp.getText().isEmpty() || TFEmail.getText().isEmpty() || TFAlamat.getText().isEmpty() ||
        (!RBLaki.isSelected() && !RBPerempuan.isSelected()) || CBProdi.getSelectedIndex() == 0 || CBFakultas.getSelectedIndex() == 0) {
        
        JOptionPane.showMessageDialog(this, "Harap isi semua biodata terlebih dahulu!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            HasilPendaftaran hasilpendaftaran = new HasilPendaftaran();
            hasilpendaftaran.TFNama1.setText(TFNama.getText());
            hasilpendaftaran.TFTL.setText(TFTL.getText());
            hasilpendaftaran.TFTglLahir.setText(TFTglLahir.getText());
            hasilpendaftaran.TFTelp.setText(TFTelp.getText());
            hasilpendaftaran.TFEmail.setText(TFEmail.getText());
            hasilpendaftaran.TFAlamat.setText(TFAlamat.getText());
        
        if (RBLaki.isSelected()) {
            hasilpendaftaran.TFJenisKelamin.setText("Laki-laki");
        } else if (RBPerempuan.isSelected()) {
            hasilpendaftaran.TFJenisKelamin.setText("Perempuan");
        }
        
        String Pilih = (String) CBProdi.getSelectedItem().toString();
        hasilpendaftaran.TFProdi.setText(Pilih);
        
        String pilih = (String) CBFakultas.getSelectedItem().toString();
        hasilpendaftaran.TFFakultas.setText(pilih);
        
        hasilpendaftaran.setVisible(true);
        JOptionPane.showMessageDialog(this, "Berhasil Disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
        } else {
        JOptionPane.showMessageDialog(this, "Harap Centang Terlebih Dahulu!", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_BTSimpanActionPerformed

    private void CentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CentangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CentangActionPerformed

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
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormulirPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_Gunung;
    private rojerusan.RSMaterialButtonRectangle BTBatal2;
    private rojerusan.RSMaterialButtonRectangle BTRiset;
    private rojerusan.RSMaterialButtonRectangle BTSimpan;
    public modul1.PanelRound ButtonGrup;
    public javax.swing.JComboBox<String> CBFakultas;
    private javax.swing.JComboBox<String> CBProdi;
    private javax.swing.JCheckBox Centang;
    private javax.swing.JLabel Formulir;
    private javax.swing.JLabel LbAlamat;
    private javax.swing.JLabel LbEmail1;
    private javax.swing.JLabel LbFakultas;
    private javax.swing.JLabel LbJenisKelamin;
    private javax.swing.JLabel LbNoTelpon;
    private javax.swing.JLabel LbProdi1;
    private javax.swing.JLabel LbTanggalLahir;
    private javax.swing.JLabel LbTempatLahir;
    private javax.swing.JLabel PA;
    private javax.swing.JPanel PanelBG;
    private javax.swing.JRadioButton RBLaki;
    private javax.swing.JRadioButton RBPerempuan;
    public javax.swing.JTextField TFAlamat;
    public javax.swing.JTextField TFEmail;
    public javax.swing.JTextField TFNama;
    public javax.swing.JTextField TFTL;
    public javax.swing.JTextField TFTelp;
    public javax.swing.JTextField TFTglLahir;
    private javax.swing.JLabel UKM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_nama;
    // End of variables declaration//GEN-END:variables
}