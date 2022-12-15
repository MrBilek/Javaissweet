package day21_staticKeyword;

import java.sql.SQLOutput;

public class C01_staticBlocks {


        C01_staticBlocks(){
            System.out.println("Constructor calisti");
        }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");
    }

    static {

    // static blocklar class daki tum yapilardan hatta main methodddan bile once calisir

        // methodların ve static blockların sıralaması java acisindan onemli degildir
        // ancak birden fazla static varsa kendi aralarında once ustteki calisir

        System.out.println("Static block calisti");
    }

    static {

        System.out.println("Alltaki static block calisti");

    }

}
