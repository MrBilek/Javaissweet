package day06_IfElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {

        //Kullanıcıdan aldıgı ürün adedi ve liste fiyatını alın,
        //kullanıcıya müsteri kartı olup olmadıgını sorun
        //Müsteri kartı varsa 10üründen fazla alırsa %20, yoksa %15 indirim yapın,
        // Müsteri kartı yoksa 10 üründen fazla alırsa %20, yoksa %10 indirim yapın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");

        int ürünAdedi= scan.nextInt();

        System.out.println("Ürünün liste fiyatını giriniz");
        double ListeFiyatı= scan.nextDouble();

        System.out.println("Müsteri kartınız var mı?\nE:Evet H:Hayır");

        char kartVarmı= scan.next().charAt(0);
        if (kartVarmı=='E'&&ürünAdedi>10 ){
            System.out.println("%20 indirimli toplam fiyat "+ürünAdedi*ListeFiyatı*0.8);

        } else if (kartVarmı=='E'&& ürünAdedi>0) {
            System.out.println("%15 indirimli toptan fiyat:" + ürünAdedi * ListeFiyatı * 0.85);

        } else if (kartVarmı=='H'&&ürünAdedi>10){
            System.out.println("%15 indirimli toptan fiyat:" + ürünAdedi * ListeFiyatı * 0.85);

        } else if (kartVarmı=='H'&& ürünAdedi>0) {
            System.out.println("%15 indirimli toptan fiyat :"+ürünAdedi*ListeFiyatı*0.9);
        }else {
            System.out.println("Hatalı Bilgi");
        }
    }

    }
