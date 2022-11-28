package day02_variables_scanner;

import java.util.Scanner;

public class C03_Repetatıon2 {
    public static void main(String[] args) {

        System.out.println('a' + 'b');

        System.out.println('a' - 32);

        Scanner scan = new Scanner(System.in);

        System.out.println((char) ('a' - 32));


        Scanner scan1 = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenKarakter = scan.next().charAt(0);

        System.out.println((char) (girilenKarakter + 1) + "," +
                (char) (girilenKarakter + 2) + "," +
                (char) (girilenKarakter + 3) + ",");





    String str2 = "123";
    String str3 = "456";

    int str2Int = Integer.parseInt(str2);
    int str3Int = Integer.parseInt(str3);

        System.out.println(str2Int+str3Int);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

}
