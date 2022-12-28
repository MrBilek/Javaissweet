package day24StringBuilder;

public class D {

    private String isim= "Mustafa";
    String isimDefault="Furkan";
    static String isimDefaultStatic= "Sevilay";


    public static void main(String[] args) {
        //System.out.println(isim); static olmadigindan static main method icinde direkt kullanilamaz

        D obj1= new D();
        System.out.println(obj1.isim);

        staticMethod();
        System.out.println(obj1.isim);

    }

    public void staticOlmayanMethod(){

        isim= "Huseyin";
        System.out.println(isim);


        }
    static void defaultStaticMethod(){
        System.out.println("default access modifierli static method calisti");

}
void defaultStaticOlmayanMethod(){
    System.out.println("Default access modifierli static method calisti");


}

    private static void staticMethod(){

        D obj1= new D();
        obj1.isim= "Zafer";
        System.out.println(obj1.isim);




    }
}
