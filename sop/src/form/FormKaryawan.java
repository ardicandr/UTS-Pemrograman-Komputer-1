package form;

import Tabel.tabelKaryawan;
import com.model.data.dataKaryawan;
import com.service.model.karyawanServis;
import dao.karyawanDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;


public class FormKaryawan extends javax.swing.JPanel {

    private final tabelKaryawan tblModel = new tabelKaryawan();
    private final karyawanServis servis = new karyawanDAO();
    
    public FormKaryawan() {
        initComponents();
        tblData.setModel(tblModel);
        loadData();
        setLebarKolom();
    }
    
    private void setLebarKolom() {
        TableColumnModel kolom  = tblData.getColumnModel();
        kolom.getColumn(0).setPreferredWidth(50);
        kolom.getColumn(0).setMaxWidth(50);
        kolom.getColumn(0).setMinWidth(50);
        
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnTambah = new javax.swing.JButton();
        btnPerbarui = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtPencarian = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(242, 242, 242));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Dashboard > User");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Data Karyawan");

        btnTambah.setBackground(new java.awt.Color(51, 102, 255));
        btnTambah.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnPerbarui.setBackground(new java.awt.Color(51, 102, 255));
        btnPerbarui.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnPerbarui.setForeground(new java.awt.Color(255, 255, 255));
        btnPerbarui.setText("Edit");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(51, 102, 255));
        btnHapus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianActionPerformed(evt);
            }
        });
        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.setRowHeight(30);
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnPerbarui)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        perbaruiData();
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        pencarianData();
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambahData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        List<dataKaryawan> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private void pencarianData(){
        List<dataKaryawan> list = servis.pencarianData(txtPencarian.getText());
        tblModel.setData(list);
    }

    private void tambahData() {
        formTambahKaryawan formInput = new formTambahKaryawan(null, true, 1, null, this);
        formInput.setVisible(true);
        loadData();
    }

    private void perbaruiData() {
        int row = tblData.getSelectedRow();
        if(row != -1){
            dataKaryawan model = tblModel.getData(row);
            formTambahKaryawan formInput = new formTambahKaryawan(null, true, row, model, this);
            formInput.setVisible(true);
            loadData();
        }else{
            JOptionPane.showMessageDialog(null, "Pilih Data Yang Akan Diedit");
        }
    }

    private void hapusData() {
        int row = tblData.getSelectedRow();
        if(row != -1){
            dataKaryawan karyawan = tblModel.getData(row);
            if(JOptionPane.showConfirmDialog(null, "Apakah Data Akan Dihapus ?",
                    "Konfirmasi",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
                servis.hapusData(karyawan);
                tblModel.deleteData(row);
                loadData();
            }
        }else{
                JOptionPane.showMessageDialog(null, "Pilih Data yang akan dihapus");
        }
    }
    
    public void refreshTable(){
        loadData();
    }
}
