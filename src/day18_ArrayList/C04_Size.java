package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Size {
    public static void main(String[] args) {


        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar); // [10, 5, 7, 9]

        sayilar.clear(); //Listedeki tüm elementleri siler

        System.out.println(sayilar.size()); //0 kaç tane oldugunu gösterir. yukarıda sildigim icin 0 normalde 4 idi.

        System.out.println(sayilar); //[]



    }


}
