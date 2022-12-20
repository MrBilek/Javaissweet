package day23_DateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        // verilen 2 sayiyi toplayip yazdiran bir method olusturun

        topla(5,8); //13

        topla(8,3,2); //13

        topla(3,5,7,10); // 25




    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {

        System.out.println("dort sayinin toplami:"+ (sayi1+sayi2+sayi3+sayi4)); //25
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc sayinin toplamı: "+(sayi1+sayi2+sayi3)); //13

    }

    private static void topla(int sayi1, int sayi2) {

        System.out.println("iki sayinin toplami: "+(sayi1+sayi2)); //13


    }
}
