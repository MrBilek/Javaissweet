package day25_inheritance;

public class ECorolla extends DToyota{
    ECorolla(){

        System.out.println("Parametresiz Corolla constructor'i olustu");

    }

    ECorolla(String param1){

        super("Gri");
        System.out.println("String parametreli corolla constructor calisti");

    }

    String model= "Corolla";
    String uretimYeri= "Turkiye";

    public static void main(String[] args) {
        ECorolla cor1= new ECorolla();


    }
    /*
    Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
    constructor calismalidir

    Inheritance da biliyoruz ki child class dan olusturlan her obje
    parent class daki ozelliklere de sahip olur.

    Parent class daki ozelliklere sahip olabilmesi icin
    parent class daki constructor lar da calismalidir.

    Java bu calismayi super() sayesinde saglar

    Java'da her olusturulan class'da gorunmese de Default constructor oldugu gibi

    extends keyword kullanilan her class'da olusturulan her constructor'in ilk satirinda gorunmese de
    super constructor Call vardir.


     */
}
