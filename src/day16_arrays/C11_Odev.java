package day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // Kullanicidan yeni isimler alip var olan bir array'e ekleyen bir method olusturun
        //Kullanici yeni deger verdigi muddetce C10 daki methodu kullanarak eklemeye devam edin
        //Kullanici Q ya bastiginda  array in son halini dondurun

        Scanner sc = new Scanner(System.in);

        String[] names = {"John", "Alice", "Bob"}; // initialize array with initial values

        while (true) {
            System.out.println("Enter a new name, or Q to quit: ");
            String input = sc.nextLine();
            if (input.equals("Q")) {
                break;
            }
            addNameToArray(names, input);
        }

        System.out.println("Final array: " + Arrays.toString(names));
    }

    public static void addNameToArray(String[] array, String name) {
        // create a new array with an extra element
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = name; // add the new name to the end of the array
        array = newArray; // update the reference to the original array


    }
}
