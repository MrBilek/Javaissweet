package day10_stringManipulations;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java ögren, adana ye :)";

        System.out.println(str.replace('a', 'A'));//

        System.out.println(str.replace(" ", ""));

        String telefon= "555 3255698";

        //System.out.println(telefon.replace("5", '7'));

        //  dersten sonra bak

        //asagıdaki arama sonucunun 10000den fazla oldugunu test edın

       String sonuc= "1-16 of over 100,000 results for \" apple\"";

        int indexOver= sonuc.indexOf("over");
        int indexResults= sonuc.indexOf("results");

        String sonucSayısıStr= sonuc.substring(indexOver+5, indexResults-1);
        System.out.println(sonucSayısıStr); //100000

        sonucSayısıStr=sonucSayısıStr.replace(",", "");
        System.out.println(sonucSayısıStr);//100000

        int sonucSayısıStrInt= Integer.parseInt(sonucSayısıStr);

       // if (sonucSayısıStrInt) {
            System.out.println("arama sonuc testi Passed");

        }
        //else System.out.println("arama sonuc testi Faıled");
 // son kısa tekrar bakçççç








    }

