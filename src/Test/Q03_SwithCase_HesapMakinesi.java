package Test;

import java.util.Scanner;

public class Q03_SwithCase_HesapMakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         *
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematiksel isleme sokmak icin 2 tane tam sayı giriniz");

        int x, y = scan.nextInt();
        // 2 sayıyı aynı satırda alabiliyoruz

        System.out.println("İslem türünü seciniz:\n1\t1 : Toplama\n2\t2 : Cıkarma\n3\t3: Carpma\n4\t4 : Bolme");
        // \n= alt satıra gecme komutu


        /*int islem = scan.nextInt();

        if (islem == 1) System.out.println(x + y);
        else if (islem == 2) System.out.println(x - y);
        else if (islem == 3) System.out.println(x * y);
        else if (islem == 4) System.out.println(x / y);

        if (y == 0) System.out.println("O a bolum tanımsızdır");
        else System.out.println(x / y);

    //}
     //else
       //  System.out.println("Yanlıs giris yaptınız, Lütfen tekrar deneyiniz");
        /*  DERSTEN SONRA INCELEEE/*
        }



         */


      /*  System.out.println("****************Switch Case**********");
        int islem = scan.nextInt();

        switch (islem) {

            case 1:
                System.out.println(x + " + " + y + " " + (x + y));
                break;

            case 2:
                System.out.println(x + " + " + y + " " + (x + y));
                break;

            case 3:
                System.out.println(x + " + " + y + " " + (x + y));
                break;

            case 4:
                System.out.println(x + " + " + y + " " + (x + y));
                break;

            System.out.println("****************Switch Case Cozum 2**********");

            System.out.println("İslem türünü seciniz:\n1\t+ : Toplama\n2\t- : Cıkarma\n3\t*: Carpma\n4\t/ : Bolme");

            //case 1: System.out.println(x + " + " + y + " " + (x + y));break;

            case 2:
                //System.out.println(x + " + " + y + " " + (x + y));
                break;

            case 3:
              //  System.out.println(x + " + " + y + " " + (x + y));
                break;

            //case 4: System.out.println(x + " + " + y + " " + (x + y));
                break;


        }


       */

    }
}


