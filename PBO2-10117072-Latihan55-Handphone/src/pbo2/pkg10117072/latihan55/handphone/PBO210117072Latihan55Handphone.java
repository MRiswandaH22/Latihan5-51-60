/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan55.handphone;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Data Macam - Macam merek HP
 */
public class PBO210117072Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Handphone hp = new Android("Samsung", "Android", "Grand", 3000000);
     hp.displayProduct("Samsung", "Android", "Grand", 3000000);
     
     Android ad = new Android("Samsung", "Android", "Grand", 3000000);
     ad.setKeyStore("234ibfd3840");
     System.out.println("Android Key Store : " +ad.getKeyStore()+"\n");
     
     Handphone hp2 = new BlackBerry("BlackB","RIM", "Curve", 200000);
     hp.displayProduct("BlackB","RIM", "Curve", 200000);
   
     BlackBerry bb = new BlackBerry("BlackB","RIM", "Curve", 200000);
     ad.setKeyStore("BHS249");
     System.out.println("PIN \t\t: " +ad.getKeyStore()+"\n");
  
     Handphone hp3 = new BlackBerry("Nokia","Win8", "Lumia", 100000);
     hp.displayProduct("Nokia","Win8", "Lumia", 100000);
   
     WindowsPhone wp = new WindowsPhone("Nokia","Win8", "Lumia", 100000);
     ad.setKeyStore("UUUQIJWORJ");
     System.out.println("Wp Key Store \t: " +ad.getKeyStore()+"\n");
  
    
    }
    
}
