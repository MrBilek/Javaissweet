package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {


        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        harfler.remove("B"); // B yi bulup siler ve gorevi tamamladigi icin true doner.

        System.out.println(harfler); //[A, C]

        System.out.println(harfler.remove(0));// A
        // 0 inci indexteki elementi siler ve gorevi tamamlayip silinen
        // elementi bize dondurur
        System.out.println(harfler); //[C]


        List<String> yeniList= new ArrayList<>();
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler)); // true
        // harfler Listesindeki tum elementleri siler
        // gorevi tamamlarsa true yoksa false doner.

        System.out.println(yeniList);// [D, T]

    }
}
