package com.anugerahashar.praktikumjava;

import Model.Mahasiswa;
import Model.MahasiswaTransfer;

public class PraktikumJava {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setId(1);
        mahasiswa.setNPM("17990001");
        mahasiswa.setNama("Abu Bakr Ash-Shiddiq");
        mahasiswa.setIPK(3.9);
        
        mahasiswa.viewData();
        
        Mahasiswa m1 = new Mahasiswa(
                2, 
                "17990001", 
                "Umar ibn Khattab", 
                3.9
        );
        
        m1.viewData();
        
        Mahasiswa mt = new MahasiswaTransfer();
        
        mt.setId(3);
        mt.setNPM("17990003");
        mt.setNama("Utsman ibn Affan");
        mt.setIPK(3.9);
        
        mt.viewData();
    }
}
