package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {

        // Soru 4 kuuanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin
        // eger tum sartları saglarsa "1sifre basarıyla kaydedildi" yazdirin
        // - ilk hafr kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        // sifre kontrolunu bir method da yapip true/ false dondurun
        // main mathod da donen sonucu kontrol edip
        //"basari ile olusturuldu" yazincaya kadar
        // sifreyi tekrar isteyin

        Scanner scan = new Scanner(System.in);

        boolean tekrarSifreIste = true;

        String sifre = " ";

        while (tekrarSifreIste) {

            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();

          //  if (sifreKontrolEt(sifre)) { // sifre kontrolu true donerse sifre basarili demektir
                System.out.println("basari ile olusturuldu");
                //break;
                tekrarSifreIste = false; // break ya da bu kod yazilabilir


            // BU KISIMDA DIGER METHODLARDAN VERI GETIR

            }

        }


    }
