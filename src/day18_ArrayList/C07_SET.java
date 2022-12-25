package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_SET {
    public static void main(String[] args) {

        // Java da bir cok yapida get ve set methodlari bulunur.

        // get methodları bilgiyi bize getiriken
        // set methodlari bilgiyi update eder

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        System.out.println(harfler);

        //2.index e F elemanini ekleyin

        harfler.add(2,"F");
        System.out.println(harfler); //[A, B, F, C]

        harfler.set(2, "M");
        System.out.println(harfler); //[A, B, M, C]

        // set methodu var olan elementin degerini gunceller
        // eleman sayisini artirmaz


    }
}
