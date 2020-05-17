

package benimalgoritma2sorum;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @Geliştirici GurkanSenturk
 */

/*Dışarıdan girilen değerlere göre üçgenin, dikdörtgenin, dairenin alan ve çevresini bulan java programını yazınız.(OOP kavramlarını kullanarak)*/


 class bilgiler
 {
 private int a;
 private int b;
 private int c;
 private int d;

 public String ücgenalancevrehesap(int a,int b,int c,int d)
    {bilgiler bilgi = new bilgiler(a, b, c);
    a=bilgi.getA();
    b = bilgi.getB();
    c = bilgi.getC();
    int cevre = a+b+c;
        int alan = c*(d/2);
        String sonuc = "Girilen değerlere göre üçgenin alanı: "+alan+" üçgenin çevresi: "+cevre;
        return sonuc;
     }

 public String dörtgenalancevrehesap(int a,int b)
{bilgiler bilgi = new bilgiler(a, b);
    a=bilgi.getA();
    b = bilgi.getB();
   
    int cevre= (a+b)*2;
    int alan = a*b;
    return "Seçilen değerlere göre dikdörtgenin alanı: "+alan+" dikdörtgenin çevresi: "+cevre;
}
    

 public String dairealancevrehesap(int yarıcap)

 {bilgiler bilgi = new bilgiler(yarıcap);
    yarıcap=bilgi.getYaricap();
     double pi = 3.14;
    double alan = pi*(yarıcap*yarıcap);
    double cevre =2*pi*yarıcap;
    return "Seçilen değere göre dairenin alanı: "+alan+" dairenin çevresi: "+cevre;


}
    public bilgiler(int yaricap) {// DAİRE İŞLEMLERİ İÇİN
        this.yaricap = yaricap;
    }
 private  int yaricap;

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public bilgiler(int a, int b, int c) {//üçgen İŞLEMLERİ için 
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public bilgiler(int a, int b) {// DİKDÖRTGEN İŞLEMLERİ için
        this.a = a;
        this.b = b;
       
    }

 
 }

public class BenimAlgoritma2Sorum extends islemler //KALITIM
{ public static void main(String[] args) 
    {bilgiler bilgi;
        Scanner giris = new Scanner(System.in);
        String secim = "";
        
        
        while (!secim.equals("q")) {            
            
        
        System.out.println("Hangi İşlemi yapmak istiyorsunuz? Lütfen seçin\n"
                + "1- Üçgenin alan ve çevre hesabı\n"
                + "2- Dikdörtgenin alan ve çevre hesabı\n"
                + "3- Dairenin alan ve çevre hesabı\n"
                + "Çıkmak için 'q' tuşuna basın.");
                secim =giris.nextLine();
                  System.out.println("-------");
                System.out.println("----------------");
                System.out.println("----------------------");

        if(secim.equals("q")){break;}
        switch(secim)
        {
            case "1" :
                System.out.println("Lütfen üçgenin 1. kenarı girin: ");
                int kose1 = giris.nextInt();
                System.out.println("Lütfen üçgenin 2. kenarı girin: ");
                int kose2 = giris.nextInt();
                System.out.println("Lütfen üçgenin taban kenarını girin: ");
                int kose3 = giris.nextInt();
                System.out.println("Lütfen üçgenin yüksekliğini girin: ");
               int yukseklik= giris.nextInt();
               bilgi= new bilgiler(kose1, kose2, kose3);
             

                System.out.println(bilgi.ücgenalancevrehesap(kose1, kose2, kose3, yukseklik));
                System.out.println("-------");
                System.out.println("----------------");
                System.out.println("----------------------");

               break;
            case "2":
                System.out.println("Lütfen dikdörtgenin kısa kenarını girin: ");
                int a = giris.nextInt();
                System.out.println("Lütfen dikdörtgenin uzun kenarını girin: ");
                int b = giris.nextInt();
                            bilgi= new bilgiler(a, b);

                System.out.println(bilgi.dörtgenalancevrehesap(a, b));
                break;
            case "3":
                System.out.println("Lütfen dairenin yarı çapını girin: ");
                int r = giris.nextInt();
                bilgi=new bilgiler(r);
                System.out.println(bilgi.dairealancevrehesap(r));
                  System.out.println("-------");
                System.out.println("----------------");
                System.out.println("----------------------");
                break;
        }    
    }
    }
    
    
}
