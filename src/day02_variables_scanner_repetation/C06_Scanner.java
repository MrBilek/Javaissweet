package day02_variables_scanner_repetation;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin
        // ve sayının karesini yazdırın


        //Not: Kullanıcıdan birşey isteyeceğimiz zaman Scanner kodunu girmeliyiz.

        Scanner scan = new Scanner(System.in);

        //Kullanıcıya mesaj vermek için kullanılır. sout

        System.out.println("Karesini almak istediginiz sayıyı giriniz");

        //çift tırnak ne yazdırırsak onu yazar

        double girilenSayı= scan.nextDouble();

        System.out.println(girilenSayı*girilenSayı);

        System.out.println("Girilen sayının karesi :"+girilenSayı*girilenSayı);




        }


    }
