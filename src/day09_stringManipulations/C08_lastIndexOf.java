package day09_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str= "Ben Java da cok iyi olacagım";

        //ilk a nın indexini yazdıralım

        System.out.println(str.indexOf("a"));//5

        //son a nın indexini yazdıralım

        System.out.println(str.lastIndexOf("a"));//24

        // verilen str da cok kelimesinin kullanımını kontrol edip
        // cok kelimesi kullanılmamıs
        // - bir kere kullanılmıs
        // birden fazla kullnılmıs
        // sonuclarından uygun olanı yazdırın
        // Javayı ogrenmek icin cok calısmam lazım cok

        int ilkCokIndexi= str.indexOf("cok");
        int sonCokIndexi= str.lastIndexOf("cok");



        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanılmamıs");
            
        } else if (ilkCokIndexi==sonCokIndexi) {
            System.out.println("- bir kere kullanılmıs");

        }else {
            System.out.println("birden fazla kullnılmıs");

    }


    }
}
