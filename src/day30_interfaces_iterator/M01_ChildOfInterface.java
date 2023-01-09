package day30_interfaces_iterator;

import day29_final_AbstractClass.FChild;

public class M01_ChildOfInterface implements I01_Interface,I02_Interface  {

    //Bir class baska bir class'i extends keyword ile parent edinebilir.
    //Ancak birden fazla class'i parent EDİNEMEZ
    //Interface ler icin boylle bir sinirlama yoktur
    //Bir class istedigi kadarf Interface'i implement edebilir
    public static void main(String[] args) {
        System.out.println(I01_Interface.sayi2);
        //I01_Interface.sayi=25; //Cannot assign a value to final variable 'sayi'


        //Interface deolusturulan static veya default olarak isaretlenen methodlarin farki
        // static olana interfaceIsmi.staticMethodIsmi seklinde ulasılabilirken
        // default olana child class dan olusturulacak obje uzerinden erisilebilir.


            I01_Interface.method34();

            M01_ChildOfInterface obj= new M01_ChildOfInterface();
            obj.method44();



    }

    // Eger birden fazla interface implement edildiginde
    // Ayni isimde methodlar fakli interfacelerde varsa
    //Return type a bakilir
    //Return type ayni ise sorun olmaz cunku ikisini de implement edebiliriz
    //Ancak return type lari farkli ise birini tercih ettigimizde digeri CTE verir.
    //Bu durumda parent interface lere mudahale etmek mumkunse mudahale edilebilir
    //veya bu interfacelerden birini implement etmekten vazgecebiliriz.


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
