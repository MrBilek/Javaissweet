package day07_ternary_switchstatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
      /* kullanıcıdan bir tam sayı alın
      sayı negatif ise "negatif sayı"
      sayı rakam ise "girilen sayı rakam"
      sayı 2 basamaklı ise "girilen sayı 2 basamaklı"
      sayı 2 basamaktan büyükse "büyük sayı" yazdırın
       */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int girilenSayı= scan.nextInt();

        if (girilenSayı <0) System.out.println("Negatif Sayı");
        else if (girilenSayı<=9) System.out.println("Girilen sayı rakam");
        else if (girilenSayı<=99) System.out.println("Girilen sayı 2 basamaklı");
        else System.out.println("Büyük sayı");
        }
    }


