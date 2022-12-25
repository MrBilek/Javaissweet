package day18_ArrayList.C08_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_Soru {
    public static void main(String[] args) {

        // Verilen pozitif bir n tam sayisini alarak,

        // bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
fibonacciListesiOlustur();

    }


    public static List<Integer> fibonacciListesiOlustur() {
        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kac tane fibonacci sayisi istediginizi giriniz");

        int n = scan.nextInt();

        //0,1,1,2,3,5,8,13,21,34,55.........

        if (n < 1) {
            System.out.println("Gecersiz sayi");
            return null;

        } else if (n == 1) {
            fibonacciList.add(0);
            return fibonacciList;


        } else if (n == 2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;


        } else { //n>2
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3 = 1;

            fibonacciList.add(sayi1);
            fibonacciList.add(sayi2);


            do {
                fibonacciList.add(sayi3);
                sayi1 = sayi2;
                sayi2 = sayi3;
                sayi3 = sayi1 + sayi2;

            }while (sayi3<n);


            return fibonacciList;
        }

    }
}