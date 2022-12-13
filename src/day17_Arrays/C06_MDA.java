package day17_Arrays;

public class C06_MDA {
    public static void main(String[] args) {

        // verilen 2 katli String 1 array de
        // istenen metni iceren elementleri yazdiran bir method olusturun


        String[][] arr = {{ "Ali","Zafer"},{"Betul","Huseyin","Hasan"}, {"Said"} };

        String arananMetin= "a";
        istenenElementleriYazdir(arr, "Ali");

    }

    public static void istenenElementleriYazdir (String[][]arr,String arananMetin){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.println(arr[i][j]+ " ");
                }

            }

        }
        System.out.println(" ");
    }

}
