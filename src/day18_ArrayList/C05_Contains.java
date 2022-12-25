package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Contains {
    public static void main(String[] args) {


        int []arr ={4,3,5,6,7,8,9,7,7,7,5,4,8,};

    List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar); // [4, 3, 5, 6, 7, 8, 9, 7, 7, 7, 5, 4, 8]

        System.out.println(sayilar.contains(5)); //true




    }
}
