package day30_interfaces_iterator;

public interface I01_Interface{

    //interfacelerde tum methodlar public ve abstract'tır.
    //Interfacelerde tum variable'lar public,static ve final'dir.
    //final oldugundan sonradan deger atamak olmaz, olustururken deger ATANMALIDIR.

    int sayi=10;
    public static final String OKULISMI="Yildiz Koleji";
    public int sayi2=20;

    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();

    void method5();

    /*
    Bir interface'e sonradan bir method eklemek istedigimizde
    o interface'i daha once implement eden tum class'lar
    yeni eklenen method'u implement etmek zorunda olur.

    Java'ya yapilan talepler sonucunda
    Java8 ile birlikte bu konuda bir istisna getirilmiştir.
    Eger sonradan eklenen method'un tum eski class'lar tarafindan implement edilme mecburiyeti
    olmasin istiyorsaniz
    yeni olusturdugunuz methoda DEFAULT veya STATIC keyword ekleyip
    body de olusturursaniz
    o zaman bu methodun child classlar tarafindan implment edilme MECBURİYETI OLMAZ


     */


   public default void method44(){
       System.out.println("Interface'deki default olarak isaretlenen method calisti");



   }

public static void method34(){
    System.out.println("Interface'deki static olarak isaretlenen method calisti");


}
}
