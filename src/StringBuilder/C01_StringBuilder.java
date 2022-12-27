package StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder();

        //kapasitesi 16 olan bos bir stringBuilder olusturur

        StringBuilder sb2= new StringBuilder(11);

        System.out.println(sb2);//Java
        System.out.println(sb2.capacity());//11

        sb2.append("Java");
        System.out.println(sb2); //Java
        System.out.println(sb2.capacity()); //11

        sb2.append("Candir");
        System.out.println(sb2); // Java Candir
        System.out.println(sb2.capacity());

        sb2.append(".");
        System.out.println(sb2);//Java cANDİR
        System.out.println(sb2.capacity()); // 24=2*11+2




    }


}
