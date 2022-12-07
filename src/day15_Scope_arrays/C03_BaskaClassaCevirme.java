package day15_Scope_arrays;

public class C03_BaskaClassaCevirme {
    public static void main(String[] args) {

        /* Java OOP konsept cercevesinde baska class lardaki class uyelerini (variable/method) kullanabiliriz
        Baska classdaki herhangi bir class uyesine ersimek istedigimizde
        static keyword onemli rol oynar

        static olarak isaretlenen class uyelerine
        classIsmi.staticuyeIsmi seklinde ulasabiliriz


        static olmayan class uyelerine erisebilmek icin obje olusturmamız gerekir.

        jAVA RUNTİME Programdır
        basinca calisir calistigi surece yapilan islemleri KALICI olaRAk tutar

        calisma bittiginde HER SEY YOK OLUR

         */

        System.out.println(C01_Hastane.HastaneAdresi); //Cankaya/Ankara

        C01_Hastane.method1();// Cankaya/Ankara

        System.out.println(C01_Hastane.hastaneIsmi);// Yildiz Hastanesi

        C01_Hastane per1= new C01_Hastane();

        System.out.println(per1.personelAdresi); //null

        System.out.println(per1.hastaneIsmi);// Yildiz hastanesi

        per1.personelIsmi="Zeynep";
        per1.personelAdresi="İstanbul";
        per1.personelTel= "Uskudar";

        System.out.println(per1.personelIsmi); // Zeynep
        System.out.println(per1.personelAdresi); // Istanbul
        System.out.println(per1.personelTel); // Uskudar

        System.out.println(per1.hastaneIsmi); //  Yildiz hastanesi
        System.out.println(per1.HastaneAdresi); // Cankaya/Ankara


    }
}
