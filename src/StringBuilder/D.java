package StringBuilder;

import java.sql.SQLOutput;

public class D {

    private String isim= "Mustafa";
    String isinDefault="Furkan";

    public static void main(String[] args) {
        //System.out.println(isim); static olmadigindan static main method icinde direkt kullanilamaz

        D obj1= new D();
        System.out.println(obj1.isim);


    }

    public void staticOlmayanMethod(){

        isim= "Huseyin";
        System.out.println(isim);


        }
     void defaultStaticMethod(){
    /*System.out.println("default access modifierli static method calisti");

  //  }

    static void defaultStaticMethod(){
        System.out.println("DEFAULT ACCESS modifierli static method calisti");


    }

    private static void staticMethod(){

        D obj1= new D();
        obj1.isim= "Zafer";
        System.out.println(obj1.isim);/*

     */

    }
}
