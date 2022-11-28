package day10_stringManipulations;

public class C01_stringManipulation {
    public static void main(String[] args) {

        String str1= "";
        String str2= "    ";
        String str3;
        String str4= null;

        System.out.println(str1.length());//0
        System.out.println(str2.length());//4

        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true

        // null bir deger degil isaretcidir.

        //System.out.println(str3.length());

        //str3.concat("Ali Can");
        //System.out.println(str3.substring(3,4));


        //Not: Java bir valiable i olusturup deger atanmamasina izin verir
        // variable i deger atamadan OLUSTURABILIRSINIZ ama KULLANAMAZSINIZ
        //deger atanmayan bir variable i kullanirsak Java CTE verir.


        //null ppointer ise bu variable a bir deger atanmadigini ve bunun bilincli bir tercih old javaya soyler
        //dolayisiyla Java kodlarin calismaya devam etmesine izin verir
        //Ancak deger atanmadigi icin



        str4=null;

        //System.out.println(str4.length());

        //System.out.println(str4.substring(3,4)); // NullPointerExceptation verir

        System.out.println(str4); // null yazdirmaya izin veriyor
        System.out.println(str4+"Ali Can");//nullAli Can
        System.out.println(str4.concat("Ali Can")); //nullPointerException





    }
}
