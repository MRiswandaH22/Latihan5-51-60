/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan52.siapakamu;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Data Dosen dan Mahasiswa
 */
public class PBO210117072Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Dosen dsn = new Dosen();
     
     dsn.setNama("Rizky Adam Kurniawan");
     dsn.setNip("41227829930");
     dsn.setMataKuliah("PBO2");
     

     Mahasiswa msn = new Mahasiswa();
     
     msn.setNim("10117072");
     msn.setNama("Muhammad Riswanda Hasan");
     msn.setKelas("PBO2");
       
        System.out.println("NIP DOSEN : " +dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();
        
        System.out.println("NIM MAHASISWA : " +msn.getNim());
        msn.siapaKamu();
        msn.kelasApa();
       
 
       
    }
    
}
