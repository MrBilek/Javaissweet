package day05_IfStatements;

import java.util.Scanner;

public class C07_IfStatements_repetation {
    public static void main(String[] args) {
        //Ogrenciden notunu rakam olarak alıp harf olarak yazdırın
        // 0-49,999 DD
        //50-64,999 CC
        //65/84,999 BB
        //85/100    AA


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz ");

        double not = scan.nextDouble();

        // 0,1,2,3,4,....50. 51,52,..65,,,85....100

        if(0<= not && not <50) {
            System.out.println("Notunuz DD,Malesef kaldınız");
        }
        if(50 <=not && not<65 ) {
            System.out.println("Notunuz CC, Gectiniz");
        }

        if(65<= not && not<85){
            System.out.println("Notunuz BB, gectiniz");
        }

        if (85<= not&& not <=100)
            System.out.println("Notunuz AA, Congratulations");
        }



    }
