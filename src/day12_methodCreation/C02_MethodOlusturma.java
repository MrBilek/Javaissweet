package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun
// bir method ancak method call yapıldıginda calisir
        //method call icin method adi ve parametrelere uygun argüment yazilmalidir

        //method call icerisindeki yazilan variable  veya degerlere argüment denir

        // carpYAZDIR (Ali veli) argument ve parametreler uymlu degilse CTE olur

        carpYazdir(5,8);

        carpYazdir(7.4 ,8.6); // 63.64

    }

    public static void carpYazdir(double sayi1, double sayi2){


        System.out.println(sayi1 * sayi2);


    }


}
