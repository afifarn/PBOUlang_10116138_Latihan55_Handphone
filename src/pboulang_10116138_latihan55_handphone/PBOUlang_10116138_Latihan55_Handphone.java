/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan55_handphone;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Produk Handphone
 */
public class PBOUlang_10116138_Latihan55_Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        
        System.out.println("");
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        
        System.out.println("");
        WindowsPhone nokia = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        nokia.setWpKeyStore("UUUQIJWORJ");
        nokia.displayProduct();
        System.out.println("Wp Key Store : "+nokia.getWpKeyStore());


    }

}
