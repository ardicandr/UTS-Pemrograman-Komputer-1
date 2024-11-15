package view;

import com.model.data.dataKaryawan;
import com.service.model.karyawanServis;
import dao.karyawanDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class formLogin extends javax.swing.JFrame {
    
    private karyawanServis servis = new karyawanDAO();
    

    int xx, xy;
    public formLogin() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }
    
    private void resetForm(){   
        txtUser.setText("");
        txtPass.setText("");
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(txtUser.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if(txtPass.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");           
        }else{
            valid = true;
        }
        return valid;
    }
    
    private void prosesLogin(){
        if(validasiInput() == true){
            String user = txtUser.getText();
            String pass = txtPass.getText();
            
            dataKaryawan model = new dataKaryawan();
            model.setUsername(user);
            model.setPassword(pass);
            
            servis.prosesLogin(model);
            if(model != null){
                menuUtama mn = new menuUtama();
                mn.setVisible(true);
                mn.revalidate();
        
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username dan Password salah","pesan",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        panelRound1 = new palette.PanelRound();
        panelRound2 = new palette.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(0, 102, 255));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundTopLeft(20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kl-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 425));
        panelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 342, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("LOGIN");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        panelRound1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 342, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 83, 35));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-icon.png"))); // NOI18N
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });
        panelRound1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
//        Supaaya form login bisa didrag
        xx = evt.getX();
        xy = evt.getY(); 
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
//        supaya form login bisa didrag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        memanggil menu utama
//        menuUtama mn = new menuUtama();
//        mn.setVisible(true);
//        mn.revalidate();
//        
//        dispose();
          prosesLogin();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private palette.PanelRound panelRound1;
    private palette.PanelRound panelRound2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
