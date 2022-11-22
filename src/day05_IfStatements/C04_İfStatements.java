package day05_IfStatements;

import java.util.Scanner;

public class C04_İfStatements {
    public static void main(String[] args) {

        // İf cümlelerinde sart parantezinden sonra body kullanmazsak
        //ilk ; e kadar olan kısmı body olarak kabul eder
        //yani sadece 1 satır kodu body olarak kabul eder

        /*Eger if bodysi için yazılacak kod 1 satırdan fazla ise Mutlaka {} kullanılmalıdır.

        /*Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa
       “Bes ile bolunebilen sayi” yazdirin.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int girilensayı= scan.nextInt();

        if (girilensayı%3==0) System.out.println("Uc ile bolunebilen sayi");

        if (girilensayı%5==0) System.out.println("Bes ile bolunebilen sayi");

    }
}
