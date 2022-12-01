package day13_methodOverloading_whileLoop;

public class C02_MethodOverLoading {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(5));//cok guzel

        System.out.println(str.substring(3, 5));// a

        // Eger sectigimiz isimde birden fazla method varsa buna overloading denir
        // ve ayni isimdeki methodlardan hangisinin calisacagina argument/parametre uyumu karar verir

        toplama(5, 6);

        yenitoplama(5,6, 7);

        // Java ayni class icerisinde ayni isim
        // ve ayni data türünden parametre sayisi ile 2 method olustumaniza izin vermez

        // 1 ismini degistirebiliriz ancak bu durumda overloading olmaz

        //overloading ayni isimde fakat farkli isleve sahip methodlar olusturmak demektir

        //2 parametre sayisin degistirebiliriz

        // 3 ayni sayida parametre yazip parametrelerin Data türünü degistirebiliriz
    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("2 tam sayinin toplami :" + (sayi1 + sayi2));
    }

    public static void yenitoplama(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 tam sayinin toplami :" + sayi1 + sayi2 + sayi3); //bakalım buna******************
    }

    public static void toplama(int sayi2, double sayi1) {
        System.out.println("int ve double toplamı :");

    }
}