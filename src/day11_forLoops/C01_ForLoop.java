package day11_forLoops;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {

        //kullancıdan bir char alıp
        //o karakterden sonra gelen 10 karakteri alın

        Scanner scan= new Scanner(System.in);

        System.out.println("Kullanicidan bir karakter alin");

        char karakter= scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {

            System.out.print((char)(karakter+i)+" " );

        }




    }
    }


