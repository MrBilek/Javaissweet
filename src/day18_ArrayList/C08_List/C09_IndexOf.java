package day18_ArrayList.C08_List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class C09_IndexOf {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        System.out.println(harfler); //[A, B, C]

        System.out.println(harfler.indexOf("B")); //1

        System.out.println(harfler.lastIndexOf("C")); //2
        harfler.add("B");
        System.out.println(harfler); //[A, B, C, B]

        System.out.println(harfler.indexOf("T")); //-1

        System.out.println(harfler.lastIndexOf("T"));// -1









    }
}
