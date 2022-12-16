package odev7;

import java.util.Scanner;

public class Odev7 {

    public static void main(String[] args) {

        int vize, final_notu;
        double sonuc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Vize Notunuzu Giriniz: ");
        vize = scan.nextInt();

        System.out.print("Final Notunuzu Giriniz: ");
        final_notu = scan.nextInt();

        sonuc = (vize * 0.40 + final_notu * 0.60);
        System.out.println("Ders Notunuz: " + sonuc);

        if (sonuc >= 95) {
            System.out.println("Harf Notunuz A1 =>Başarılı");

        } else if (sonuc >= 90) {
            System.out.println("Harf Notunuz A2 =>Başarılı");

        } else if (sonuc >= 85) {
            System.out.println("Harf Notunuz A3 =>Başarılı");

        } else if (sonuc >= 70) {
            System.out.println("Harf Notunuz B =>Başarılı");

        } else if (sonuc >= 55) {
            System.out.println("Harf Notunuz C =>Başarılı");

        } else if (sonuc >= 40) {
            System.out.println("Harf Notunuz D =>Şartlı Başarılı");

        } else if (sonuc >= 35) {
            System.out.println("Harf Notunuz F1 =>Başarısız");

        } else if (sonuc >= 0) {
            System.out.println("Harf Notunuz F2 =>Başarısız");

        } else {
            System.out.println("Harf Notunuz F3 Devamsızlıktan kaldınız!");
        }
    }

}
