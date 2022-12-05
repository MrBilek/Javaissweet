package day14_doWhileLoop;

public class C05_Scope {

    int sayi = 10;
    static int number;

    public static void main(String[] args) {
        String mainStr="Java";
        number=10;
        // sayi=20;
        //System.out.println(method2Str);

        for (int i = 0; i < 10; i++) {

            int toplam=i;

        }

        //System.out.println(toplam); kıvırcık icide olan kıvircik icinde kalır ondan dolayi yazdiramayiz
        //System.out.println(i);

        //static int mainSai=29; Local de statik kullanilamaz

    }

    public static void method1() {
String method1Str= "Guzeldir";
        number=20;
        //sayi=14;
       // System.out.println(mainStr);
    }

    public void method2(){

       String method2Str= "Candir";
        number=30;
        sayi=30;
        //System.out.println(MainStr);


        // her variable her yerde kullanilamaz.



    }

}