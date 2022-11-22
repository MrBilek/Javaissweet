package day07_ternary_switchstatements;

public class C05_Ternary {
    public static void main(String[] args) {

        //Ternery isleminin sonucunu yazdıracaksak
        //boolean sartın true ya da false olması durumunda
        //yazdıracagımız datalar farklı data türünde olabilir

        //Ancak atama yapacaksak true ya da false olması durumunda alacagı degerler atayacagımız variable ın
        //data türüne uygun olmalıdır

        int sayı=2;

        System.out.println(sayı>10 ? "büyük sayı": sayı+2);

       // int b= (sayı>10 ? "büyük sayı": sayı+2);  string old. icin kabul etmez

        // String c=(sayı>10 ? "büyük sayı": sayı+2); int old icin kabul etmez
    }
}
