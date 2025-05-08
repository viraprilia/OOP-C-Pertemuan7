package pertemuan703;

/**
 *
 * @author Wihelmina Aprilia
 * TGL: 8 Mei 2025
 */
public class segiTiga extends BangunRuang {
    private int alas, tinggi;
    
    @Override
    public void hitungLuas(){
        this.luas = this.alas*this.tinggi/2;
    }

    
    public void setAlas(int nilai){
        this.alas = nilai;
    }
    public void setTinggi(int nilai){
        this.tinggi = nilai;
    }
    public void cetakLuas(){
        System.out.printf("Luas Segitiga dengan nilai alas=%d dan tinggi=%d adalah %.2f", this.alas,this.tinggi,this.luas);
    }
}
