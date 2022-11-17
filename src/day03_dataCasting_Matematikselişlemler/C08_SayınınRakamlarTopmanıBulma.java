package day03_dataCasting_Matematikselişlemler;

import java.util.Scanner;

public class C08_SayınınRakamlarTopmanıBulma {

    public static void main(String[] args) {

        /*kullanıcıdan 4 basamaklı pozitif bir tam sayı alın
        sayının rakamlar toplamını bulun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int girilensayı= scan.nextInt(); // 2457

        //soru için lazım olacak varible ları hazırlayalım

        int birlerBasamagı=0;
        int rakamlarToplamı=0;

        // sırasıyla her bir basamağı elde edip
        // rakamlar toplamına ekleyelim

        birlerBasamagı=girilensayı%10;// 7 buldu
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı; // 0+7= 7 oldu
        girilensayı=girilensayı/10; // yani 245

        birlerBasamagı=girilensayı%10; //5
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı; // 7+5 =12
        girilensayı=girilensayı/10; // 245/10= 24 mod sadece son rakamı verir

        birlerBasamagı=girilensayı%10; //4
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; // 12+4= 16
        girilensayı=girilensayı/10; //2

        birlerBasamagı=girilensayı%10; // 2
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; // 16+2=18
        girilensayı=girilensayı/10; //0

        System.out.println("girilen sayının rakamlar toplamı" +rakamlarToplamı);





    }
}
