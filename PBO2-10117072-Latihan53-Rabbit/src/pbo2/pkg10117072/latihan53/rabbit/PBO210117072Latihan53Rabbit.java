/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan53.rabbit;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        ciri-ciri Kelinci
 */
public class PBO210117072Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Rabbit rabb = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, his name is " +rabb.getName());
        System.out.println(rabb.getName()+" is " + "Vegetarian ? " +rabb.isVegetarian());
        System.out.println(rabb.getName()+" eats " + rabb.getEats());
        System.out.println(rabb.getName()+ " has " +rabb.getNoOfLegs()+ " legs");
        System.out.println(rabb.getName()+" color is "+rabb.getColor());
    }
    
}
