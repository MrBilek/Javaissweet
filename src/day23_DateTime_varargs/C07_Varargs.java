package day23_DateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kac tane String argument yazılırsa yazılsın
        // Argumentlerin en uygun olanini yazdiran bir method olusturun
        // Not: en uzun kelime olarak 1 den fazla kelime varsa, ilkini yazdirin


        enUzunuYazdir ("Ilyas", "Berivan", "Murat");

        enUzunuYazdir("Emrah","Java", "Suleyman");



    }

    private static void enUzunuYazdir(String...kelimeler) {
        String enUzunKelime= kelimeler[0];

        for (String eachKelime: kelimeler
             ) {
            if (eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}
