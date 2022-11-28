package day02_variables_scanner;

import java.util.Scanner;

public class C02_repetation {
    public static void main(String[] args) {

 Scanner scan=new Scanner(System.in);
        System.out.println("Isminiz");
        String girilenIsim= scan.nextLine();


        System.out.println("soyIsminiz");
        String girilenSoyisim= scan.nextLine();

        System.out.println("yasiniz");

        int girilenYas= scan.nextInt();

        System.out.println("\nisminiz :"+girilenIsim+
                            "\nSoyisminiz  :"+girilenSoyisim+
                            "\nyasiniz :"+girilenYas+
                            "\nkaydiniz basariyla olusturuldu"


                );

        System.out.println("Kaydiniz olusturuldu");


Scanner scan1= new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin 2 kenar uzunlugunu yaziniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdortgenin alanı:"+ kenar1 * kenar2);





    }
}
