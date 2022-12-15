package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        /* Java pass by value lullanir
        yani method lar arasinda gonderilen variableların
        kendileri degil value lari diger methoda yollanir.
         */

        int fiyat= 100;
        //fiyat uzerinden %10 indirim yapip, indirimli fiyatı donduren bir method olusturun

        System.out.println(indirimYap10(fiyat)); //90
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));

        System.out.println(fiyat); //100

        // eger indirimli fiyatın kalici olarak fiyatimizi degistirmesini istersek atama yaopariz

        fiyat= indirimYap10(fiyat);

    }

    public static int indirimYap10(int a){

        a= a*90/100;

        return a;


    }
}
