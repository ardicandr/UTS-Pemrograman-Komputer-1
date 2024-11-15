package Tabel;

import com.model.data.dataProduk;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class tabelProduk extends AbstractTableModel {
    
    private List<dataProduk> list = new ArrayList<>();
    
    public dataProduk getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<dataProduk> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData (dataProduk Produk){
        list.add(Produk);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
    }
    
    public void updateData (int row, dataProduk Produk){
        list.set(row, Produk);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null,"Data Berhasil Diperbarui");
    }
    
    public void deleteData (int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
    }
    
    private final String[] columnName = {"ID","Nama Produk","ID Kategori","Harga","Stok","ID Supplier","Barcode"};

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        dataProduk produk = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return produk.getIdProduk();
            case 1:
                return produk.getNamaProduk();
            case 2:
                return produk.getIdKategori();
            case 3:
                return produk.getHarga();
            case 4:
                return produk.getStok();
            case 5:
                return produk.getIdSupplier();
            case 6:
                return produk.getBarcode();
                
                
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    
    
}
