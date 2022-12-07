package day15_Scope_arrays;

public class C01_Hastane {


    static String hastaneIsmi = "Yildiz hastanesi";
    static String HastaneAdresi = "Cankaya/Ankara";

    String personelIsmi;

    String personelAdresi;

    String personelTel;

    public static void main(String[] args) {


        /* Eger bu tum metodlardan kulanilabilecek variable lar olusturmak isterseniz
        bu variable lari class level da olustururuz

        Class level da olursutulacak variable lar icin 2 ihtimal vardir.

        1- static variable (Class variable)
        2- (instance (static olmayan)  variable (obje variable)


        Kural 1= static variable lar tum objeler icin tek bir deger alir
                instance varible lar her obje icin java tarafindan cogaltilir

                Kural 2= class leve variable lara deger atamasak da kullanabiliriz
                biz deger atamasak bile java class level variable lara default degerler atar
                sayisal veriler icin == >0
                char ==  hiclik  ' '
                boolean== false

              kURAL 3= static olan method lardan static olmayan varable ve methodlara direk ulasamazsınız
              instance ve static olmayan methodları static olmayan
         */


    C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelAdresi);// null
        System.out.println(per1.personelTel);// null

        //System.out.println(personelIsmi);

        per1.personelIsmi= "Emrah";
        per1.personelAdresi="Turkey";
        per1.personelTel= "+09005555555";

        C01_Hastane per2= new C01_Hastane();

        System.out.println(per2.personelIsmi);//

        System.out.println(per2.personelIsmi);//

        per2.personelIsmi= "Ali";
        System.out.println(per2.personelIsmi);// aLİ

        System.out.println(per1.personelIsmi);// Emrah

        // Kural 4- class da olusturulan instance variable lar ilk deger atamasi yapar
        //yani bir obje ilk olusturuldugunda otomatik olarak instance variable a atanan degeri alir
        //deger atanmamıssa default degeri alir


        //Kural 5- static variable lar tüm objeler icin ortaktır
        //static variable lara tum class dan direk ulasılabilir
        // static variable ın degeri degisirse tum objeler icin degismis olur


        System.out.println(hastaneIsmi); //Yildiz Hastanesi
        System.out.println(per1.hastaneIsmi);

        per2.hastaneIsmi="Java Hastanesi";

        System.out.println(hastaneIsmi); //Java Hastanesi
        System.out.println(per1.hastaneIsmi);//Java Hastanesi




    }

    public static void method1(){
        System.out.println(hastaneIsmi);




    }

    public void method2 (){

        System.out.println(hastaneIsmi);




    }



}
