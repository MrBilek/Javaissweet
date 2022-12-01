package day12_methodCreation;

public class C04_Faktoriyel {
    public static void main(String[] args) {

        //verilen bir sayıyı 15 den kücük bir pozitif tamsayi oldugunu konrol edin
        //kücükse bir method olusturup, faktoriyel degerini yazdirin
        // sayı istenilen aralikta degilse uyari yazdirin

        int input = 14;

if (input>0 && input <15) {
    faktoryelYazdir(input);

}else {
    System.out.println("Girilen 15 den kücük pozitif tam sayi olmalidir");
}

    }

    public static void faktoryelYazdir(int sayi) {

int faktoriyelSonucu=1;

        for (int i = sayi; i >=1 ; i++) {

            faktoriyelSonucu*=i; // her loop da gelen sayiyi onceki deger ile carpalim

            System.out.println("Girilen"+sayi+"icin faktoriyel :" + faktoriyelSonucu);

        }



    }
}