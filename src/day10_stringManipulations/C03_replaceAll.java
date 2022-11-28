package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str= "Java 56Guz, zel-dir";

        System.out.println(str.replace("1",""));
        System.out.println(str.replace("5",""));
        System.out.println(str.replace("6", ""));

        str= "Ja1va4 56G7uz, z9el-d0ir8";

        /*replace ()zaten istenen degişikligi verilen ozellige uyan tum degerler icin yapar  */

        str=str.replaceAll("\\d", "");
        System.out.println(str); // butun digitslerden kurtulur

        //ozel kaakterlerden de kurtulmak ıcın
        // space de ozel karekter old. bu durumda space ın yok olmaması ıcın
        //once space yerıne metınde olmayan deger atayalım

        str= str.replace(" ", "5");
        str.replace("5", " ");


        System.out.println(str.replaceAll("\\W", ""));// JavaGuzzeldir

        //bir yerde eksik var......





    }

}
