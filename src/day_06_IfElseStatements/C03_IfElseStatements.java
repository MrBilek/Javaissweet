package day_06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        /* Kullanıcıdan bir harf isteyin,
        girilen karakter kücük harf ise onu büyük harf olarak yazdırın,
        yoksa girilen harfi yazdırın
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char girilenKarakter=  scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter <='z'){

            System.out.println(Character.toUpperCase(girilenKarakter));

        }else {
            System.out.println("Girilen Karakter");


        }



    }
}
