package day10_stringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {

    String str= "Java heyecandır";

    //EGER TÜM A ALARI DEGIL DE İLK A YI DEGİSTİRMEK İCİN

        System.out.println(str.replaceFirst("a", "A"));

        //ilk harf vey rakamı * yapmak icin

        System.out.println(str.replaceFirst("\\W", "*"));






    }
}
