package day06_IfElseStatements;

import java.util.Scanner;

public class C11_NestedİfElse {
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

        //ürün miktarı ana degisken olsun

        if (ürünAdedi > 10) {//Ürün adedi 10 dan fazla

            if (kartVarmı == 'E' || kartVarmı == 'e')
                System.out.println("%20 indirimli toplam fiyat:" + ürünAdedi * ListeFiyatı * 0.8);

        } else if (ürünAdedi > 0) { //ürün sayısı 0- 10 arasında
        } else if (kartVarmı == 'H' || kartVarmı == 'h')
            System.out.println("%15 indirimli tolam fiyat:" + ürünAdedi * ListeFiyatı * 0.85);{



                {
        }


        }
    }
}

