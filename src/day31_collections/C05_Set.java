package day31_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {
        // Set index yapisini desteklemez

        Set<String> ogrenciler = new TreeSet<>();

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Gurkan");

        System.out.println(ogrenciler); //[Ayten, Esra, Gurkan]

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); // [Ahmet, Ayten, Esra, Gurkan]

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler); // [Ahmet, Ayten, Esra, Furkan, Gurkan]

    }
}
