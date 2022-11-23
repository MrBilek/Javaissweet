package day08_StringManipulation;

import java.util.Random;

public class C06_Length {
    public static void main(String[] args) {

        String str= "Java her gecen gun daha da guzellesiyor";

            //sondan 3.karakteri yazdırın

        System.out.println(str.charAt(str.length()-3));// y

        System.out.println(str.length()); //39

        //Rastgele bir karakterini yazdıralım

        Random rnd= new Random(); // rnd degeri icin 0 ile 1 arasında rastgele bir deger olusturur
        int index= rnd.nextInt(str.length()); // str.lenth den kucuk rastgele bir int uretir

        System.out.println(str.charAt(index));






    }
}
