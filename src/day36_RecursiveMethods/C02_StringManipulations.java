package day36_RecursiveMethods;

public class C02_StringManipulations {
    public static void main(String[] args) {
        
        //verilen bir cumlede istenen kelimenin kac kere gectigini bulup yazdiran bir method
        
        String cumle= "Her guzel sey gibi bu da bitti. Aslinda tam da alısıyorduk gibi. Yeni yeni gibi isler.";
        
        String istenenKelime= " gibi";
        
        kullanimSayisiBul1(cumle,istenenKelime);
        
        
        
        
        
    }

    private static void kullanimSayisiBul1(String cumle, String istenenKelime) {

        int kullanimSayisi=0;
        int index=0;

      while (index<cumle.length()) {


          index = cumle.indexOf(istenenKelime, index);

          if (index == -1) {
              if (kullanimSayisi == 0) {
                  System.out.println("Cumlede aranan kelime yok ");
                  break;


              } else {
                  System.out.println("Kelime cumlede" + kullanimSayisi + "adet kullanilmistir");

              }


          }

      }
    }
}

