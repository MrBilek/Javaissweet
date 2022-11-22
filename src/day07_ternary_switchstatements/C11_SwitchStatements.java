package day07_ternary_switchstatements;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        /*Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
                I : International S : Software T : Testing Q : Qualifications B: Board


         */

     char harf='T';
     switch (harf){

         case 'I':
         case 'i':
             System.out.println("İnternational");
             break;

         case 'S':
         case's':
             System.out.println("Software");
             break;
         case 'T':
         case 't':
             System.out.println("Testing");
             break;
         case 'Q':
         case 'q':
             System.out.println("Qualifications");
             break;

         case 'B':
         case 'b':
             System.out.println("Board");
         default:
             System.out.println("yanlıs harf secimi");

     }


    }
}
