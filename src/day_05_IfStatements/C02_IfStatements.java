package day_05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /* Basit if cümleleri kodun geri kalanından bagımsızdır. Sadce 1 sarta odaklanır. o sart True ise İf body

        calısır. Sart false ise if body calısmaz (KOD CALISIR)

        birden fazla bagımsız if cümlesi kullanımıssa her cümle birbirinden bagımsız olacagından bazı degerler icin tüm
        if body leri calsırken bazı degerler icin hiv bir if body si CALISMAYABİLİR
         */

        //Kullanıcıdan bir sayı alıp
        //pozitif ise pozitif sayı,
        //100 ile 999 arasında ise (Sınırlar dahil) "pozitif 3 basamaklı sayı"
        // 3 ile bölünebiliyorsa "3'ün katı"
        // birler basamagı 7 ise "Mükemmel"
        //seceneklerinden uygun olanları yadırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int sayı = scan.nextInt();
        //pozitif ise pozitif sayı,

        if (sayı > 0) {
            System.out.println("Sayı pozitif");
            //100 ile 999 arasında ise (Sınırlar dahil) "pozitif 3 basamaklı sayı"
        }
        if (100 <= sayı && sayı <= 999) {

            System.out.println("pozitif 3 basamaklı sayı");
        }
        // 3 ile bölünebiliyorsa "3'ün katı"
        if (sayı % 3 == 0) {

        }
        System.out.println("3'ün katı");
        // birler basamagı 7 ise "Mükemmel"

        if (sayı % 10 ==7) {
            System.out.println("Mükemmel");
        }}}

    //NOT. DERSTEN SONRA HATALI OLAN KODU İNCELE TAMAMLA PLZ