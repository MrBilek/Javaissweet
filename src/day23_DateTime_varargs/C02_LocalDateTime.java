package day23_DateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2022-12-20T12:28:45.476626900

        LocalDateTime ldt1= LocalDateTime.now(ZoneId.of("Turkey")); //2022-12-20T12:29:53.448045
        System.out.println(ldt1);

        System.out.println(ldt.getDayOfWeek()); //TUESDAY

        System.out.println(ldt.withYear(2030)); // 2030-12-20T12:33:47.374760300


    }
}
