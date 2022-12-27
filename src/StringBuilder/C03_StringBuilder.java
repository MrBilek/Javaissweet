package StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2= new StringBuilder("Java");

        String str= "Java";
        System.out.println(sb1==sb2); //false
        System.out.println(sb1.equals(sb2)); //false

        //StringBuilder metin esitligini sorgulamak icin equals() kullanmaz.

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3= new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3)); //2

        sb3= new StringBuilder("Tava");
        System.out.println(sb1.compareTo(sb3)); //-10

        sb3= new StringBuilder("Jaka");

        System.out.println(sb1.compareTo(sb3)); //11

        sb3= new StringBuilder("Javax"); //-1
        System.out.println(sb1.compareTo(sb3));

        sb3= new StringBuilder("Java Candir"); // -7
        System.out.println(sb1.compareTo(sb3));


        //System.out.println(sb1==str); data turleri fakli CTE verir.

        System.out.println(sb1.equals(str)); // false
       // System.out.println(sb1.compareTo(str)); compareTo stringbuilderlar arasinda calisir fakat farklı Data türü kabul etmez

    }
}
