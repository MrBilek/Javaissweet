package day21_staticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        int[]arr= {3,6,8};
        // bir method olusturun methodda array e 5 elementli bir array atayin
        // ve yazdirin
        // main methoda dondukten sonra yine array i yazdirin
        arrayiDegistir(arr);
        System.out.println(Arrays.toString(arr)); //[3, 6, 8]

    }

    public static void arrayiDegistir(int[]b){

        b= new int[5];

        System.out.println(Arrays.toString(b)); //[0, 0, 0, 0, 0


    }

}
