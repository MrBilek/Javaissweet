package day17_Arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {

    public static void main(String[] args) {


        int[][] arr= {{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length);//5
        System.out.println(arr[2].length); //4

        System.out.println(arr[2][1]); //7


        //21.satirdaki 2 elementini yazdirmak istersek

        System.out.println(arr[3][0]); //2


        System.out.println(Arrays.deepToString(arr)); //[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]

    }

}
