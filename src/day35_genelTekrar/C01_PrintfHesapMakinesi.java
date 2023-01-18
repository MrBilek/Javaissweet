package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfHesapMakinesi {
    public static void main(String[] args) {

        //kullanicidan bri sayi ve bir rakam alin ve carpim tablosu olusturun

        Scanner scan = new Scanner(System.in);

        System.out.println("Carpim tablosu olusturmak icin bir rakam giriniz");

        int girilenSayi = 0;

        while (girilenSayi < 2 || girilenSayi > 9) {
            try {
                System.out.println("Carpim tablosu olusturmak icin bir rakam giriniz");

                girilenSayi = scan.nextInt();

                if (girilenSayi < 1 && girilenSayi < 10) {
                    break;
                }
                System.out.println("Carpim tablosu icin 1'den buyuk pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) {
                System.out.println("Carpim tablosu icin 1'den buyuk pozitif bir rakam girmelisiniz");
                scan.next();

            }
        }

        for (int i = 1; i <= girilenSayi; i++) {

            for (int j = 1; j < girilenSayi; j++) {
                int carpim = i * j;

                System.out.printf("5%d ", carpim);

            }
            System.out.println(" ");
        }


    }


}

