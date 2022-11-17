package day04_Incriment_Concatenation;

public class C01_Pre_PostIncriment {
    public static void main(String[] args) {

    int sayı=20;

    //sayıyı 3 artırın

        sayı= sayı+3;
        sayı+=3;

        sayı++;
        sayı++;
        sayı++;

        System.out.println(sayı); //29

        //sayının degerini 2 azaltın

        sayı=sayı-2;
        sayı -=2;

        sayı--;
        sayı--;
        System.out.println(sayı); //23

        sayı=10;

        //sayının degerini önce 1 azaltın, sonra yazdırın

        sayı--;

        System.out.println(sayı); //9


        //bu islemde ekranda gördügümüz 9 sayısının degeri 9
        System.out.println(sayı);//9

        sayı=10;
        //sayıyı önce yazdırın, sonra 1 azaltın

        System.out.println(sayı);//10

        //DEVAMI DERSTEN SONRA 12:00 DA

         sayı=10;

        ++sayı; // sayıyı 1 artırır
        sayı++; // sayıyı 1 artırır

        System.out.println(sayı); //12












    }

}
