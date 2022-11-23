package day07_ternary_switchstatements;

public class C07_NestedtERNARY {
    public static void main(String[] args) {
/*Kullanicidan bir tamsayi alin.
 Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
 Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
/*
 */

        int sayı=23;


        //System.out.println(sayı>0 ? "sayı pozitif" : "sayı pozitif degil");

        System.out.println(sayı>0
                ?
                sayı%2==0 ?"cift sayı" : "tek sayı"
                :
                -100>=sayı && sayı>=-999 ? "3 basamaklı": "#basamaklı degil"
                );

    }

    }
