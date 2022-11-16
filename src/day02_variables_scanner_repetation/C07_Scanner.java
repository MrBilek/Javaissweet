package day02_variables_scanner_repetation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /* Kullanıcıdan ismini,soyismini ve yaşını alıp, aşağıdaki formatta yazınız.

        isminiz: Emrah
        soyisminiz: Bilek
        Yasınız: 35
        Kaydınız basarıyla tamamlanmıştır
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenİsim= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lütfen Yasınızı giriniz");
        int girilenYas= scan.nextInt();

        // her ne kadar alt alta yazsakta bilgiler yanyana yazılacagından \n (ters slas n) yazılmalıdır

        System.out.println("isminiz : " +girilenİsim+
                           "\nsoyisminiz : "+girilenSoyisim+
                            "\nyasınız : "+girilenYas+
                            "\nKaydınız basarıyla tamamlanmıstır.");




    }
}
