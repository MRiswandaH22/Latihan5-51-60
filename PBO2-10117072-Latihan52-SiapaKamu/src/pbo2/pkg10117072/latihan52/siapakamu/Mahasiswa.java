/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan52.siapakamu;

/**
 *
 * @author X441UV
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String Kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Muhammad Riswanda Hasan umur 19 tahun "
                + "sedang belajar di kelas PBO2");
               
        
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    
}
