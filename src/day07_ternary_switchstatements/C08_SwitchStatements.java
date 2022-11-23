package day07_ternary_switchstatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        //Kullancıdan 2 sayı alın
        // ve kullanıcıya istedigi islemi sorun
        // +,-,*,/ isaretlerinden hangisini girerse

        //2 sayı icin o islemi yapın
        //bu isaretlerden birini girmezse
        //yanlıs islem tercihi yazdırın

        int sayı1 = 20;
        int sayı2 = 10;

        char islem = '+';

        //if else ile yapalım

        if (islem == '+') {
            System.out.println("Sayıların toplamı :" + (sayı1 + sayı2));

        } else if (islem == '-') {
            System.out.println("Sayıların farkı :" + (sayı1 - sayı2));


        } else if (islem == '*') {
            System.out.println("Sayıların carpımı :" + sayı1 * sayı2);

        } else if (islem == '/') {
            System.out.println("Sayıların bölümü:" + sayı1 / sayı2);


        } else {
            System.out.println("yanlıs islem tercihi");
        }
        System.out.println("=======");
        //Switch statement ile yapalım

        switch (islem) {
            case '+':

                System.out.println("Sayıların toplamı :" + (sayı1 + sayı2));
                break;
            case '-':
                System.out.println("Sayıların farkı :" + (sayı1 - sayı2));
                break;
            case '*':
                System.out.println("Sayıların carpımı :" + sayı1 * sayı2);
                break;
            case '/':
                System.out.println("Sayıların bölümü:" + sayı1 / sayı2);
                break;
            default:
                System.out.println("yanlıs islem tercihi");


        }
    }
}