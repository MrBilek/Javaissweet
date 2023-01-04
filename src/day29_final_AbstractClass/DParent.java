package day29_final_AbstractClass;

public abstract class DParent {
    /*Child classlarin tamaminda method1 ve method2 nin MUTLAKA OLMASINI istiyoruz
    Java parent class daki istenen methodlari child classlarin override etmek
    ZORUNDA KALMASI icin abstract class'ini olusturmustur

    Bir class'i abstract yapmak istersek class deklarasyonuna abstract yazmamiz yeterlidir.

    Bir abstract class'in icinde child classlarin override etmesi
    MECBURİ olan methodlar olabilecegi gibi MECBURI olmayan methodlar da olabilir.

       Child classlarin mutlaka OVERRİDE EDECEGİ methodlari abstract yapariz.

       abstract yapilan tum methodlar child class'larin tamaminda override edileceginden parent class daki
       abstract methodun body ye ihtiyaci olmaz.

       Java da abstract methodlarin body si olmasina izin vermez.

       Abstract classlarda abstract methodlar bulundugu icin
       Abstract classlardan OBJE URETILEMEZ.


     */

    public abstract void method1();
    public abstract void method2();
    public void method3(){
        System.out.println("Parent class'daki method3 calisti");

    }
}
