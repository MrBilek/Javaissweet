package StringBuilder;

public class EncapsuleClass {

     // Java class üyelerine erisimin write and read olarak ayrilmasi istendiginde
     // Encapsulation kullanir.

     //Bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir.
     //Sonra istedigimiz yetkiyi verecek public method olustururuz.


     public void setSatis(int satis) {
          this.satis = satis;
          toplamSatis+=this.satis;
     }

     public int getToplamSatis() {
          return toplamSatis;
     }

     private int toplamSatis=0;// gorulebilsin ama degistirilemesin ==>getter

     private int satis; //satis bolumunden deger girilebilsin ama degeri gorunmesin==> setter


    private int halkaAcikSayi=10; // herkese acik olsun ==> getter,setter

     public int getHalkaAcikSayi() {
          return halkaAcikSayi;
     }

     public void setHalkaAcikSayi(int halkaAcikSayi) {
          this.halkaAcikSayi = halkaAcikSayi;
     }
}
