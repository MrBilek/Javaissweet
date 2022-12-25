package day18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {

    public static void main(String[] args) {
        // Verilen bir arraydeki tekrar eden elementleri silip
        // array i unique degerlerden olusan bir array haline getirin


        int []arr= {4,3,6,7,3,5,7,3,4,6,4,7,7,7,5,2};

        List<Integer>UniqueElementList= new ArrayList<>();

        // arraydeki tum elementleri alıp,
        // listede var mi diye kontrol edelim
        // ve olmayanlari ekleyelim


        for (int i = 0; i < arr.length; i++) {

            if (!UniqueElementList.contains(arr[i])) {
                UniqueElementList.add(arr[i]);

            }

          }
        System.out.println(UniqueElementList); //[4, 3, 6, 7, 5, 2]

        //soruda bu degerleri arr ye atamamiz isteniyor

        arr=new int[UniqueElementList.size()]; //  [0,0,0,0,0]

        for (int i = 0; i < arr.length; i++) {

            arr[i] = UniqueElementList.get(i);


        }
        System.out.println("Array in son hali:"+ Arrays.toString(arr) );//Array in son hali:[4, 3, 6, 7, 5, 2]

      }



    }

