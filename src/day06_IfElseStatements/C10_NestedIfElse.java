package day06_IfElseStatements;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args) {

        //Kullanıcıdan aldıgı ürün adedi ve liste fiyatını alın,
        //kullanıcıya müsteri kartı olup olmadıgını sorun
        //Müsteri kartı varsa 10üründen fazla alırsa %20, yoksa %15 indirim yapın,
        // Müsteri kartı yoksa 10 üründen fazla alırsa %20, yoksa %10 indirim yapın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");

        int ürünAdedi = scan.nextInt();

        System.out.println("Ürünün liste fiyatını giriniz");
        double ListeFiyatı = scan.nextDouble();

        System.out.println("Müsteri kartınız var mı?\nE:Evet H:Hayır");

        char kartVarmı = scan.next().charAt(0);
        //kart ana degisken olsun

        if (kartVarmı == 'E' || kartVarmı == 'e') { // Kart var
            if (ürünAdedi <= 0) System.out.println("Gecersiz ürün miktarı");
            else if (ürünAdedi > 10) System.out.println("%20 indirimli toplam fiyat:" + ürünAdedi * ListeFiyatı * 0.8);
            else System.out.println("%15 indirimli tolam fiyat:" + ürünAdedi * ListeFiyatı * 0.85);

            if (kartVarmı == 'H' || kartVarmı == 'h') { // Kart yok
                if (ürünAdedi <= 0) System.out.println("Gecersiz ürün miktarı");
                else if (ürünAdedi > 10)
                    System.out.println("%25 indirimli toplam fiyat:" + ürünAdedi * ListeFiyatı * 0.8);
                else System.out.println("%10 indirimli tolam fiyat:" + ürünAdedi * ListeFiyatı * 0.9);


            } else System.out.println("Kart bilgisi Gecersiz");


        }
    }
}
