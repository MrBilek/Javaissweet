package day03_dataCasting_Matematikselişlemler;

import java.sql.SQLOutput;

public class C05_WrapperClass {

    public static void main(String[] args) {

        int sayı=10;
        String str= "Java Candır";

        /* int primitive old. hazır metodları yoktur
        string ise non primitive old için hazır metodlara sahiptir.

        int, char, boolean gibi primitive türlerinde hazır metod kullanmak için

        Java integer, Character, Boolean gibi wrapper class lar oluşturmuştur.

        bunlar primitive lerle aynı değerleri alabilir ama ekstradan metodları da vardır
         */

        Integer sayı2=20;

        // işlemlerimizi yaparken bazen string olarak tanımlanmış ancak bazen matematiksel işlem barındıran variable lar
        //ile karşılaşabiliriz
        //Vbu durumda bu tür string variable ları sayıya cevırmek igtiyacımız olabilir.

        /* Eger sayıya cevirmek istediğimiz metinlerde
        harf veya sayı olmayan baska karakter varsa Java hata verir.
         */

        String str2="123";
        String str3= "354";
        // string olarak yazarsak yan yana yazardı.

        System.out.println(str2+str3);  //123354
        int str2ınt= Integer.parseInt(str2);

        int str3ınt= Integer.parseInt(str3);

        System.out.println(str2ınt+str3ınt);

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        System.out.println(Short.MAX_VALUE); //32767

        // derste tekrar sırasında yapacağım

        short sayı3= 4;
        int sayı5= sayı3;

        // whrapper class larda casting olmaz örnek:

        Short sayı6=45;
        //Integer sayı7= sayı6;






















    }
}
