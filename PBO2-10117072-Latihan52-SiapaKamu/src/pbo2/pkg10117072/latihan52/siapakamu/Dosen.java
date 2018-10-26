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
public class Dosen extends Manusia{
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Riziki Adam Kurniawan umur 27 tahun sedang "
                + "mengajar matakuliah PBO\n");
        
    }
        
    


    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
        
    }
    
}
