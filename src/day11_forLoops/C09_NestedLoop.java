package day11_forLoops;

public class C09_NestedLoop {
    public static void main(String[] args) {

        //input olarak verilen kenar uzunluklarına göre asagıdaki sekli cizdirin

        int kisaKenar = 6;
        int uzunKenar = 9;

        /* * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *

         */

        for (int i = 1; i <=kisaKenar ; i++) {

            for (int j = 1; j <=uzunKenar ; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}

