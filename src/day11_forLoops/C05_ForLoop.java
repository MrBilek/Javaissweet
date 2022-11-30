package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen baslangic ve bitis degerleri icin 2 pozitif tam sayi giriniz");

        int baslangıc= scan.nextInt();
        int bitis= scan.nextInt();

        if (bitis < baslangıc){
            System.out.println("Baslangıc degeri bitis degerinden kücük olmalı");


        }else {
            int toplam = 0;


            for (int i = baslangıc; i <=bitis ; i++) {
                toplam+=1; // tüm sayıları sıraysıla toplama ekledik;

            }
            System.out.println( baslangıc +"ile"+ bitis + "arasındaki sayıların toplamı :" + toplam );

        }


    }
}
