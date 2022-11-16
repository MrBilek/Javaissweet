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
        int birlerBasamağı= 3426%10; // 6 yı buluruz

        System.out.println("birler basamağı: " +birlerBasamağı);

        System.out.println(girilenSayı/10);

        girilenSayı= girilenSayı/10; //342

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tam sayı giriniz");

        int girilensayı= scan.nextInt(); // 2457
        //soru için lazımolacak varible ları hazırlayalım

        int birlerBasamagı=0;
        int rakamlarToplamı=0;

        // sırasıyla her bir basamağı elde edip
        // rakamlar toplamına ekleyelim

        birlerBasamagı=girilensayı%10;// 7 buldu
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı; // 0+7= 7 oldu
        girilensayı=girilensayı%10; // yani 245

        birlerBasamagı=girilensayı%10; //5
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı; // 7+5 =12
        girilensayı=girilensayı%10; // 245/10= 24 mod sadece son rakamı verir

        birlerBasamagı=girilensayı%10; //4
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; // 12+4= 16
        girilensayı=girilensayı%10; //2

        birlerBasamagı=girilensayı%10; // 2
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; // 16+2=18
        girilensayı=girilensayı/10; //0

        System.out.println("girilen sayının rakamlar toplamı" +rakamlarToplamı);







    }
}
