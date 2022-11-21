package day_06_IfElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01IfElseStatements {
    public static void main(String[] args) {

        /*Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ücgenin kenar uzunluklarını giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0) {
            System.out.println("Eskenar ücgen");

        } else {
            System.out.println("Eskenar ücgen degil");
        }
    }
}
