package day18_ArrayList;

import day16_arrays.C10_ArrayeElementEkleme;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayLists {
    public static void main(String[] args) {

        String[] arr= {"A","B","T"};
        // bu array'e element olarak C eklemek istersek

       arr= C10_ArrayeElementEkleme.arrayeElementEkleme(arr,"C");
        System.out.println(Arrays.toString(arr)); // [A, B, T, C]


        //ArrayList esnek uzunluktaki bir arraydir.
        //Ancak ArrayList, array altyapisini kullandigindan
        //elementleri sadece tek tek ekleyebiliriz

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        System.out.println(harfler);

        harfler.add(1,"C"); //1.index e C ekle demektir.
        System.out.println(harfler);

        List<String> letters= new ArrayList<>();

        letters.add("q");
        letters.add("z");

        harfler.addAll(letters);

        System.out.println(letters);

    }
}
