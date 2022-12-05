package day06_IfElseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        // Yil daha calisman gerekir” yazdirin.

        /*Eger degisken sayımız birden fazla ise,
        degiskenlerden birini öncelige alarak
        ona göre bir if else yapısı kurulur
            örnegin bu soruda kadın/erkek secimini ana degisken yapalım*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\n K=Kadin, E:Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen yasınızı tam sayı olarak giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'K' || cinsiyet == 'k') { //Kadın olanlar için bu bölüm  calısacak
            if (yas<18 || yas>80) System.out.println("Gecersiz yas");
            else if (yas >= 60) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin"+(60-yas)+"yıl daha calısmalısın");

            {

            }

        } else if (cinsiyet == 'E' || cinsiyet == 'e'){ //Erkek olanlar icin bu bölüm calısacak
            if (yas<18 || yas>80) System.out.println("Gecersiz yas");
            else if (yas >= 60) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin"+(65-yas)+"yıl daha calısmalısın");

        }else {
            System.out.println("Cinsiyet bilgisi hatalı");
        }
    }
}

