package day03_dataCasting_Matematikselişlemler;

import java.util.Scanner;

public class C06_DataCasting {

    public static void main(String[] args) {

        /*// Soru 5- Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir ondalıklı sayı giriniz");

        double sayıDbl= scan.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz");
        int sayıInt= scan.nextInt();

        System.out.println(sayıDbl/sayıInt); // sonucu double olarak yazdırır

        System.out.println((int) sayıDbl/sayıInt); // sonucu double yazdırır




    }
}
