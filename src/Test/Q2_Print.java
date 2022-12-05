package Test;

import java.util.Scanner;

public class Q2_Print {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz");

        char girilenHarf= scan.next().charAt(0);

    if (girilenHarf>= 'A'&& girilenHarf <= 'Z'){

        System.out.println("Girilen Harf Büyük Harf");

    }else{
        System.out.println("Girilen harf büyük degil");

    }


    }
    {


    }
}