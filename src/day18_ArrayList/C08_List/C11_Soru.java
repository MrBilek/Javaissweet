package day18_ArrayList.C08_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Soru {
    public static void main(String[] args) {
        // Verilen String bir listede istenmeyen harf iceren elementleri
        // kalan kismini list olarak bize donduren bir method olusturun


        List<String> isimler = C10_Soru.isimListesiOlustur();
        System.out.println("İstenmeyen harfin oldgu isimler silindi \n kalan isimler :"+ istenmeyenIsimleriSil(isimler));

    }

    public static List<String>istenmeyenIsimleriSil(List<String>isimler){

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iceren isimleri silmek icin bir harf giriniz");

        String istenmeyenHarf= scan.next().substring(0,1);

        List<String>yeniListe= new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {

           if ( isimler.get(i).contains(istenmeyenHarf)){
               yeniListe.add(isimler.get(i));
           }

        }
return yeniListe;

    }



}
