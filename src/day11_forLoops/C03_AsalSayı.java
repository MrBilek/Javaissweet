package day11_forLoops;

public class C03_AsalSayı {
    public static void main(String[] args) {

        //input olarak verilen bir tam sayının asal sayı olup olmadıgını yazdıralım

        int input=4737;
        String sonuc="Sayı asal";

        for (int i = 2; i <input ; i++) {

          if (input%i==0){
              sonuc="Sayı asal degil";

              break;

              //Java bir loop un icerisinde "break" görürse o loop u bitirir

          }

        }
        System.out.println("sayı asal degildir");
    }
}
