package day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {

        //verilen bir Array i natural Order a gore siralayip yazdirin


        String []isimler= {"Huseyin", "Yusuf","Mehmet","Akile", "Said", "ahmet","adnan"};

        System.out.println(Arrays.toString(isimler));


        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        System.out.println(Arrays.toString(isimler));// kücük hafrler en sonda yazilir ASCII tablosuna gore

     // Eger buyukten kucuge siralamak istersek , once sort kullanarak Natural Order a gore siralar
        // sonra gecici bir array kullanarak siralamayi terse ceviririz





    }
}
