package day24StringBuilder;

public class C05_Encapsulation {
    public static void main(String[] args) {

        /*
        Access modifies bir class uyesine erisimi sinirlandirirken
        gorme yetkisi (read) ve degistirme yetkisini(Write) ayirt edemez

        Ama gercek hayatta bu ihtiyac vardir
        Bazi class uyelerinin readable olmasi istenirken
        Bazi class üyelerinin sadece wtitable olmasi istenir
        ve bazi class uyeleri icin 2 yetki de istenir

        Java bu yetkilendirme islemini Encapsulation ile cozmüstür
        Sadece yazma yetkisi icin setter()
        Sadece okuma yetkisi icin  getter()

        Kodlarimizin daha anlasilir bir sekilde atama ve yazma islemlerini yapmasi icin de getter() ve setter()
        methodlari birlikte kullanilabilir
        Bazi developer la boyle yapmayi tercih eder.

         */
    EncapsuleClass obj1= new EncapsuleClass();
    obj1.setSatis(100);
    obj1.setSatis(200);
    obj1.setSatis(300);

        System.out.println(obj1.getToplamSatis()); //600

        obj1.setHalkaAcikSayi(400);
        System.out.println(obj1.getHalkaAcikSayi());//400


    }
}
