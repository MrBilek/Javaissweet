package day10_stringManipulations;

public class C05_Soru {
    //kullanıcından 1 cümle alın
    //cümlede ev geciyorsa home home sweet home yazdırın
    //cümlede is geciyorsa calısmak guzeldir
    //ikisini de iceriyorsa Hem ev lazıö hem is
    //hicbirini icermiyorsa cok calısman lazım yazdırın

    public static void main(String[] args) {


        String str= "Evde calısıyorum, ofise gitmeye gerek yok";

         String calisilacakStr= str.toLowerCase();

         if (calisilacakStr.contains("ev")&& calisilacakStr.contains("is")){
             System.out.println("home home sweet home");

         } else if (calisilacakStr.contains("is")) {

             System.out.println("calısmak guzeldir");

         } else
             System.out.println("cok calısman lazım");


    }
}
