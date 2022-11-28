package day02_variables_scanner;

import java.util.Scanner;

public class c10_Scanner {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

         */
    Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir double sayı alın");

        double dbl= scan.nextDouble();

        System.out.println("Lütfen bir integer sayı alınız");
        int int1= scan.nextInt();

        System.out.println(dbl+int1 );
        System.out.println(dbl*int1);

//tekrar bakalım benim yaptıgımla fark ne

     Scanner can= new Scanner(System.in);

        System.out.println("Kullanicidan bir double sayi alin");

        double sayi= can.nextDouble();

        System.out.println("birde integer sayi alin");

        int sayi2= scan.nextInt();

        System.out.println("sayilarin carpimi"+ (sayi*sayi));
        System.out.println("sayilarin toplami" +sayi+sayi2);







    }
}
