package day11_forLoops;

public class C03_AsalSayı {
    public static void main(String[] args) {

        //input olarak verilen bir tam sayının asal sayı olup olmadıgını yazdıralım

int input= 19;
String sonuc= "Sayi asal";

        for (int i = 2; i <input ; i++) {


            if (input%i==0){
                sonuc= "Sayi asal degil";
                System.out.println("Sayı asal degildir");
                break;
            }

        }


        System.out.println(sonuc);



    }
}
