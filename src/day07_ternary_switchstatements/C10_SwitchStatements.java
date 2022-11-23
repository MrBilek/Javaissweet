package day07_ternary_switchstatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

//Kullanıcıdan gün numarasını alıp gün ismini yazdırın
        //Hafta ici veya hafta sonu oldugunu yazdırın

        int günNo = 5;
        switch (günNo) {

            case 1:
                System.out.println("Hafta ici");
                break;
            case 2:
                System.out.println("Hafta ici");
                break;
            case 3:
                System.out.println("Hafta ici");
                break;
            case 4:
                System.out.println("Hafta ici");
                break;
            case 5:
                System.out.println("Hafta ici");
                break;

            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Gecersiz gün numarası");
        }

        //burdan devam edecegim   }


    }}
