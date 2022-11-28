package day03_dataCasting_Matematikselişlemler;

import java.util.Scanner;

public class modulus_repetation {
    public static void main(String[] args) {

Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz");

        int girilenSayi= scan.nextInt();//2457

        int BirlerBasamagi=0;
        int rakamlarToplami=0;

  BirlerBasamagi= girilenSayi%10;
  rakamlarToplami=rakamlarToplami+BirlerBasamagi;

  girilenSayi=girilenSayi/10;

BirlerBasamagi=girilenSayi%10;
rakamlarToplami=rakamlarToplami+BirlerBasamagi;

girilenSayi=girilenSayi/10;

BirlerBasamagi=girilenSayi%10;
rakamlarToplami= rakamlarToplami+BirlerBasamagi;

girilenSayi=girilenSayi/10;


BirlerBasamagi= girilenSayi%10;
rakamlarToplami=rakamlarToplami+BirlerBasamagi;
girilenSayi=girilenSayi/10;


        System.out.println("girilen sayinin rakamlar toplami:  "+rakamlarToplami);








    }
}
