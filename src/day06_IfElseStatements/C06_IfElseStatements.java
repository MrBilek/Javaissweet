package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        // Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz\nK :Kadın, E:Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen tam sayı olarak yasınızı giriniz");

        int girilenYas= scan.nextInt();

        if (cinsiyet=='K' || cinsiyet=='k' && girilenYas>=60 ){
            System.out.println("Emekli olabilir :");

        } else if (cinsiyet=='K' || cinsiyet=='k' && girilenYas >=18) {
            System.out.println("Emekli olmak icin :"+ (60-girilenYas)+ "yıl daha calismalisin");
            
        } else if (cinsiyet=='E' || cinsiyet=='e' && girilenYas>=65) {
            System.out.println("Emekli olabilirsin dostum");

        } else if (cinsiyet=='E' || cinsiyet=='e' && girilenYas>=18) {
            System.out.println("Emekli olmak icin"+ (65-girilenYas)+ "yıl daha calismalisin");

        }else {
            System.out.println("gecersiz bilgi");

        }

    }
    }


