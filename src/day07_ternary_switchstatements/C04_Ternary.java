package day07_ternary_switchstatements;

public class C04_Ternary {
    public static void main(String[] args) {

        //Kullanıcıdan alınan deger
        //100den büyükse sayıyı 2 ile carpın
        //100 den kücükse sayıya 10 ekleyin

        int input= 145;

        if (input>100){
            input*=2;

        }else {
            input += 10;
            System.out.println("İf else ile :" + input);


            input = 145;

            input = input > 100 ? input * 2 : input + 10;
            System.out.println("ternary ile :" + input);

        }


        /*Verilen input u inceleyin
        eger 100 den büyükse bunu 5 e bölüp bölüm sonucunun tek sayı olup olmadıgını kontrol edin
        eger 100 den büyük degilse 10 ile bölümünden kalanı bulup bu kalanı 5 artırın
         */
         // Bu tür komplex islemleri Ternary ile yapmayız


    }
}
