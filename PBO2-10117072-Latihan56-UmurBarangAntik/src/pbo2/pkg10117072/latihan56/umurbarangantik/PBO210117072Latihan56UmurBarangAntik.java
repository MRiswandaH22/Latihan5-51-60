/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan56.umurbarangantik;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Nama Barang Antik Beserta Umur barang tersebut
 */
public class PBO210117072Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Radio rd = new Radio(234);
        BarangAntik ba = new BarangAntik(234);
        rd.setName("Radio AM");
        System.out.println("Nama Barang Antik : " +rd.getName() );
        ba.tampilUmur();
    }
    
}
