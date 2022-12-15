package day11_forLoops;

public class C12_MethodCreation {
    public static void main(String[] args) {

        // 5 in faktoriyelini hesaplayin


    faktoryelyazdir(5);




    faktoryelyazdir(7);


    faktoryelyazdir (3);





    }

    private static void faktoryelyazdir(int i) {
        int carpim=1;
        for (int j = 1; j <=i ; j++) {
            carpim*=j;


        }
        System.out.println(i + "! = " + carpim);
    }
}
