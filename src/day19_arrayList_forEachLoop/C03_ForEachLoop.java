package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
        Eger coklu elememt iceren bir yapidaki tum elementlere
        ayni islemi yapmak istiyorsak
        ındex den bagimsiz olarak for eachloop kullanilabilir
        for each llop ta3 seyi belirtmemiz gerekir
        1- getirilecek elementlerin data turu
        2- getirilen elemente verilecek isim (genelde each / w kullanilir)
        3- nereden getirilecegi



         */


        int[]arr= {2,4,6,8,1};

        // bu array in tum elementlerini yazdiralim

        for(int each: arr
        ) {

            System.out.print(each+ " ");
        }
        // tum elementleri toplayalim

        int toplam= 0;

        for (int each: arr
        ) { toplam+=each;



        }

        System.out.println("sayilarin toplami :" + toplam);

        //tum sayilarin karelerini toplayalim

        toplam=0;
        for (int each: arr
        ){
            toplam+=each*each;
        }
        System.out.println("Sayilarin kareleri toplami :"+toplam);
    }
}
