package day09_stringManipulations;

public class C07_IlkTest {
    public static void main(String[] args) {

        //Gittigimiz web sayfasından aldıgımız
        //String arama sonuclarından
        //arama sayısının 50 den fazla oldugunu test edin

        String input="1-48 of 817 results for\"nutella\"";

        int indexOf= input.indexOf("of");
        int indexResults= input.indexOf("results");

        String sonucSayısıString=input.substring(indexOf+3, indexResults-1);

        //arama sayısının 50 den fazla oldugunu test edin

        int sonucSayısıInt= Integer.parseInt(sonucSayısıString);

        if (sonucSayısıInt>50){
            System.out.println("Nutella arama testi Passed");

        }else
            System.out.println("Nutella arama testi FAIL");




    }
}
