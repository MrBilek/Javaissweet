package day_05_IfStatements;

import java.util.Scanner;

public class C08_IfStatements_Repetations {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alıp
        //pozitif ise pozitif sayı,
        //100 ile 999 arasında ise (Sınırlar dahil) "pozitif 3 basamaklı sayı"
        // 3 ile bölünebiliyorsa "3'ün katı"
        // birler basamagı 7 ise "Mükemmel"
        //seceneklerinden uygun olanları yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");

        int sayı = scan.nextInt();

        if (0 < sayı) {
            System.out.println("Pozitif Sayı");
        }
        if (100 <= sayı && sayı <= 999) {
            System.out.println("Pozitif 3 basamaklı sayı");
        }
        if (sayı % 3 == 0) {
            System.out.println("3'ün katı");
        }
        if (sayı % 10 == 7) {
            System.out.println("Mükemmel");
        }
    }
}