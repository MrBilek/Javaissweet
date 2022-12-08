package day16_arrays;

import java.util.Arrays;

public class C13_BinarySearch {
    public static void main(String[] args) {

        // binary tree javanin kullandigi ozel bir siralama yontemidir
        // binary tree methodu binaryTree ozelligini kullandıgından
        // sirali olmayan array lerde dogru sonuc dondurmeyebilir
        // eger binary search ()kullanilacaksa
        //oncesinde MUTLAKA sort()kullanilmalidir

        int[]arr= {2,6,9,3,15,1,7};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 7));//2


    }
}
