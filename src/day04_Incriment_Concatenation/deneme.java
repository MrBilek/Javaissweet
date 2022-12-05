package day04_Incriment_Concatenation;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        //ogrenciden notunu rakam olarak alıp harf olarak yazdırın

        //0-49,999 DD
        //50-64,999 CC
        //65-84,999 BB
        //85-100 AA
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (0 <= not && not < 50) {
            System.out.println("Notunuz DD Maalesef kaldiniz");

        }
        if (50 <= not && not < 65) {
            System.out.println("Notunuz CC");

        }
        if (65 <= not && not < 85) {
            System.out.println("Notunuz BB");
        }

        if (85 <= not && not <= 100) {
            System.out.println("Notunuz AA");

        }

        System.out.println("*********************2.cozum*****************");

////ogrenciden notunu rakam olarak alıp harf olarak yazdırın
//
//        //0-49,999 DD
//        //50-64,999 CC
//        //65-84,999 BB
//        //85-100 AA

        Scanner Scanner = new Scanner(System.in);
        System.out.println("notunu gir dostum");

        double not2 = scan.nextDouble();

        if (not2 >= 0 && not2 < 50) {
            System.out.println("DD");
        }
        if (not2 >= 50 && not2 < 65) {
            System.out.println("cc");
        }
        if (not2 >= 65 && not2 < 85) {
            System.out.println("BB");
        }

        if (not2 >= 85 && not2 < 100) {
            System.out.println("AA");


        }

        System.out.println("***************yeni soru");




    }
}

