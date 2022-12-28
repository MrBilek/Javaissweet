package day25_inheritance;

public class APersonel {

    protected String isim= "Isim atanmadi";
   protected String soyIsim= "Soyisim atanmadi";
   protected String telefon= "Telefon atanmadi";

protected void maas(){

    System.out.println("Hastanemizde uygulanan");

}
protected void ozelSigorta(){

    System.out.println("Tum personelin ozel saglik sigortasi yaptirilir");


}
    private void privateMethod(){

        System.out.println("private method calisti");


    }

}
