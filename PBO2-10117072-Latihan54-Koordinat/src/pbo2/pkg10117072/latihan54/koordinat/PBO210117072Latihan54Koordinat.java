/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan54.koordinat;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Titik Koordinat dengan Keterangan warna
 */
public class PBO210117072Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat WK = new WarnaKoordinat(10, 4, "Jingga");
      
        System.out.println("Warna Koordinat   : " +WK.getNamaWarna());
        System.out.println("Koordinat Sumbu X : " +WK.getX()+ " Y : " +WK.getY()); 
    }
    
}
