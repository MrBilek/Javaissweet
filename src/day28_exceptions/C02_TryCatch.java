package day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /* try catch bloklarinin amaci riski 0 yapmak degil
        Kodun iyi analiz yapip
        Java'nin cozemeyecegi durumlarda ne yapmasini istedigimizi
        kendisine soylemektir.

        Java try blogunda bas edemeyecegi bir sounla karsılasirsa
        siz o sorunu deklare edinceye kadar
        yani catch ()satirina kadar
        calismayi durdurur.

        Bu durumda sorun olan satir ile catch satiri arasindaki kodlar calismaz.

         */




        //Kullanicidan iki tam sayi alip,
        // sayilari birbirine bolup,sonucu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("birbirine bolmek icin 2 tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        //1- try bolumu

        try {
            System.out.println("İki sayinin bolumu: "+sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {

        System.out.println( "bolen sayi 0 olamaz");
        e.printStackTrace();


        }


    }
}
