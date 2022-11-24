package day02_variables_scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String girilenİsim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");

        String girilenSoyisim= scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int girilenyaş= scan.nextInt();

        System.out.println("isminiz :");


    }
}
