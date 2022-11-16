package day02_variables_scanner_repetation;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan 2 sayı alıp ikisinin degerlerini degistirin( swap)

        //kullanıcının girdigi degerler  sayı1=20 sayı10 ise

        // siz kod ile bunların degerini degistirin sayı1=10 sayı2=20 yapın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı1 i girin" );
        int sayı1 = scan.nextInt();
        System.out.println("Lütfen sayı 2 yi girin");
        int sayı2= scan.nextInt();

        int temp;

        // 1. adım sayı 2 degerini  temp e atayalım.

        temp= sayı2;

        // 2.adım sayı 1 degerini sayı 2 ye atayalım

        sayı2= sayı1;

        //temp teki degeri sayı 1 e atayalım

        sayı1= temp;

        System.out.println("sayıların yerini degistirdim"+
                "\nsayı1 in yeni degeri :"+sayı1+
                "\nsayı2 nin yeni degeri"+sayı2 );



    }
}
