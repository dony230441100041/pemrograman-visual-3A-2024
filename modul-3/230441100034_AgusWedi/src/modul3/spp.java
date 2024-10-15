import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class spp extends javax.swing.JFrame {

    /**
     * Creates new form spp
     */
    public spp() {
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

        container = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        januari = new javax.swing.JRadioButton();
        februari = new javax.swing.JRadioButton();
        maret = new javax.swing.JRadioButton();
        april = new javax.swing.JRadioButton();
        mei = new javax.swing.JRadioButton();
        juni = new javax.swing.JRadioButton();
        juli = new javax.swing.JRadioButton();
        agustus = new javax.swing.JRadioButton();
        september = new javax.swing.JRadioButton();
        oktober = new javax.swing.JRadioButton();
        november = new javax.swing.JRadioButton();
        desember = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        spp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelinfo = new javax.swing.JTable();
        kirim = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPP");

        header.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("SPP \"SMKN 1 BLEGA\"");
        header.add(jLabel1);

        body.setBackground(new java.awt.Color(153, 255, 255));
        body.setLayout(null);

        jLabel4.setText("Masukkan Nama Siswa");
        body.add(jLabel4);
        jLabel4.setBounds(150, 70, 120, 16);
        body.add(nama);
        nama.setBounds(290, 62, 170, 30);

        jLabel5.setText(":");
        body.add(jLabel5);
        jLabel5.setBounds(280, 70, 10, 16);

        jLabel6.setText("Pilih Bulan yang ingin dibayar dalam 1 tahun");
        body.add(jLabel6);
        jLabel6.setBounds(150, 110, 236, 16);

        januari.setText("Januari");
        body.add(januari);
        januari.setBounds(150, 140, 60, 21);

        februari.setText("Februari");
        body.add(februari);
        februari.setBounds(150, 170, 66, 21);

        maret.setText("Maret");
        body.add(maret);
        maret.setBounds(150, 200, 54, 21);

        april.setText("April");
        body.add(april);
        april.setBounds(150, 230, 98, 21);

        mei.setText("Mei");
        body.add(mei);
        mei.setBounds(150, 260, 43, 21);

        juni.setText("Juni");
        body.add(juni);
        juni.setBounds(150, 290, 43, 21);

        juli.setText("Juli");
        body.add(juli);
        juli.setBounds(310, 140, 40, 21);

        agustus.setText("Agustus");
        body.add(agustus);
        agustus.setBounds(310, 170, 65, 21);

        september.setText("September");
        body.add(september);
        september.setBounds(310, 200, 81, 21);

        oktober.setText("Oktober");
        body.add(oktober);
        oktober.setBounds(310, 230, 104, 21);

        november.setText("November");
        body.add(november);
        november.setBounds(310, 260, 79, 21);

        desember.setText("Desember");
        body.add(desember);
        desember.setBounds(310, 290, 104, 21);

        jLabel3.setText("Jumlah SPP Perbulan");
        body.add(jLabel3);
        jLabel3.setBounds(160, 330, 110, 16);

        spp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sppActionPerformed(evt);
            }
        });
        body.add(spp);
        spp.setBounds(290, 320, 170, 30);

        jLabel7.setText(":");
        body.add(jLabel7);
        jLabel7.setBounds(280, 330, 10, 16);

        tabelinfo.setBackground(new java.awt.Color(51, 255, 51));
        tabelinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Status", "Utang", "Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Ags", "Sep", "Okt", "Nov", "Des"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelinfo);

        body.add(jScrollPane1);
        jScrollPane1.setBounds(500, 10, 452, 402);

        kirim.setBackground(new java.awt.Color(51, 255, 51));
        kirim.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kirim.setText("Kirim");
        kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimActionPerformed(evt);
            }
        });
        body.add(kirim);
        kirim.setBounds(250, 380, 72, 23);

        keluar.setBackground(new java.awt.Color(51, 255, 51));
        keluar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        body.add(keluar);
        keluar.setBounds(340, 380, 72, 23);

        footer.setBackground(new java.awt.Color(51, 255, 51));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("@ Agus Wedi . All Right Reserved");
        footer.add(jLabel2);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerLayout.createSequentialGroup()
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetForm(){
        nama.setText("");
        spp.setText("");
        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);
    }
    
    private void kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimActionPerformed
        if (nama.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Isi Nama Terlebih Dahulu!", "Pemberitahuan!", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    if (!januari.isSelected() && !februari.isSelected() && !maret.isSelected() && !april.isSelected() && 
        !mei.isSelected() && !juni.isSelected() && !juli.isSelected() && !agustus.isSelected() && 
        !september.isSelected() && !oktober.isSelected() && !november.isSelected() && !desember.isSelected()) {
        JOptionPane.showMessageDialog(null, "Pilih minimal satu bulan!", "Pemberitahuan!", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    if (spp.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Isi SPP Terlebih Dahulu!", "Pemberitahuan!", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    try {
        DefaultTableModel model = (DefaultTableModel) tabelinfo.getModel();
        String name = nama.getText();
        String status = "Nunggak"; 
        int utang = 0; 
        int sppPerBulan = Integer.parseInt(spp.getText());
        
        int jumlahBulan = 0;
        
        if (januari.isSelected()) {
            jumlahBulan++;
        }
        
        if (februari.isSelected()) {
            jumlahBulan++;
        }
        
        if (maret.isSelected()) {
            jumlahBulan++;
        }
        
        if (april.isSelected()){
            jumlahBulan++;
        }
        
        if (mei.isSelected()){
            jumlahBulan++;
        }
        
        if (juni.isSelected()){
            jumlahBulan++;
        }
        if (juli.isSelected()){
            jumlahBulan++;
        }
        if (agustus.isSelected()){
            jumlahBulan++;
        }
        
        if (september.isSelected()){
            jumlahBulan++;
        }
        if (oktober.isSelected()){
            jumlahBulan++;
        }
        if (november.isSelected()){
            jumlahBulan++;
        }
        if (desember.isSelected()){
            jumlahBulan++;
        }
        
        if (jumlahBulan == 12) {
            status = "lunas";
        }

        utang = sppPerBulan * (12 - jumlahBulan);
        
        Object[] rowData = new Object[15];
        rowData[0] = name;
        rowData[1] = status;
        rowData[2] = utang;
        rowData[3] = januari.isSelected();
        rowData[4] = februari.isSelected();
        rowData[5] = maret.isSelected();
        rowData[6] = april.isSelected();
        rowData[7] = mei.isSelected();
        rowData[8] = juni.isSelected();
        rowData[9] = juli.isSelected();
        rowData[10] = agustus.isSelected();
        rowData[11] = september.isSelected();
        rowData[12] = oktober.isSelected();
        rowData[13] = november.isSelected();
        rowData[14] = desember.isSelected();
        
        model.addRow(rowData);
        
        resetForm();
        
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Format SPP tidak valid. Masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_kirimActionPerformed

    private void sppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sppActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed
    
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
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agustus;
    private javax.swing.JRadioButton april;
    private javax.swing.JPanel body;
    private javax.swing.JPanel container;
    private javax.swing.JRadioButton desember;
    private javax.swing.JRadioButton februari;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton januari;
    private javax.swing.JRadioButton juli;
    private javax.swing.JRadioButton juni;
    private javax.swing.JButton keluar;
    private javax.swing.JButton kirim;
    private javax.swing.JRadioButton maret;
    private javax.swing.JRadioButton mei;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton november;
    private javax.swing.JRadioButton oktober;
    private javax.swing.JRadioButton september;
    private javax.swing.JTextField spp;
    private javax.swing.JTable tabelinfo;
    // End of variables declaration//GEN-END:variables
}