package dao;

import com.DataBase.koneksiDatabase;
import com.model.data.dataProduk;
import com.model.data.dataProfile; 
import com.service.model.produkServis;
import java.sql.*;
import java.util.List;

public class profileDAO implements produkServis {

    private Connection conn;

    public profileDAO() {
        conn = koneksiDatabase.getConnection();
    }


    public dataProfile getProfileData() { 
        PreparedStatement st = null;
        ResultSet rs = null;
        dataProfile profile = null; 

        String sql = "SELECT * FROM user"; 

        try {
            st = conn.prepareStatement(sql);
        rs = st.executeQuery();

            if (rs.next()) {
                profile = new dataProfile();
                profile.setNama(rs.getString("nama_karyawan"));
                profile.setUsername(rs.getString("username"));
                profile.setTelepon(rs.getString("telepon"));
                profile.setAlamat(rs.getString("alamat"));
                profile.setRole(rs.getString("role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return profile;
    }



    @Override
    public void tambahData(dataProduk data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void perbaruiData(dataProduk data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusData(dataProduk data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<dataProduk> tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<dataProduk> pencarianData(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String generateSHA256(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
