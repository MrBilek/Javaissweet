package day14_doWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        //kullanicidan isteedigi kadar sayi alin
        // kullanici deger olarak 0 a basarsa islemi bitirin


        int girilenSayi=10;
        int toplam= 0;
        Scanner scan= new Scanner(System.in);


        do{

            System.out.println("Lütfen toplanmak icin tam sayi giriniz");
            girilenSayi= scan.nextInt();
            toplam+= girilenSayi;


        }while (girilenSayi!=0);

        while (girilenSayi!=0);

        System.out.println("Girilen sayilarin toplami :"+ toplam);

        /* while loop da ilk sart saglanmazsa loop bpdy hic CALİSMAZ
        Do while loop da once body calistigi icin sart yanlis olsa bile loop bpdysi en az 1 kere calismis olur

         */



    }
}
