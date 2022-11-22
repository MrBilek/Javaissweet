package day07_ternary_switchstatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı alın
        //sayı rakam ise"girilen sayı rakam"
        //sayı 2 basamaklı ise "girilen sayı 2 basamaklı"
        //sayı 2 basamaktan büyükse büyük sayı yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");
        int girilenSayı = scanner.nextInt();

        if (0 <= girilenSayı && girilenSayı <= 9) System.out.println("Girilen sayı rakam");
        else if (10 <= girilenSayı && girilenSayı <= 99) System.out.println("Girilen sayı 2 basamaklı");

        else if (girilenSayı >= 100) System.out.println("Büyük Sayı");


    }

    }

