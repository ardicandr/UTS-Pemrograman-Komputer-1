package Tabel;

import com.model.data.dataKaryawan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class tabelKaryawan extends AbstractTableModel {
    
    private List<dataKaryawan> list = new ArrayList<>();
    
    public dataKaryawan getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<dataKaryawan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData (dataKaryawan Produk){
        list.add(Produk);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
    }
    
    public void updateData (int row, dataKaryawan Produk){
        list.set(row, Produk);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null,"Data Berhasil Diperbarui");
    }
    
    public void deleteData (int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
    }
    
    private final String[] columnName = {"ID","Nama Karyawan","Username","Telepon","Alamat","Role"};

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
        dataKaryawan model = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return "   " + model.getIdKaryawan();
            case 1:
                return model.getNamaKaryawan();
            case 2:
                return model.getUsername();
            case 3:
                return model.getTelepon();
            case 4:
                return model.getAlamat();
            case 5:
                return model.getRole();
                
                
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    
    
}
