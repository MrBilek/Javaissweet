package day08_StringManipulation;

public class c03_equals {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Java";

        //String str3= new String( original: "Java");

        String str4= "Ja";

      // String str5= str4.concat(:str "va");

        System.out.println(str1==str2); //true    NOTT 9 VE 13 E BAKMAYI UNUTMA

        /*
        ==string icin bekledıgımız sonucları vermeyebilir
        cünkü hem metnin degerini hem de objeniin referansınız karsılastırır
        bunu ileride anlatıcak hocamız
        Java da String objelerinin metinlerinin aynı olup olmadıgını kontrol etmek icin == yerine equal metodu
        kullanılmalıdır

         */
        System.out.println(str1.equals((str2)));//true
        //System.out.println(str1.equals((str3)));//true
        //System.out.println(str1.equals((str5)));//true
    }
}
