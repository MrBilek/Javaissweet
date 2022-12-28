package day25_inheritance;

public class BDoctor extends APersonel{








    public static void main(String[] args) {


     BDoctor dok1= new BDoctor();
     dok1.isim="Kemal";
     dok1.soyIsim="Bulut";

        System.out.println(dok1.isim+","+dok1.soyIsim+","+dok1.telefon);//Kemal,Bulut,Telefon atanmadi

    dok1.maas(); ////Doktor maasi 30*8*25: 6000
    dok1.ozelSigorta();
    //Tum personelin ozel saglik sigortasi yaptirilir
    dok1.nobet();
    //Doktorlar haftada bir gun nobet tutar

    }

   public void maas(){
       System.out.println("Doktor maasi 30*8*25: "+6000);
   }

public void nobet(){

    System.out.println("Doktorlar haftada bir gun nobet tutar");


}
}
