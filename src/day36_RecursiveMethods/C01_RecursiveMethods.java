package day36_RecursiveMethods;

import java.util.Scanner;

public class C01_RecursiveMethods {
    public static void main(String[] args) {


        //kullanicidan pozitif bir tam sayi alip,
        // o sayidan 0 a kadar olan poztifi tam sayilari toplayalim


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();


        toplaForLoop(sayi);
        toplaRecursive(sayi);


    }

    private static void toplaRecursive(int sayi) {

        if (sayi>0){

        }



        }









    private static void toplaForLoop(int sayi) {

        int toplam=0;
        for (int i = 0; i <=sayi; i++) {
            toplam+=i;

        }
        System.out.println("Toplam forloop ile topla: "+toplam);
    }
}
