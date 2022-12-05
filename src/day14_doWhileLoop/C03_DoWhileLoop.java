package day14_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {


// verilen baslangic ve bitis karakterler dahil
        // aradaki tüm karakterleri yazdirin

        char baslangic = 'd';
        char bitis = 'm';

        do {

            System.out.print(baslangic);
            baslangic = (char) (baslangic + 1);


        }while (baslangic<= bitis);

        // dersten sonra bak yine

    }

}