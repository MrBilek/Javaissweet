package day11_forLoops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen bir Stringde
        //index i tek sayı olanları kücük harfle
        //index i cift sayı olanları büyük harfle yazdırınız
        //ornek: Java output: JaVa

        String input= "Java candir, Selenium heyecandir";

        for (int i = 0; i <input.length() ; i++) {

            System.out.print (i%2==0);
            /*                    ? input.substring(i,i+1).toUpperCase()//index cift ise
                                : input.substring(i,i+1).toLowerCase()//cift degilse
                                );


             */

        }
    }
}





