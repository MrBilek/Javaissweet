package day18_ArrayList.C08_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {

    // Soru Kullanicidan istedigi kadar isim alip
    // Q ya bastiginda girdigi isimleri bize Liste olarak dondurecek bir method olusturun


List<String>isimListesi= isimListesiOlustur();
        System.out.println(isimListesi);




        }

        public static List<String>isimListesiOlustur(){


        List<String >isimListesi = new ArrayList<>();
        String girilenIsim= "";

            Scanner scan= new Scanner(System.in);

            while (!girilenIsim.equalsIgnoreCase("q")){

                System.out.println("Listeye eklemek icin bir isim girin\n Bitirmek icin Q ya basin");

                girilenIsim= scan.nextLine();

                if (!girilenIsim.equalsIgnoreCase("q")){
                    isimListesi.add(girilenIsim);
                }

            }
        return isimListesi ;

        }
    }









