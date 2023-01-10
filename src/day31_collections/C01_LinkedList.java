package day31_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {


        /*
        Coolections objeleri bir arada tutan yapilardir.
        Gercek hayattaki ihtiyaclara gore Java farkli collection yapilari olusturmustur
        Bir uygulamada hangi collection'u kullanacagimiza istedigimiz ozelliklere gore
        karar veririz.

        Collections temelde 3 ana gruba ayrilir ve 3 interface ile kurallari belirlenmistir.

        -List
        -Queue
        -Set

        Ancak interfacelerden obje olusturulamayacagi icin child classlarinin constructor'lari kullanilir.
        Burada ozellikleri belirleyen Constructor degil DATA TURU olarak secilen collection'dur.

       Ornegin Linklist olusturulurken sececegimiz Data turu ile

       Queue, Deque, List veya tumunun ozelliklerini tasiyan LinkedList'ler olusturabiliriz.
         */

        LinkedList<String> l11= new LinkedList<>();
        List<String> l12= new LinkedList<>();
        Queue<String> l13= new LinkedList<>();
        Deque<String> l14= new LinkedList<>();


    }
}
