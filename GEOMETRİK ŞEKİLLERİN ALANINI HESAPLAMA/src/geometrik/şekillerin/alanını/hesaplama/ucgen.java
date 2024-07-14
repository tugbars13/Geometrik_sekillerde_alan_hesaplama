/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrik.şekillerin.alanını.hesaplama;

/**
 *
 * @author WIN10
 */
public class ucgen extends sekil{
    private int a;
    private int b;
    private int c;

    @Override
    public void alanHesapla() {
        double u = (a+b+c) / 2.0;
        double alan = Math.sqrt(u*(u-a)-(u-b)*(u-c));
        System.out.println(getIsim()+" in alani : "+alan);
    }

    public ucgen(int a, int b, int c, String isim) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
