package day04_Incriment_Concatenation;

public class C03_Concatenation {

    public static void main(String[] args) {

        int a= 10;
        int b=20;
        String str1= "";
        String str2= " ";
        String str3= "-";

        System.out.println(a+b);

        System.out.println(str1+a+b); //"" +10 +20= hiçlik +10+20== "10" +20== String hiçliği de kendisi gibi yapar

        System.out.println(a+str2+b); //10+""+20 == "10 "+20 olur bir boşluk var = 10 20 olur

        System.out.println(a+b+str3); // 10 +20 + "-" = 30-

        System.out.println(str1+a*b); // ""+10*20==

        System.out.println(str2+(a+b)); // "" +(10+20)==" ""+30  " 30"

        //System.out.println(str1-a); Toplama dışında hiçbir işlem string ile kullanılamaz











    }
}
