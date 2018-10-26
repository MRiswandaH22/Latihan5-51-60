/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan60.akatsuki;

/**
 *
 * @author X441UV
 */
public class Akatsuki {
    protected String asalKampung;
    protected String kekuatan;
    

    public Akatsuki(String asalKampung,String Kekuatan){
        this.asalKampung = asalKampung;
        this.kekuatan = Kekuatan;
    }
    
    public void karakterAkatsuki(){
        
        System.out.println("   Asal Kampung \t\t: "+asalKampung);
        System.out.println("   Kekuatan \t\t\t: "+kekuatan);
    }
    
}
