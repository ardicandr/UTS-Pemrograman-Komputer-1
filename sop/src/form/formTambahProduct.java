package form;

import Tabel.tabelProduk;
import com.model.data.dataProduk;
import com.service.model.produkServis;
import dao.produkDao;
import java.util.List;
import javax.swing.JOptionPane;


public class formTambahProduct extends javax.swing.JDialog {
    
    private tabelProduk produk = new tabelProduk();
    private produkServis servis = new produkDao();
    private dataProduk Produk;
    private int idProduk;
    private int row;
    
    public formTambahProduct(java.awt.Frame parent, boolean modal, int row, dataProduk Produk) {
        super(parent, modal);
        this.Produk = Produk;
        this.row = row;
        initComponents();
        
        if(Produk != null){
            dataTable();
        }
        loadData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnBatal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        cbxSupplier = new javax.swing.JComboBox<>();
        txtStok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBatal.setBackground(new java.awt.Color(51, 102, 255));
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.setMaximumSize(new java.awt.Dimension(81, 25));
        btnBatal.setMinimumSize(new java.awt.Dimension(81, 25));
        btnBatal.setVerifyInputWhenFocusTarget(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBataljButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Kategori");

        jLabel12.setText("Nama Produk");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamajTextField2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Stok");

        jLabel14.setText("Harga");

        jLabel15.setText("Barcode");

        jLabel16.setText("Supplier");

        btnSimpan.setBackground(new java.awt.Color(51, 102, 255));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setMaximumSize(new java.awt.Dimension(81, 25));
        btnSimpan.setMinimumSize(new java.awt.Dimension(81, 25));
        btnSimpan.setVerifyInputWhenFocusTarget(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanjButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data Produk");

        jLabel9.setBackground(new java.awt.Color(242, 242, 242));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Dashboard > Produk >Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbxSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Supplier", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHarga)
                            .addComponent(txtNama)
                            .addComponent(txtBarcode)
                            .addComponent(cbxKategori, 0, 254, Short.MAX_VALUE)
                            .addComponent(cbxSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStok)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBataljButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBataljButton1ActionPerformed
        if(btnSimpan.getText().equals("Simpan")){
            resetForm();
        }else if(btnSimpan.getText().equals("Perbarui")){
            dispose();
        }
    }//GEN-LAST:event_btnBataljButton1ActionPerformed

    private void txtNamajTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamajTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamajTextField2ActionPerformed

    private void btnSimpanjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanjButton1ActionPerformed
        if(btnSimpan.getText().equals("Simpan")){
            simpanData();
        }else if(btnSimpan.getText().equals("Perbarui")){
            perbaruiData();
        }
    }//GEN-LAST:event_btnSimpanjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formTambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formTambahProduct dialog = new formTambahProduct(new javax.swing.JFrame(), true, 1, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JComboBox<String> cbxSupplier;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

    private boolean validasiInput(){
        boolean valid = false;
        if (txtNama.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Produk tidak boleh kosong");
        }else if (cbxKategori.getSelectedItem().equals("Pilih Kategori")){
            JOptionPane.showMessageDialog(null, "Harap pilih kategori");            
        }else if (txtHarga.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong");                       
        }else if (txtStok.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Stok tidak boleh kosong");                                  
        }else if (cbxSupplier.getSelectedItem().equals("Harap pilih supplier")){
            JOptionPane.showMessageDialog(null, "Harap pilih Supplier");                                  
        }else if (txtBarcode.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Barcode tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private void simpanData(){
        if(validasiInput() == true){
            String namaProduk = txtNama.getText();
            String idKategori = cbxKategori.getSelectedItem().toString();
            Long harga = Long.parseLong(txtHarga.getText());
            int stok = Integer.parseInt(txtStok.getText());
            String idSupplier = cbxSupplier.getSelectedItem().toString();
            String Barcode = txtBarcode.getText();
            
            dataProduk Produk = new dataProduk();
            Produk.setNamaProduk(namaProduk);
            Produk.setIdKategori(idKategori);
            Produk.setHarga(harga);
            Produk.setStok(stok);
            Produk.setIdSupplier(idSupplier);
            Produk.setBarcode(Barcode);

            servis.tambahData(Produk);
            produk.insertData(Produk);
            resetForm();
        }
    }

    private void resetForm() {
        txtNama.setText("");
        cbxKategori.setSelectedIndex(0);
        txtHarga.setText("");
        txtStok.setText("");
        cbxSupplier.setSelectedIndex(0);
        txtBarcode.setText("");
    }

    private void dataTable() {
         btnSimpan.setText("Perbarui");
         idProduk = Produk.getIdProduk();
         txtNama.setText(Produk.getNamaProduk());
         cbxKategori.setSelectedItem(Produk.getIdKategori());
         txtHarga.setText(String.valueOf(Produk.getHarga()));
         txtStok.setText(String.valueOf(Produk.getStok()));
         cbxSupplier.setSelectedItem(Produk.getIdSupplier());
         txtBarcode.setText(Produk.getBarcode());
    }

    private void loadData() {
        List<dataProduk> list = servis.tampilData();
        produk.setData(list);
    }
    
    private void perbaruiData(){
        if(validasiInput() == true){
            String namaProduk = txtNama.getText();
            String idKategori = cbxKategori.getSelectedItem().toString();
            Long harga = Long.parseLong(txtHarga.getText());
            int stok = Integer.parseInt(txtStok.getText());
            String idSupplier = cbxSupplier.getSelectedItem().toString();
            String Barcode = txtBarcode.getText();
            
            dataProduk Produk = new dataProduk();
            Produk.setIdProduk(idProduk);
            Produk.setNamaProduk(namaProduk);
            Produk.setIdKategori(idKategori);
            Produk.setHarga(harga);
            Produk.setStok(stok);
            Produk.setIdSupplier(idSupplier);
            Produk.setBarcode(Barcode);

            servis.perbaruiData(Produk);
            produk.updateData(row, Produk);
            resetForm();
            dispose();
        }
    }
    
}
