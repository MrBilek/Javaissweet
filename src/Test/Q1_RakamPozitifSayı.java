package Test;

import java.util.Scanner;

public class Q1_RakamPozitifSayı {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int girilenSayı = scan.nextInt();
        System.out.println("********************IF Cozumu*****************");

        if (girilenSayı >= 0) {

            if (girilenSayı < 10) {
                System.out.println("Girdiginiz sayı bir Rakamdır");

            } else {

                System.out.println("Girdiginiz sayı bir Pozitif Sayıdır");

            }
        } else {
            System.out.println("Girilen sayı bir Negatif Sayıdır");
        }

            System.out.println("********************Ternary Cozumu*****************");


           String result = (girilenSayı>=0)?((girilenSayı<10) ? "Rakam":"Pazitif Sayı"):("Negatif Sayı");

            System.out.println(result);





            }
        }
