package day02_variables_scanner;

import java.util.Scanner;

public class  c09_Scanner {
    public static void main(String[] args) {

       /* Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        */

     Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 1.sayiyi girin");

        int sayi1= scan.nextInt();

        System.out.println("2.sayiyi girin");

        int sayi2= scan.nextInt();

        int temp= sayi2;

        sayi2=sayi1;

        sayi1=temp;
        System.out.println("sailarin yerini degistirin"
                           +"\nsayi1 in yeni degeri"+sayi1
                            +"\nsayi2 nin yeni degeri"+sayi2
        );







    }
}
