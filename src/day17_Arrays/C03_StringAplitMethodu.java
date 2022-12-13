package day17_Arrays;

import java.util.Arrays;

public class C03_StringAplitMethodu {

    public static void main(String[] args) {

        String str= "Java her gecen gun guzellesiyor";

        // str da kac kelime var ?
        // split methodu istedigimiz String i istedigimiz ayırac kullanarak
        // parcalara ayirmamiza imkan verir

        String[]spaceSplit=str.split(" ");

        System.out.println(Arrays.toString(spaceSplit));

        System.out.println("verilen cumledeki kelime sayisi: "+spaceSplit.length);


        // e lerden bolelim

        System.out.println(Arrays.toString(str.split("e")));// [Java h, r g, c, n gun guz, ll, siyor]

        System.out.println(Arrays.toString(str.split("gun"))); //[Java her gecen ,  guzellesiyor]

        //hiclikle bolum

        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r]




    }
}
