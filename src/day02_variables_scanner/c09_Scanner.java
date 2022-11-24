package day02_variables_scanner;

import java.util.Scanner;

public class  c09_Scanner {
    public static void main(String[] args) {

       /* Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı 1'i giriniz");
        int sayı1= scan.nextInt();
        System.out.println("Lütfen sayı2'yi giriniz");
        int sayı2= scan.nextInt();

        int temp;
        // sayı 2 değerini temp e atayalım

        temp= sayı2;
        // sayı 1 dğerini sayı 2 ye atayalım

        sayı2=sayı1;
        //temp deki değeri 1 e atayalım

        sayı1=temp;
        System.out.println("sayıların yerini değiştirelim"
                                                            +"sayı 1 in yeni değeri" +sayı1

                                                            +"sayı 2 nin yeni değeri" + sayı2 );





    }
}
