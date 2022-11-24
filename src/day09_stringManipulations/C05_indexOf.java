package day09_stringManipulations;

public class C05_indexOf {

    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";
        // str cok iceriyor mu

        System.out.println(str.contains("cok"));//true

        //kullanıcından aldıgımız cümle "cok" ile baslayan ilk kelimeyi yazdırın

        System.out.println(str.endsWith("cok"));//false

        System.out.println(str.indexOf('a'));//1

        System.out.println(str.indexOf('v'));//2

        System.out.println(str.indexOf("cok"));//17

        System.out.println(str.indexOf("a", 5));//13
//2.o nun index ini yazdırın;
        //once ilk o nun indexini buluruz sonrasında 2.o yu aratırız

        int ilkOindexi=str.indexOf("o");//10
        int ikinciOindexi= str.indexOf("o",ilkOindexi+1);
        System.out.println(ilkOindexi+" "+ikinciOindexi);


    }
}
