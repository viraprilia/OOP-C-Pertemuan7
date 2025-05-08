package javaapplication1;

/**
 *
 * @author Wihelmina Aprilia
 * TGL: 8 Mei 2025
 * Contoh class Overloading
 */
public class salam {
    String tx = "Menggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam(){
        System.out.println(this.tx);
    }
    public void tulisSalam(String txt){
        System.out.println(txt);
    }
    public void tulisSalam(int txt){
        System.out.println(txt);
    }
    public static String tulisSalam(String nama, Sring waktu)
}
