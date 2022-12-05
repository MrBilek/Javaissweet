package day02_variables_scanner_repetation;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan bir double bir de integer sayı alıp bunların toplamını ve carpımını () -> yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir ondalıklı sayı girin ");
        double sayıDbl= scan.nextDouble();

        System.out.println("Lütfen bir tam sayı girin");
        int sayıint= scan.nextInt();

        System.out.println("Sayıların toplamı :" +(sayıDbl+sayıint));
        System.out.println("Sayıların carpımı :"+ sayıDbl*sayıint);




    }
}
