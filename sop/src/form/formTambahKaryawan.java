package form;

import Tabel.tabelKaryawan;
import com.model.data.dataKaryawan;
import com.service.model.karyawanServis;
import dao.karyawanDAO;
import java.util.List;
import javax.swing.JOptionPane;


public class formTambahKaryawan extends javax.swing.JDialog {
    
    private tabelKaryawan tblModel = new tabelKaryawan();
    private karyawanServis servis = new karyawanDAO();
    private dataKaryawan Karyawan;
    private int idKaryawan;
    private int row;
    private FormKaryawan formkaryawan;
    
    public formTambahKaryawan(java.awt.Frame parent, boolean modal, int row, dataKaryawan Karyawan, FormKaryawan formkaryawan) {
        super(parent, modal);
        this.Karyawan = Karyawan;
        this.row = row;
        this.formkaryawan = formkaryawan;
        initComponents();
        
        if(Karyawan != null){
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
        jLabel13 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbxRole = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

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

        jLabel11.setText("Telepon");

        jLabel12.setText("Nama Karyawan");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamajTextField2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Alamat");

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
        jLabel10.setText("Tambah Data Karyawan");

        jLabel9.setBackground(new java.awt.Color(242, 242, 242));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Dashboard > User >Tambah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        jLabel14.setText("Username");

        txtTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleponActionPerformed(evt);
            }
        });

        jLabel15.setText("Password");

        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Role :", "Admin", "Kasir" }));

        jLabel16.setText("Role");

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
                        .addGap(28, 28, 28)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama)
                            .addComponent(txtUsername)
                            .addComponent(txtTelepon)
                            .addComponent(txtAlamat)
                            .addComponent(cbxRole, 0, 269, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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

    private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleponActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

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
            java.util.logging.Logger.getLogger(formTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormKaryawan formkaryawan = new FormKaryawan();
                formTambahKaryawan dialog = new formTambahKaryawan(new javax.swing.JFrame(), true, 1, null, formkaryawan);
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
    private javax.swing.JComboBox<String> cbxRole;
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
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean validasiInput(){
        boolean valid = false;
        if (txtNama.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong");
        }else if (txtUsername.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");            
        }else if (txtPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong"); 
        }else if (txtTelepon.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nomor Telepon tidak boleh kosong");            
        }else if (txtAlamat.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");                       
        }else if (cbxRole.getSelectedItem().equals("Pilih Role")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Role");                       
        }else{
            valid = true;
        }
        return valid;
    }
    
    private void simpanData(){
        if(validasiInput() == true){
            String nama = txtNama.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String telepon = txtTelepon.getText();
            String alamat = txtAlamat.getText();
            String role = cbxRole.getSelectedItem().toString();
            
           
            
            dataKaryawan Karyawan = new dataKaryawan();
            Karyawan.setNamaKaryawan(nama);
            Karyawan.setUsername(username);
            Karyawan.setPassword(password);
            Karyawan.setTelepon(telepon);
            Karyawan.setAlamat(alamat);
            Karyawan.setRole(role);

            servis.tambahData(Karyawan);
            tblModel.insertData(Karyawan);
            formkaryawan.refreshTable();
            resetForm();
        }
    }

    private void resetForm() {
        txtNama.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtTelepon.setText("");
        txtAlamat.setText("");
        cbxRole.setSelectedIndex(0);
    }

    private void dataTable() {
         btnSimpan.setText("Perbarui");
         
         idKaryawan = Karyawan.getIdKaryawan();
         
         txtNama.setText(Karyawan.getNamaKaryawan());
         txtUsername.setText(Karyawan.getUsername());
         txtTelepon.setText(Karyawan.getTelepon());
         txtAlamat.setText(Karyawan.getAlamat());
         cbxRole.setSelectedItem(Karyawan.getRole());

    }

    private void loadData() {
        List<dataKaryawan> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private void perbaruiData(){
        if(validasiInput() == true){
            String nama = txtNama.getText();
            String username = txtUsername.getText();
            String telepon = txtTelepon.getText();
            String alamat = txtAlamat.getText();
            String role = cbxRole.getSelectedItem().toString();
            
            dataKaryawan Karyawan = new dataKaryawan();
            
            Karyawan.setIdKaryawan(idKaryawan);
            Karyawan.setNamaKaryawan(nama);
            Karyawan.setUsername(username);
            Karyawan.setTelepon(telepon);
            Karyawan.setAlamat(alamat);
            Karyawan.setRole(role);

            servis.perbaruiData(Karyawan);
            tblModel.updateData(row, Karyawan);
            resetForm();
            dispose();
        }
    }
    
}
