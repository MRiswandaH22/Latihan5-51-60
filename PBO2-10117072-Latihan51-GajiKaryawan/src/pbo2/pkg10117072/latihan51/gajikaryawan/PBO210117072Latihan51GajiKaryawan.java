/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Data gaji Karyawan
 */
public class PBO210117072Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("==PROGRAM PERHITUNGAN GAJI KARYAWAN===");
        
        Manager kyn = new Manager();
        
        Scanner scn = new Scanner (System.in);
        Scanner scn2 = new Scanner (System.in);
        Scanner scn3 = new Scanner (System.in);
        Scanner scn4 = new Scanner (System.in);
        Scanner scn5 = new Scanner (System.in);
        
        System.out.print("Masukan NIK : ");
        kyn.setNik(scn.nextLine());
    
        System.out.print("Masukan NAMA : ");
        kyn.setNama(scn2.nextLine());
    
        System.out.print("Masukan Golongan (1/2/3) : ");
        kyn.setGolongan(scn3.nextInt());
    
        System.out.print("Masukan JABATAN (Manager/Kebag) : ");
        kyn.setJabatan(scn4.nextLine());

        System.out.print("Masukan Jumlah Kehadiran : ");
        kyn.setKehadiran(scn5.nextInt());
        
        
        System.out.println("===Hasil Perhitungan====");
        System.out.println("NIK  : " +kyn.getNik());
        System.out.println("Nama : " +kyn.getNama());
        System.out.println("Golongan : " +kyn.getGolongan());
        System.out.println("Jabatan  : " +kyn.getJabatan());

        
        System.out.println("Tunjangan Golongan  : " +kyn.tunjanganGolongan(kyn.getGolongan()));        
        System.out.println("Tunjangan Jabatan   : " +kyn.tunjanganJabatan(kyn.getJabatan()));  
        System.out.println("Tunjangan Kehadiran : " +kyn.tunjanganKehadiran(kyn.getKehadiran())); 
   
        System.out.println("Gaji Total : "+kyn.gajiTotal());
    }
}