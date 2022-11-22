package day07_ternary_switchstatements;

public class C06_Sorular {
    public static void main(String[] args) {

       //Kullanıcından notunu alın 50 veya daha büyükse "Sınıfı gectin"
       //50 den kücükse "Maalesef Kaldın"

       int input=44;
        System.out.println(input>=50 ? "Sınıfı Gectin": "Maalesef Kaldın");

        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        char karakter = 'a';

        System.out.println(karakter>='a' && karakter <= 'z' ? (char) (karakter-32):karakter);

        //Soru 6- Kullancıdan bir sayı alın ve mutlak degerini yazdırın

        input= -125;

        // |5| = >5. Mutlak deger hepsini pozitife cevirme
        // |-4|= (-1)*(-4)= >4

        System.out.println(input>0 ? input:(-1)*input);

    }
}
