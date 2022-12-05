package day03_dataCasting_Matematikselişlemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5);

        // java bir bölme işleminde 2 int işleme giriyorsa sonucu int olarak verir


        int sayı1= 25;
        int sayı2=6;

        System.out.println(sayı1/sayı2);

        double dbl=6;
        System.out.println(sayı1/dbl);

        // kullanicidan 2 tamsayi alin
     // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birbirine bölmek için iki tamsayı girin");

        int ilksayı= scan.nextInt();
        int ikincisayı= scan.nextInt();
        System.out.println("iki sayının bölme sonucu:" +ilksayı/ikincisayı);





    }
}
