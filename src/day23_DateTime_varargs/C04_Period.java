package day23_DateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1987,4,8);
        LocalDate bugün= LocalDate.now();

        Period yas= Period.between(dogumTarihi,bugün);
        System.out.println(yas); // P35Y8M12D
        System.out.println(yas.getYears()); // 35

        LocalDate baslangic= LocalDate.of(2010,8,5);
        LocalDate bitis= LocalDate.of(2015,7,20);

        Period sure= Period.between(baslangic,bitis);

        System.out.println(sure); //P4Y11M15D



    }
}
