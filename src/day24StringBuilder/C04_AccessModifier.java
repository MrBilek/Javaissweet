package day24StringBuilder;

public class C04_AccessModifier {

    String str;

    //Access modifier i gozlerimizle goremiyorsak
    //default access modifier var demektir.

    // bu classta default Constructor var
    // str in degeri null (DEFAULT DEGER)
    // str in Access Modifier i default access modifier


    public static void main(String[] args) {

        D obj1= new D();
        System.out.println(obj1.isimDefault); //Furkan
        //Default access modifierli static method calisti

       obj1.defaultStaticOlmayanMethod();
        System.out.println(obj1.isimDefault); //Furkan
        System.out.println(D.isimDefaultStatic); //Sevilay
        obj1.defaultStaticOlmayanMethod();
        D.defaultStaticMethod();
        //default access modifier li static olmayan method calisti

        // baska classlardaki class uyelerine erisimde
        // access modifier ve static keyword u dikkate alinmalidir
        // illa da obje uzerinden kullanmak istersniz
        // class uyelerinin ismini yazmaniz gerekir.


        //System.out.println(D.);

    }
}
