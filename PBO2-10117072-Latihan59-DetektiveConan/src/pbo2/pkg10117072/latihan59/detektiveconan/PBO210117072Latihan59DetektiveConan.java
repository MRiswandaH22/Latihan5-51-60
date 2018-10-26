/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan59.detektiveconan;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Data Karakter anime detektive Conan
 */
public class PBO210117072Latihan59DetektiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Karakter Animasi Detektif Conan Yang berkacamata");
        System.out.println("================================================");
        
        Berkacamata bkc = new Berkacamata("Shinichi Kudo (Conan)", true, "Muda", "Coklat");
        Berkacamata bkc2 = new Berkacamata("Hiroshi Agasa", true, "Tua", "Abu");
        Berkacamata bkc3 = new Berkacamata("Eri Kisaki", true, "Tua", "Coklat");
        
        System.out.println("1. Nama \t\t: " +bkc.getNama());
        System.out.println("   Usia \t\t: " +bkc.getUsia());
        System.out.println("   Warna Rambut \t: " +bkc.getWarnaRambut());
        System.out.println("   Apakah Berkacamata \t: " +bkc.apakahBerkacamata()+"\n");
    
        System.out.println("2. Nama \t\t: " +bkc2.getNama());
        System.out.println("   Usia \t\t: " +bkc2.getUsia());
        System.out.println("   Warna Rambut \t: " +bkc2.getWarnaRambut());
        System.out.println("   Apakah Berkacamata \t: " +bkc2.apakahBerkacamata()+"\n");
    
        System.out.println("3. Nama \t\t: " +bkc3.getNama());
        System.out.println("   Usia \t\t: " +bkc3.getUsia());
        System.out.println("   Warna Rambut \t: " +bkc3.getWarnaRambut());
        System.out.println("   Apakah Berkacamata \t: " +bkc3.apakahBerkacamata()+"\n");
    
        System.out.println("Developed By Riswanda");
    }
    
}
