package day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> isimler= new LinkedList<>();
        isimler.add("Said");
        isimler.add("Huseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Humeyra");

        System.out.println(isimler); // [Said, Huseyin, Hasan, Sevilay, Humeyra]

        //Hasan ile Humeyra'nin yerlerini degistirin
        //buyuk bir listede index bilmeden yapalim

        String ilkIsim= "Hasan";
        String ikinciIsim="Humeyra";

        String temp= "";

        temp=ilkIsim;

        int ilkIsimIndex= isimler.indexOf(ilkIsim);
        int ikinciIsimIndex= isimler.indexOf(ikinciIsim);

        isimler.set(ilkIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler);//[Said, Huseyin, Humeyra, Sevilay, Hasan]


    }

}
