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

        sayı--;

        //ekranda görülen 10, ama sayının son degeri 9

        System.out.println(sayı);

        sayı=10;

        sayı++; // sayıyı 1 artırır
        ++sayı; // sayıyı 1 artırır
        System.out.println(sayı);

        sayı=10;
        System.out.println(sayı++); //10
        //Java aynı satırda 2 işlem oldugunda sıralama yapar.
        // eger variable dan sonra ise artırma islemini sonra yapar
        // bu durumda önce yazdırma sonra artırma islemi yapar

        System.out.println(sayı);//11

        sayı=10;
        System.out.println(++sayı); //11
        //++variable dan önce ise artırma islemini once yapar
        // bu durumda java once artırma sonra yazdırma islemi yapar
        System.out.println(sayı); //11

        int num1=12;
        int num2= 15;
        num1*=2;
        num2/=3;
        System.out.println(num1+ num2);

        int num =12;

        num--;
        num--;
        num--;
        System.out.println(num);


    }

}
