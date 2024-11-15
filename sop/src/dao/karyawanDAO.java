package dao;

import com.DataBase.koneksiDatabase;
import com.model.data.dataKaryawan;
import com.service.model.karyawanServis;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class karyawanDAO implements karyawanServis{

    private Connection conn;
    
    public karyawanDAO() {
        conn = koneksiDatabase.getConnection();
    }
    
  
    @Override
    public void tambahData(dataKaryawan model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO user(nama_karyawan, username, password, telepon, alamat, role)" + "VALUES (?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNamaKaryawan());
            st.setString(2, model.getUsername());
            st.setString(3, generateSHA256(model.getPassword()));
            st.setString(4, model.getTelepon());
            st.setString(5, model.getAlamat());
            st.setString(6, model.getRole());
            
            st.executeUpdate();
            st.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void perbaruiData(dataKaryawan model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE user SET nama_karyawan=?,username=?,telepon=?, alamat=? , role=? WHERE id_karyawan=?";  
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNamaKaryawan());
            st.setString(2, model.getUsername());
            st.setString(3, model.getTelepon());
            st.setString(4, model.getAlamat());
            st.setString(5, model.getRole());
            st.setInt   (6, model.getIdKaryawan());
            
            st.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(dataKaryawan model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM user WHERE id_karyawan=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, model.getIdKaryawan());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<dataKaryawan> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM user";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                dataKaryawan model = new dataKaryawan();
                model.setIdKaryawan(rs.getInt("id_karyawan"));
                model.setNamaKaryawan(rs.getString("nama_karyawan"));
                model.setUsername(rs.getString("username"));
                model.setTelepon(rs.getString("telepon"));
                model.setAlamat(rs.getString("alamat"));
                model.setRole(rs.getString("role"));
                
                
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<dataKaryawan> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM user WHERE id_karyawan LIKE '%"+id+"%' "
                + "OR username LIKE '%"+id+"%' "
                + "OR nama_karyawan LIKE '%"+id+"%' "
                + "OR telepon LIKE '%"+id+"%' "
                + "OR alamat LIKE '%"+id+"%' "
                + "OR role LIKE '%"+id+"%' ";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                dataKaryawan model = new dataKaryawan();
                model.setIdKaryawan(rs.getInt("id_karyawan"));
                model.setNamaKaryawan(rs.getString("nama_karyawan"));
                model.setUsername(rs.getString("username"));
                model.setTelepon(rs.getString("telepon"));
                model.setAlamat(rs.getString("alamat"));
                model.setRole(rs.getString("role"));
                
                list.add(model);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public String generateSHA256(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodehash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder(2 * encodehash.length);
            
            for(byte b : encodehash){
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1){
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
public dataKaryawan prosesLogin(dataKaryawan model) {
    PreparedStatement st = null;
    ResultSet rs = null;
    dataKaryawan modelKar = null;
    String sql = "SELECT * FROM user WHERE username=? AND password=?";
    
    try {
        st = conn.prepareStatement(sql);
        st.setString(1, model.getUsername());
        st.setString(2, generateSHA256(model.getPassword()));
        
        rs = st.executeQuery();        

        if (rs != null && rs.next()) {
            modelKar = new dataKaryawan();
            modelKar.setIdKaryawan(rs.getInt("id_karyawan"));
            modelKar.setNamaKaryawan(rs.getString("nama_karyawan"));
            modelKar.setUsername(rs.getString("username"));
            modelKar.setRole(rs.getString("role"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return modelKar;
}

      
}
