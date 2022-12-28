package day24StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb= new StringBuilder("Java");
        System.out.println(sb.capacity()); //16+4 yazdırdı 20
        System.out.println(sb.length());//4

        sb.trimToSize();
        // atama yapmadigimiz halde bu degisiklik kalici olur mu
        // String builder mutable oldugundan methodlarla yapilan degisiklikler kalici olur.
        System.out.println(sb.capacity());//4

        sb.toString().toUpperCase();

        System.out.println(sb);//Java
        // StringBuilderi String e cevirirseniz veya String dondurecek methodlar kullanirsaniz
        //String in mutable ozelligi devreye girer ve yapilan degisiklikler kalici olmaz

        //sb= sb.toString().toUpperCase();
        // non primitive data türlerinde farklı data turunden atama yapamazsiniz

    Short sayi1=20;
    //Integer sayi2= sayi1;

        StringBuilder sb2= new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2); // JAVA

        sb=sb2;
        System.out.println(sb);//JAVA


        sb.setCharAt(0,'H');
        System.out.println(sb); //HAVA

        System.out.println(sb.substring(2,3)); //V

        System.out.println(sb.reverse()); //AVAH
        System.out.println(sb);//kalici  olur avaH

        sb.insert(1,"H "); //AVAH

        System.out.println(sb); //AH VAH


        String uzunMetin= " ETMEK YOK CALİSMAK VAR";

        sb.insert(6," ETMEK YOK CALİSMAK VAR",0,10);

        System.out.println(sb);//AH VAH ETMEK YOK

        System.out.println(sb.indexOf("A", 3)); //4

        System.out.println(sb.indexOf("VAH"));//3

        System.out.println(sb.lastIndexOf("E", 9));//7

        sb.replace(0,12,"Sorun");
        System.out.println(sb); //Sorun YOK

        sb.delete(5,sb.length()); // Baslangic indexi dahil, Bitis indexi dahil degil
        System.out.println(sb);//Sorun






    }
}
