/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan53.rabbit;

/**
 *
 * @author X441UV
 */
public class Rabbit extends Animal{

    private String color;
    private String name;

    public Rabbit(String name, boolean veg , String food, int legs, String color) {
        super(veg, food, legs);
        
        this.vegetarian = veg;
        this.name = name;
        this.color = color;
    }

    
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
   
    
    
}
