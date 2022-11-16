package day02_variables_scanner_repetation;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp dikdörtgenin alanını yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin 2 kenar uzunlugunu girin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin alanı :"+ kenar2*kenar1);







    }
}
