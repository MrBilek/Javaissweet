package day02_variables_scanner;

import java.util.Scanner;

public class c10_Scanner {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı girin");
        double sayıDbl= scan.nextDouble();
        System.out.println("Lütfen bir tam sayı girin");
        int sayıİnt= scan.nextInt();
        System.out.println("sayıların toplamı:" + (sayıDbl+sayıİnt));
        System.out.println("sayıların çarpımı "+ (sayıDbl*sayıİnt));



    }
}
