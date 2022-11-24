package day09_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        String str= "Java ögren, mutlu ol";

        //str mutlu iceriyor mu?

        System.out.println(str.contains("mutlu")); //True

        //charSequence: char dizisi
        //aradıgımız metnin String olması sart degil char da alabilir

        System.out.println(str.contains("j"));//false

        System.out.println(str.contains(" "));//

        //contains method'u kac tane olduguna degil
        //sadece var olup olmadıgına bakar

        System.out.println(str.contains("Java")&& str.contains("mutlu"));

    }
}
