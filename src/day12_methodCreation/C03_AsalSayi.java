package day12_methodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {

        //verien bir sayının asal olup olmadıgını true/ false olarak döndüren bir method olusturun

        // asal sayiMi metodu boolean bir sonuc döndürdügünden bu methodu calistirdigimizda ya direk yazdirmaliyiz
        System.out.println(asalSayiMi(34));// false

        //ya da method call u getirecegi icin bir variable olusturabilirim

        boolean asalMiSonucu59= asalSayiMi(59);
        System.out.println("59 icin sonuc :"+ asalMiSonucu59);


        asalSayiMi(34);

    }

    public static boolean asalSayiMi(int input) {

        boolean asalSayiMi = true;

        for (int i = 2; i < input; i++) {

            if (input % i == 0) { // eger burai calisirsa asal sayi degil
                asalSayiMi = false;
                break;

            }

        }


        return asalSayiMi;


    }
}