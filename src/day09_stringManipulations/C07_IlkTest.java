package day09_stringManipulations;

public class C07_IlkTest {
    public static void main(String[] args) {

        //Gittigimiz web sayfasından aldıgımız
        //String arama sonuclarından
        //arama sayısının 50 den fazla oldugunu test edin

        String input = "1-48 of 74 results for\"nutella\"";

         int indexOf= input.indexOf("of");
         int indexResult= input.indexOf("results");

         String sonucSayisiString=input.substring(indexOf+3,indexResult-1);

         int sonucSayisiInt= Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50){

            System.out.println("Nutella arama testi Passed");
        }else {

            System.out.println("failed");
        }



    }
}
