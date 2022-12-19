package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {


        // verilen bir List'de degisiklik yapan 2 method olusturun
// 1.method list'in elementlerine yeni deger atayip yazdirsin
// 2.method, list'e yeni bir list degeri atayip, yeni list'e
//   elementler ekleyip yazdirsin
// her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);// [10, 34, 45]

        elemanlariDegistir(sayilar);

        System.out.println("1.method call dan sonra sayilar :"+sayilar); //[25, 54, 67]
        yeniListAta(sayilar);
        System.out.println("2.method call dan sonra sayilar :"+ sayilar); //[25, 54, 67]

        /*

        java passbyvalue kullanır.

        PassByValue, methoda gönderilen variable in  kendisini degil degerini gondermek demektir.
        primitive data türleri veya string gonderdigimizde methodda yapilan degisiklik methodda kalir.
        Main methodda atama yapilmadikca main methoddaki variable ın degeri DEGİSMEZ.

        PassByValue coklu element iceren array ve list gibi yapilar icinde GECERLİDİR.
        Ancak coklu elementi value olarak methoda gonderemediginden
        array veya list in adresini gonderir.
        Eger methodda elementlere atama yapilirsa main method daki elementler de degismis olur.
        Eger List veya Array a yeni bir List veya Array degeri atanırsa bu atama methodda kalir.
        main methoddaki list veya array degismez.


        Araba ayni kaldigi muudetce icindekilerin degismesi passbyvalue ye aykiri degildir.

         */

    }


    public static void elemanlariDegistir(List<Integer>sayilar){

        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlari degistir methodunda List: "+sayilar); //[25, 54, 67]
    }

    public static void yeniListAta(List<Integer>sayilar){
        sayilar= new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("Yeni List Ata methodunda sayilar List inin son hali: "+sayilar);
    }


}
