package dao;

import com.DataBase.koneksiDatabase;
import com.model.data.dataProduk;
import com.service.model.produkServis;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class produkDao implements produkServis{

    private Connection conn;
    
    public produkDao() {
        conn = koneksiDatabase.getConnection();
    }
    
  
    @Override
    public void tambahData(dataProduk data) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO produk(nama_produk, id_kategori, harga, stok, id_supplier, barcode)" + "VALUES (?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, data.getNamaProduk());
            st.setString(2, data.getIdKategori());
            st.setLong(3, data.getHarga());
            st.setInt(4, data.getStok());
            st.setString(5, data.getIdSupplier());
            st.setString(6, data.getBarcode());
            
            st.executeUpdate();
            st.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void perbaruiData(dataProduk data) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE produk SET nama_produk=?,id_kategori=?," + "harga=?,stok=?,id_supplier=?,barcode=? WHERE id_produk=?";  
            st = conn.prepareStatement(sql);
            st.setString    (1, data.getNamaProduk());
            st.setString    (2, data.getIdKategori());
            st.setLong      (3, data.getHarga());
            st.setInt       (4, data.getStok());
            st.setString    (5, data.getIdSupplier());
            st.setString    (6, data.getBarcode());
            st.setInt       (7, data.getIdProduk());
            
            st.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(dataProduk data) {
        PreparedStatement st = null;
        String sql = "DELETE FROM produk WHERE id_produk=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, data.getIdProduk());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<dataProduk> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM produk";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                dataProduk produk = new dataProduk();
                produk.setIdProduk(rs.getInt("id_produk"));
                produk.setNamaProduk(rs.getString("nama_produk"));
                produk.setIdKategori(rs.getString("id_kategori"));
                produk.setHarga(rs.getLong("harga"));
                produk.setStok(rs.getInt("stok"));
                produk.setIdSupplier(rs.getString("id_supplier"));
                produk.setBarcode(rs.getString("barcode"));
                
                list.add(produk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<dataProduk> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM produk WHERE nama_produk LIKE '%"+id+"%' "
                + "OR id_kategori LIKE '%"+id+"%' "
                + "OR id_supplier LIKE '%"+id+"%' "
                + "OR barcode LIKE '%"+id+"%' ";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                dataProduk produk = new dataProduk();
                produk.setIdProduk(rs.getInt("id_produk"));
                produk.setNamaProduk(rs.getString("nama_produk"));
                produk.setIdKategori(rs.getString("id_kategori"));
                produk.setHarga(rs.getLong("harga"));
                produk.setStok(rs.getInt("stok"));
                produk.setIdSupplier(rs.getString("id_supplier"));
                produk.setBarcode(rs.getString("barcode"));
                
                list.add(produk);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      
}
