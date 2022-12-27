package day19_arrayList_forEachLoop;

public class Toyota {

    String marka = "Toyota";
    String model = "Model belirtilmemis ";
    int yil;
    int km;
    String renk;



    // default constructor suna benzer


    public Toyota() {
        System.out.println("Toyota classindaki cons.calisti");

    }
    /*

    Bir kod blogunun constructor olup olmadıgını anlamak ıcın 2 seye bakmalıyız.

    1- constructor class ismi ile ayni isimde olmalidir.
    (dolayısıyla cons. isimleri buyuk harfle baslar)

    2- Constructorların return type i olmaz.



     */



    /*
    Java da her class obje uretmek uzere olusturulur
    bir obje olusturulup ilk deger ataması yapılabilmesi icin de
    MUTLAKA Constructor calıstirilmalidir

    Java da her class da mutlaka CONSTRUCTOR bulunur.
    Her class da bizim constructor olusturmamıza gerek kalmamasi icin Java her class a otomatik olarak
    default construtor koyar.

    default constructor GORUNMEZ
   default constructor  parametresi olmayan
    ve bodysinde hic bulunmayan bir constructor dır.

    Bir class da gozlerimizle bir constructor gormuyorsak o class da default constructor vardır.

    eger kullanicilar tarafından gozle gorulur bir constructor olusturulursa java default constructor u siler.
    yani gözlerimizle bir constructor goruyorsak o class da default constructor vardır.

     */

}
