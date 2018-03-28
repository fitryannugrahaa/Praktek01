/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author user
 */
public class BurungAksi {
    public static void main(String[] args) {
        Burung Merak = new Burung();
        Merak.Jenis_makanan="biji_bijian";
        Merak.Warna_bulu="Biru";
        Merak.Paruh="Pendek_runcing";
        Merak.Kaki="Panjang_ramping";
        Merak.Ekor="Pertahanan";
        
        Burung pipit = new Burung();
        
        pipit.Jenis_makanan="biji_bijian";
        pipit.Warna_bulu="Coklat";
        pipit.Paruh="Pendek_runcing";
        pipit.Kaki="Kuat";
        pipit.Ekor="Penyeimbang";
        
        Burung Elang = new Burung();
        
        Elang.Jenis_makanan="daging";
        Elang.Warna_bulu="Hitam";
        Elang.Paruh="untuk_mecabit_makanan";
        Elang.Kaki="Mencengkram_mangsa";
        
        Merak.cetakInfo();
        pipit.cetakInfo();
        Elang.cetakInfo();
    }
}
