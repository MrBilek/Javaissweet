package day12_methodCreation;

public class C01_Method {
    public static void main(String[] args) {
        //methodlar bazen cok nasit islemleri bazen de kompleks islemleri yapabilir
        //biz o islemleri nasıl yapabiliriz diye düsünmek yerine hazır methodu kullanmayı tercih ederiz
        //bizden sonra kodu inceleyecek kisiler de hazır metod isimlerinden ne yapmak istedigimizi
        //kolayca anlayabilirler. Ayrıca kodu her yazdıgımızda yapabilecegimiz muhtemel hatalardan
        //kurtulmus oluruz.


        String str= "Java da yolu yariladik";

        str.isEmpty(); //boolean sonuc döndü ama kullanmadik
        // methdum döndürdügü sonucu kullanmak isterseniz
        // ya yazdirirsiniz

        System.out.println(str.isBlank()); //false

        // ya da dönen sonucu ilerde kullanacaksak atama yapabiliriz



    }
}
