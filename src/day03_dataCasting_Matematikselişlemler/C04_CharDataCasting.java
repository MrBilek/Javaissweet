package day03_dataCasting_Matematikselişlemler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        /* char data türü'nin ekstra bir özellği vardır
        eger matematiksel bir işlemde char data türünden bir değer kullanırsanız

        Java o char ın ascii değerini (uluslar arası matematiksel tablo) işlem olarak gerçekleştirir

         */
        System.out.println('a'+'b'); // 97+98=195

        System.out.println('a'-32);// 97-32=65

        System.out.println((char) ('a'-32)); //A

        // kullanıcıdan bir char alıp
        // ascii table dan kullanıcının girdiği char ın sonrasındaki
        // 3 karakteri yazdırın
        // örnek input : a output : b,c,d

    Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char girilenKarakter=scan.next().charAt(0);

        System.out.println((char)(girilenKarakter+1) +", "+
                          (char)(girilenKarakter+2) + " ,"+
                          (char)(girilenKarakter+3));









    }
}
