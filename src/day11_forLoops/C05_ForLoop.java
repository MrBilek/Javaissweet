package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 pozitif sayi alin");

        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();

        if (bitis < baslangic) {
            System.out.println("Uyari : islem sonlandirildi");


        }else {

            int toplam=0;

            for (int i = baslangic; i <=bitis; i++) {
                toplam+=i;
            }
                System.out.println(baslangic+"ile "+bitis+ " arasindaki sayilarin toplami"+ toplam );



        }
    }
}