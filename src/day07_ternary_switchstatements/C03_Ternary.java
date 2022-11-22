package day07_ternary_switchstatements;

public class C03_Ternary {
    public static void main(String[] args) {

        //input olarak verilen sayıyı kontrol edip
        //sayı çift ise "çift sayı"
        //degilse "tek sayı" yazdırın

        int input = 33;

        //if else ile yapalım

        if (input % 2 == 0) {
            System.out.println("Çift sayı yazdır");

        } else {
            System.out.println("tek sayı yazdır");

            // ternary ile yapalım

            System.out.println(input % 2 == 0 ? "cift Sayı " : "tek sayı");

        }
    }}

