package StringBuilder;

public class C04_AccessModifier {

    String str;

    //Access modifier i gozlerimizle goremiyorsak
    //default access modifier var demektir.

    // bu classta default Constructor var
    // str in degeri null (DEFAULT DEGER)
    // str in Access Modifier i default access modifier


    public static void main(String[] args) {

        D obj1= new D();
        System.out.println(obj1.isinDefault);
       // obj1.defaultStaticOlmayanMethod();
        //default access modifier li static olmayan method calisti

        // baska classlardaki class uyelerine erisimde
        // access modifier ve static keyword u dikkate alinmalidir
        // illa da obje uzerinden kullanmak istersniz
        // class uyelerinin ismini yazmaniz gerekir.
        System.out.println(obj1.isinDefault);

        //System.out.println(D.);

    }
}
