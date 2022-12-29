package day26_Inheritance;

public class DToyota {

    /*
    Bir objenin data turu, canstructor olarak kullanilan class
    veya o class'in parent class'lari olabilir

    Data turu olarak parent class secilmesindeki amac
     child class'dan olusturulan objenin parent class'İn tum child class'larinin tasidigi
     ortak ozellikleri vurgulamaktadir.
     (personel toplantisina katilan doktor Kemal, bashemsire ayse gibi)


    Data turu ile constructor farkli oldugunda
    variable ile methodlar farklı davranirlar

    Variable'larin alacagi degeri bulmak icin
    aramaya data türü olan classdan baslariz
    o class da yoksa parentlarina bakariz.
    ve ilk buldugumuz degeri atama yapariz.

    data turu olan class veya Paretnlarinda bulunamazsa CTE olur.


     */




    String marka= "Toyota";
    String model= "Model belirtilmedi";
    String motor= "Motor belirtilmedi";
    String yakit= "Yakit belirtilmedi";


}
