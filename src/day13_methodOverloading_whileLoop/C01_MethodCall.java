package day13_methodOverloading_whileLoop;

import day12_methodCreation.C03_AsalSayi;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C08_Palindrome;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        //ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);

        // asagıda verilen cümleyi tersine cevirin

        String str= "Bir kere yaparim, yan gelir yatarim";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);

    // asagida verilen cümlenin palindrom olup olmadigini yazdirin

        str= "Java Candir";

        tersStr= C07_TerseCevirme.metniTerseCevir(str);// ridnaC avaJ

        if (str.equals(tersStr)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Palindrom degil");
        }

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin

        int sayi= 23;

        System.out.println(C03_AsalSayi.asalSayiMi(sayi));//true

        // kullanici true/ false dan birsey anlamaz acik sekilde yazalim dersek

        boolean sonuc= C03_AsalSayi.asalSayiMi(sayi); // true

        if (sonuc) {
            System.out.println("Girilen "+ sayi+ " asal.");
        }else {
            System.out.println("Girilen "+ sayi+" asal degil.");
        }


    }
}
