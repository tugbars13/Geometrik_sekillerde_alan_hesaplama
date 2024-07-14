
package geometrik.şekillerin.alanını.hesaplama;

public class kare extends sekil{
private int kenar;

    public kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }
    
    @Override
    public void alanHesapla() {
        System.out.println(getIsim()+" in alani : "+(kenar*kenar));
    }
    
}
