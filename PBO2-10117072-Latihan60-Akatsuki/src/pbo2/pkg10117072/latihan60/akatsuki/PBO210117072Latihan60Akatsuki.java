/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan60.akatsuki;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Data Kelompok Akatsuki yang sedang dicari(Buron)
 */
public class PBO210117072Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DAFTAR ANGGOTA AKATSUKI YANG DICARI");
        System.out.println("===================================");
        
        Itachi it = new Itachi("Konoha", "Sharingan");
        it.setNamaLengkap("Itachi uchiha");
        System.out.println("1. Nama Lengkap \t\t: " +it.getNamaLengkap());
        Akatsuki ak = new Akatsuki("Konoha", "Ameterasu, Susanoo, Sharingan, Tsukuyomi, Yasaka Magata"+"\n");
        ak.karakterAkatsuki();
        
      
        Kisame ks = new Kisame("Kirigakure", "Dochu Senko, Kuchiyose no jutsu, Mizubushin no jutsu");
        it.setNamaLengkap("Kisame Hoshigaki");
        System.out.println("2. Nama Lengkap \t\t: " +it.getNamaLengkap());
        Akatsuki ak2 = new Akatsuki("Kirigakure", "Dochu Senko, Kuchiyose no jutsu, Mizubushin no jutsu"+"\n"
        );
        ak2.karakterAkatsuki();
        
        System.out.println("   Mereka adalah anggota tim Akatsuki yang sangat kuat" +"\n");
        System.out.println("Developed By Riswanda");
      
    }
    
}
