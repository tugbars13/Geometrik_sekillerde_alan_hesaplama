
package geometrik.şekillerin.alanını.hesaplama;

public class daire extends sekil{
    private int yaricap;

    public daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }
    
    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" in alani : "+(Math.PI*yaricap*yaricap));
    }
    
}
