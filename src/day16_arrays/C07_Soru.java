package day16_arrays;

public class C07_Soru {
    public static void main(String[] args) {

        int[]arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};

          int aranansayi= 4;

           elemanBul(arr,aranansayi);//

    }
    public static void elemanBul(int []arr, int arananSayi){

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]== arananSayi){
                sayac++;
            }

        }
        if (sayac==0) {
            System.out.println("Aranan sayi array da yok");

        }else {
            System.out.println("Aradiginiz " + arananSayi+ " array'de "+sayac+" adet kullanilmistir");
        }

    }


}
