package day08_StringManipulation;

public class C05_CharAt {
    public static void main(String[] args) {

        String str= "Java guzeldir:";
        // 13 karakter barındırır. Space de bir karakter

        //Java da indeks 0 dan baslar
        //J==>0. index, r==>12 index
        //charAt(index)ile istedigimiz index deki char a ulasabiliriz

        //ilk a yı yazdıralım
        System.out.println(str.charAt(1));
        // sondan 2.harfi yazdıralım
        System.out.println(str.charAt(13-2));// karakter sayısı -2. indexdeki eleman
        //sondan 4.karakteri buyuk harf yazdırın

        System.out.println(str.toUpperCase().charAt(13-4));
        // charAt() Metodu bize char dondurdugu icin  toUppercase () calısmaz
        // String metodlarını char At() ile kullanmak icin
        // charAt den once kullanmalısınız

        //System.out.println(str.charAt(18));// StringIndexOutOfBoundsException yazar
        //Eger index olarak karakter sayısı veya daha buyuk bir deger girersek
        //o index i bulamayacagi icin hata verir






    }
}
