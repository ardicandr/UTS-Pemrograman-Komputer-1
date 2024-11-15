package com.service.model;

import com.model.data.dataKaryawan;
import java.util.List;

public interface karyawanServis {
    void tambahData (dataKaryawan model);
    void perbaruiData (dataKaryawan model);
    void hapusData (dataKaryawan model);
    
    List<dataKaryawan> tampilData();
    List<dataKaryawan> pencarianData(String id);
    
    String generateSHA256(String password);
    dataKaryawan prosesLogin(dataKaryawan model);   

    
}
