package day14_doWhileLoop;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan isteedigi kadar sayi alin
        // kullanici deger olarak 0 a basarsa islemi bitirin


        int girilenSayi=10;
        int toplam= 0;
        Scanner scan= new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("Lütfen toplamak icin bir tam sayi giriniz");

            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;

        }
        System.out.println("Girilen sayilarin toplami :"+toplam);

        //while loop un 2 tane negatif yani vardir
        //1- loop tan önce olusturdugumuz ve loop ta kullancagimiz variable lara yanlis bir deger verirsek
        // loop bodysi hic calismayabilir

        //2- loop condition u loop body sinden birkez fazla calisir

        //bu negatif yönlerden kurtulmak icin do while loop yapabiliriz
    }
}
