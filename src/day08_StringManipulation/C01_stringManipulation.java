package day08_StringManipulation;

import java.util.Scanner;

public class C01_stringManipulation {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");

        String girilenGün= scan.next();
        String kullanılacakGün=girilenGün.toLowerCase();


        /*String ifadeler case sensitivedir. Kullanıcının PazaR,pazaR,PAZAR...gibi 32 farklı sekilde yazma ihtimali var


         */
    switch (kullanılacakGün){
        case "pazartesi":
            System.out.println(girilenGün+ " Calısma zamanı, tatile 5 gün var");
            break;
        case "salı":
            System.out.println(girilenGün+ " Calısma zamanı, tatile 4 gün var");
            break;
        case "carsamba":
            System.out.println(girilenGün+ " Calısma zamanı, tatile 3 gün var");
            break;

        case "persembe":
            System.out.println(girilenGün+ " Calısma zamanı, tatile 2 gün var");
            break;

        case "cuma":
            System.out.println(girilenGün+ " Calısma zamanı, tatile 1 gün var");
            break;

        case "cumartesi":
        case "pazar" :
            System.out.println(" simdi dinlenme zamanı");
            break;

        default:
            System.out.println(" Gecersiz gün");




    }




    }
}
