/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan55.handphone;

/**
 *
 * @author X441UV
 */
public class Handphone {
 
    protected  String manufacture;
    protected  String operatingSystem;
    protected  String model;
    protected  int harga;
    
    public Handphone(String man, String os, String model, int harga){
        
    }
    
    public void displayProduct(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
        
        System.out.println("Manufakture \t: " +man);
        System.out.println("OS \t\t: " +os);
        System.out.println("Model \t\t: " +model);
        System.out.println("Harga \t\t: " +harga);
        
        
    }
}
