package day07_ternary_switchstatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

//Kullanıcıdan gün numarasını alıp gün ismini yazdırın
        //Hafta ici veya hafta sonu oldugunu yazdırın

        int günNo = 5;
        switch (günNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;

            case 6:
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Gecersiz gün numarası");
        }



    }
}
