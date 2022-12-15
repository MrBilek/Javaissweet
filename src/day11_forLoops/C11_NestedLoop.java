package day11_forLoops;

public class C11_NestedLoop {
    public static void main(String[] args) {
            /*
            input degerine kadar her satirda * sayısını bir artirip
            sonra azaltarak asagıdaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artıs ve azalis kisimlerini 2 ayri nested loop ile yapmalisiniz
             */

      int input=4;

      //artis kismi icin Nested loop

        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }


            System.out.print("");

        // azalis kismi icin Nested loop
        for (int i = input-1; i>=1 ; i--) {

        }

        





    }
}
