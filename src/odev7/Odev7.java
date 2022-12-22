package odev7;

import java.util.Scanner;

public class Odev7 {

    public static void main(String[] args) {

        int vize_notu, final_notu; //vize adlı değişken vize_notu olarak değiştirildi.
        double sonuc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Vize Notunuzu Giriniz: ");
        vize_notu = scan.nextInt();

        System.out.print("Final Notunuzu Giriniz: ");
        final_notu = scan.nextInt();

        if ((vize_notu>100)||(final_notu>100)){  //hatalı giriş kontrolü eklendi.
            System.out.println("Hatalı not girişi yaptınız!");
        }else{
            sonuc=(vize_notu*0.40+final_notu*0.60);
            System.out.println("Ders Notunuz: "+sonuc);
         
            if (sonuc>85) {
         
                System.out.println("Harf Notunuz AA");
            }
            else if (sonuc<85 && sonuc>80) {
         
             System.out.println("Harf Notunuz BA");
            }
            else if (sonuc<80 && sonuc>75) {
         
            System.out.println("Harf Notunuz BB");
            }
            else if (sonuc<75 && sonuc>65) {
         
             System.out.println("Harf Notunuz CB");
            }
            else if (sonuc<65 && sonuc>60) {
            
             System.out.println("Harf Notunuz CC");
            }
            else if (sonuc<60&& sonuc>55) {
         
             System.out.println("Harf Notunuz CD");
             }
            else if (sonuc<55 && sonuc>50) {
         
             System.out.println("Harf Notunuz DD");
            }
            else{
              System.out.println("Harf Notunuz FF Basarisiz Oldunuz!");
            }
     }
    }

}
