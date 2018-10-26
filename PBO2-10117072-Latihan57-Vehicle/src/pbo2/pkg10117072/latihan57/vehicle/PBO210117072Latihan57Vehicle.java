/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan57.vehicle;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Moden Sepeda dan SkateBoard
 */
public class PBO210117072Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehicle vc = new Vehicle();
        Bicycle bcl = new Bicycle();
        
        vc.setMyBrand("Trek Bike");
        vc.setMyModel("7.4 FX");
        bcl.setMyGearCount(23);
        
        System.out.println("Brand : "+vc.getMyBrand());
        System.out.println("Model : "+vc.getMyModel());
        System.out.println("Jumlah Gear : "+bcl.getMyGearCount()+"\n");
    
        Vehicle vc2 = new Vehicle();
        Skateboard skt = new Skateboard();
  
        vc2.setMyBrand("Ally Skate");
        vc2.setMyModel("Rocket");
        skt.setMyBoardLenght(54.5);
        
        System.out.println("Brand : "+vc2.getMyBrand());
        System.out.println("Model : "+vc2.getMyModel());
        System.out.println("Jumlah Gear : "+skt.getMyBoardLenght());
    }
    
}
