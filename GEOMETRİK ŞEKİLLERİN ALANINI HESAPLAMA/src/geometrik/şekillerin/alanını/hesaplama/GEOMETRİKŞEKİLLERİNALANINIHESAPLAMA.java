
package geometrik.şekillerin.alanını.hesaplama;

import java.util.Scanner;

public class GEOMETRİKŞEKİLLERİNALANINIHESAPLAMA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String islemler = "islemler\n"
                + "1-kare alan hesapla\n"
                + "2-ucgen alan hesapla\n"
                + "3-daire alan hesapla\n"
                + "cikis : q";
        while(true){
            System.out.println(islemler);
            System.out.println("hangi seklin alanini hesaplamak istersiniz : ");
            String sekil_turu = input.nextLine();
            sekil sekil = null;
            
            if (sekil_turu.equals("q")) {
                System.out.println("uygulamadan cikiliyor ! ");
                break;
            }else if(sekil_turu.equals("1")){
                System.out.println("karenin kenari : ");
                int kenar = input.nextInt();
                input.nextLine();
                
                sekil  = new kare(kenar,"kare");
                sekil.alanHesapla();
                
            }else if(sekil_turu.equals("2")){
                System.out.println("kenar 1 : ");
                int kenar1=input.nextInt();
                System.out.println("kenar 2 : ");
                int kenar2=input.nextInt();
                System.out.println("kenar 3 : ");
                int kenar3=input.nextInt();
                input.nextLine();
                
                sekil = new ucgen(kenar1,kenar2,kenar3,"ucgen");
                sekil.alanHesapla();
            }else if(sekil_turu.equals("3")){
                System.out.println("direnin yaricapi : ");
                int yaricap =input.nextInt();
                input.nextLine();

                sekil = new daire (yaricap,"daire");
                sekil.alanHesapla();
            }else{
                System.out.println("gecersiz islem girdiniz...");
            }
        }
        
    }
    
}
