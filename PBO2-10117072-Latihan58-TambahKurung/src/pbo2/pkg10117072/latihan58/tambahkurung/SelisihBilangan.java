/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan58.tambahkurung;

/**
 *
 * @author X441UV
 */
public class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        this.x = x;
        this.y = y;
        
        int tampilSelisih = x-y;
        System.out.println("Hasil Selisih " +x+" - " +y+ " = " +tampilSelisih);
    }
}
