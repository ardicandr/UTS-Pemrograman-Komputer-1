package com.service.model;

import com.model.data.dataProduk;
import java.util.List;


public interface produkServis {
    void tambahData (dataProduk data);
    void perbaruiData (dataProduk data);
    void hapusData (dataProduk data);
    
    List<dataProduk> tampilData();
    List<dataProduk> pencarianData(String id);
    
    String generateSHA256(String password);
}
