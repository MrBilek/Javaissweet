package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapma {
    public static void main(String[] args) {

        int []arr= {2,3,4,6,3,4,6,1,8,5,4};

        /*
        Verilen bir Array i list e cevirmek icin 2 yontem vardır

        1- bir loop ile tüm elementleri List e kopyalamak.***

        2 asList() kullanmayı tavsiye etmiyoruz.
        cünkü 2 buyuk dezavantajı var.
        as list ile olusturulan list array de.....


         */

        List< Integer> list1= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            list1.add(arr[i]);

        }
        System.out.println("loop ile tasinan list: "+list1);


        //List<Integer> list2= Arrays.asList(arr);
        //System.out.println("as List ile olusturulan List: "+ list2);


    }
}
