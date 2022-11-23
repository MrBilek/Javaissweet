package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {
        //Soru2 - Kullanıcının kilo(kg) ve boyunu (cm)isteyip
        //vücut kitle endeksini hesaplayın (kilo*10000(boy*boy))
        //vücut kitle endeksi 30 veya daha büyükse obez,
        // 25-30 arası ise kilolu,
        //20-25 arası ise normal,
        //20 den kücükse zayıf yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        System.out.println("Lütfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        double vke=10000/(boy*boy);
        System.out.println("Vücut kitle Endeksiniz:"+vke);

        if (vke>30) System.out.println("Obezsiniz");
        else if (vke>=25) {System.out.println("Kilolusunuz");}
        else if (vke>20) { System.out.println("Kilonuz normal");
        } else System.out.println("Zayıfsınız,kilo almalısınız");


    }
}
