package day08_StringManipulation;

import java.sql.SQLOutput;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java ögren, isi kap";

        System.out.println(str.length()); //karakter sayısı 19

        //metnin tam ortasındaki karakter nedir?

        System.out.println(str.charAt(str.length()/2)); //n

        //son karakteri yazdırın

        System.out.println(str.charAt(str.length()-1));//p

        //bir karakteri degil de verilen String in icerdigi bir metin parcasını elde etmek istersek

        //örnegin "ogren" kelimesini yazdıralım

        System.out.println(str.substring(5, 9));// ogre
        // substring (bas,bitis) metodundan
        //baslangıc olarak yazılan index dahil (inclusive)
        // bitis olarak yazılan index haric (exclusive) dir.
        System.out.println(str.substring(5, 10)); //ogren

                // str dan "java" kelimesini yazdıralım

        System.out.println(str.substring(0,4)); // java

        //kap yazdıralım

        System.out.println(str.substring(16,19)); //kap

        System.out.println(str.substring(16));// kap
        System.out.println(str.substring(str.length()-3));//kap

        //substring kullanarak sadece J harfini yazdırın

        System.out.println(str.substring(0,1));

        //substring kullanarak 9.indexdeki harfi buyuk olarak yazdırınız

        System.out.println(str.substring(9,10)); //n

        //charAt() kullanmak yerine substring kullanmak daha avantajlı olabilir cunku substring kullanınca ifade hala
        //string oldugundan metod kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));//hiclik yazdırır yani konsolda bos satır olusturur

        System.out.println("======");
        //System.out.println(str.substring(4,3));//at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)

        //System.out.println(str.substring(25,28));//at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
        System.out.println(str.substring(str.length()));//hiclik yazdırır
        System.out.println("======");


    }
}
