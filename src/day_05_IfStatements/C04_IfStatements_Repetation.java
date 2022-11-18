package day_05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements_Repetation {
    public static void main(String[] args) {

                /*Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa
       “Bes ile bolunebilen sayi” yazdirin./*

                 */

       Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int girilensayı= scan.nextInt();

        if (girilensayı%3==0)
        System.out.println("üC İLE BÖLÜNEBİLEN SAYI");

        if (girilensayı%5==0)
        System.out.println("bes ile bölünebilen sayı");



    }
}




