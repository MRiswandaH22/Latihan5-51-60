/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan59.detektiveconan;

/**
 *
 * @author X441UV
 */
public class Berkacamata extends Penampilan{
    private String nama; 
    private String warnaRambut; 

    public Berkacamata(String nama, boolean kacamata, String usia, String warna) {
        super(kacamata, usia);
        
        this.usia = usia;
        this.berkacamata = kacamata;
        this.nama = nama;
        this.warnaRambut = warna;
    }

    
    public String getNama() {
        return nama;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }
    
    
}
