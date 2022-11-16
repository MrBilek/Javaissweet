package day03_dataCasting_Matematikselişlemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        double dbl=23.5;

        int sayı= (int)dbl;

        //normalde int double a çevrilmez. Ama sorumluluğu ben alıyorum anlamında parantez içine alırsak işlemi yaptırır

        byte byt=(byte)sayı;

        // aynı şekilde çevirme işlemi yapılabilir.

        System.out.println(byt);

        sayı=130;
        byt=(byte)sayı; // int dha kapsamlı old için otomatik atama yapmaz. bizden müdahale ister.

        System.out.println(byt); // int 130 un byte hali : -126 oldu.

        sayı= 13000;
        byt= (byte)sayı;
        System.out.println("int13000'un byte hali:"+byt);


    }
}
