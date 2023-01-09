package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {


        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        //tum elemenetleri index kullanmadan 3 artirin

        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi=(Integer) lit.next();

            lit.set(sayi+3);

        }
        System.out.println(sayilar); // [8, 26, 5, 12, 14]

        //Listedeki tum literator kullanarak sondan basa dogru yazdirin.

        //bir ustteki loop ile sona gittigimiz icin iterator suan en sonda.
        // yani olmasini istedigimiz yerde

        while (lit.hasPrevious());

        System.out.println(lit.previous()+" "); // bu kısma bir daha bak eksik var

    }
}
