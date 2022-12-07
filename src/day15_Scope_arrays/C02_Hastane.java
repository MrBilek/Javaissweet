package day15_Scope_arrays;

import java.sql.SQLOutput;

public class C02_Hastane {

    static String hastaneIsmi = "Yildiz hastanesi";
    static String HastaneAdresi = "Cankaya/Abkara";

    String personelIsmi ="Personel";

    String personelAdresi="Adres";

    String personelTel= "Telefon";

    public static void main(String[] args) {

        C02_Hastane per1= new C02_Hastane();


        C02_Hastane per2= new C02_Hastane();

        per1.personelIsmi= "Harun";

        per2.personelAdresi= "Cankaya";

        per1.hastaneIsmi= "Java Hastanesi";

        System.out.println(per1.personelTel); // telefon

        System.out.println(per1.personelIsmi);// harun
        System.out.println(per2.personelIsmi); // personel
        System.out.println(per2.personelAdresi); // Cankaya
        System.out.println(per1.hastaneIsmi); // Java Hastanesi
        System.out.println(per2.hastaneIsmi); //Java Hastanesi

        System.out.println(hastaneIsmi);

        per2.personelIsmi= "Mehmet";

        System.out.println(per1.personelIsmi); //Mehmet
        System.out.println(per2.personelIsmi);// personel

    }


}
