package day11_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        //verilen input a göre carpim tablosu olusturun

        //Java da ic ice yapılara Nested denir
        // burada sadece farklı olan i nin kat sayısı oldugundam onun icin de bir loop olusuralım


        int input=4;
        /*
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16

         */

        for (int i = 1; i <=4 ; i++) {
            System.out.println(" ");

        }

        for (int i = 1; i <=4 ; i++) { //outer loop denir ve İ nin carpilacagi sayıyı kontrol edecek

            for (int j = 1; j <=4 ; j++) {// inner loop denir ve önceki örnekteki 1 degiskeni kontrol eder

                System.out.print(i*j+" ");
            }
            System.out.println(" ");
        }
    }
}
