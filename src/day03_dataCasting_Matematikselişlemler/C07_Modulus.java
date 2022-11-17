package day03_dataCasting_Matematikselişlemler;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {
        // % Modulus: Java da bölme işlemi sonucunda kalan sayıyı verir.

        System.out.println(15%4); // 3

        System.out.println(45%4); // 1 kalan old için.

        /* kullanıcının girdiği deger cift sayı mı?

         girilenSayı%2 islemimin sonucu 0 ise cift sayıdır

         kullanıcının girdii sayı 7 nin katı mı?

        girilen sayı % 7 isleminin sonucu 0 ise 7 nin katıdır.

        kullanıcının girdiği sayının 1 ler basamagı

        kullanıcı 3426 girdi
        girilensayı


         */

        int girilenSayı=3426;
        int birlerBasamağı=girilenSayı; // 6 yı buluruz

        System.out.println("birler basamağı: " +birlerBasamağı);

        girilenSayı= girilenSayı/10; //342

        System.out.println("birler basamağı ."+birlerBasamağı);
        girilenSayı= girilenSayı/10;


        Scanner scan = new Scanner(System.in);







    }
}
