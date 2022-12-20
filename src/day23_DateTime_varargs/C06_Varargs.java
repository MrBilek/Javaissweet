package day23_DateTime_varargs;



public class C06_Varargs {
    public static void main(String[] args) {
        
        // Oyle bir method olsuturalim ki 
        // kac tane argument yazarsam yazayim
        // argumentlerin toplamini versin


        topla(5,6);

        topla(5,8,2);
        topla(4,6,5,7,8,9);

        /* Varargs Array alt yapisini kullanir
        Temel hedef argument sayisi degisse bile
        ayni data turundeki tum argumentleri alabilecek bir parametre olusturmaktir.

         */
        
    }

    private static void topla(int... sayilar) {

        int toplam1= 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam1+= sayilar[i];

        }
        System.out.println(toplam1);


        int toplam2=0;

        for (int each:sayilar

             ) {
            toplam2+=each;
        }
        System.out.println(toplam2);

    }
}
