
package pertemuan703;

/**
 *
 * @author Wihelmina Aprilia
 * TGL: 8 Mei 2025
 */
public class persegi extends BangunRuang{
    private int panjang, lebar;
    
    public void setPanjang(int pj){
        this.panjang = pj;
    }
    public void setLebar(int lb){
        this.lebar = lb;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = this.panjang*this.lebar;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = 2*(this.panjang+this.lebar);
    }
    
    
}
