package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        //verilen bir Stringin palindrom olup olmadigini yazdirin
        //Palindrome: duz okunusu ile tersten birbirine aynı olan

        String str= "Bu methodlar ne guzelmis";

        String tersStr= C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin palindrome");
        } else {
            System.out.println("verilen metin palandrome degil");
        }



    }
}
