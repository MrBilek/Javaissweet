package day09_stringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        // kullnıcıdan aldıgımız cumle "cok ile baslayan 2 kelime yazdırın
        //cümlede cok kelimesi gecmiyorsa "cümlede cok ile baslayan kelime yok" yazdırın


        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cümle giriniz");
        String girilenCumle = scan.nextLine();

        //Sınaclarımızdan coktan secmeli sorular kullanıyoruz
        // Javayı cok seviyoruz
        // bu kadar coklu secenek olur mu

        if (!girilenCumle.contains("cok")) {
            System.out.println("cümlede cok ile baslayan kelime yok");


        } else {

            int cokİndexi = girilenCumle.indexOf("cok");

            int boslukİndexi= girilenCumle.indexOf(" ",cokİndexi+1);

            System.out.println(girilenCumle.substring(cokİndexi, boslukİndexi));

        }
    }
}
