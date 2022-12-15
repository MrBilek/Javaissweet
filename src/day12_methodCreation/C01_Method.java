package day12_methodCreation;

import day11_forLoops.C11_NestedLoop;
import day11_forLoops.C12_MethodCreation;
import day16_arrays.C10_ArrayeElementEkleme;

public class C01_Method {
    public static void main(String[] args) {
        //methodlar bazen cok basit islemleri bazen de kompleks islemleri yapabilir
        //biz o islemleri nasıl yapabiliriz diye düsünmek yerine hazır methodu kullanmayı tercih ederiz
        //bizden sonra kodu inceleyecek kisiler de hazır metod isimlerinden ne yapmak istedigimizi
        //kolayca anlayabilirler. Ayrıca kodu her yazdıgımızda yapabilecegimiz muhtemel hatalardan
        //kurtulmus oluruz.


        String str= "Java da yolu yariladik";

        str.isEmpty(); //boolean sonuc döndü ama kullanmadik
        // methodun döndürdügü sonucu kullanmak isterseniz
        // ya yazdirirsiniz

        System.out.println(str.isBlank()); //false

        // ya da dönen sonucu ilerde kullanacaksak atama yapabilir

    String buyukHarfliHali=str.toUpperCase();




    }
}
