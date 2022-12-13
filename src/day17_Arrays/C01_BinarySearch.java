package day17_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {

        int[]arr= {2,8,4,1,9,3,6};

        Arrays.binarySearch(arr,9);//-5

Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 6, 8, 9]

        System.out.println(Arrays.binarySearch(arr, 8)); //5


        // Olmayan bie element aradigimizda ne olur

        System.out.println(Arrays.binarySearch(arr, 0)); //-1
        System.out.println(Arrays.binarySearch(arr, 18)); // -8


        /*olmayan bir elemnti binarySearch ile aratırsaniz
        once Listede olsaydı, kacinci sirada olurdu sorusunun cevabını bulur
        olmadigini belirtmek icin basina - koyar

         */




    }
}
