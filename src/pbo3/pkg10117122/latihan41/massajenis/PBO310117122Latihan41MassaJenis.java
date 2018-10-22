/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan41.massajenis;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Menampilkan sisi, massa, beserta hasil perhitungan Volume
 *                     dan massa jenis kubus.
 */
public class PBO310117122Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus object = new Kubus();
        
        System.out.println("======Massa Jenis Kubus======");
        object.setSisi(5);
        object.setMassa(250);
        
        System.out.println("Sisi  : " + object.getSisi());
        System.out.println("Massa : " + object.getMassa());
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume      : " + object.hitungVolume(0));
        System.out.println("Massa Jenis : " + object.hitungMassaJenis(0,0));
        
        System.out.println();
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");

    }
    
}
