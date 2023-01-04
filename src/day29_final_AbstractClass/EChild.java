package day29_final_AbstractClass;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parent class'daki mecburi override edilecek method1'i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("parent class'daki mecburi override edilecek method1'i override ettik");
    }
    /*
    Klasik inheritance ile Parent child iliskisi olusturdugumuzda
    Parent class daki tum ozellikleri otomatik olarak kazaniriz
    Ancak methodlari Override etme MECBURİYETİ YOKTUR.
    Ister override edip kendimize ozellestiririz
    Istersek de parent class daki hali ile kullaniriz.
     */

    public static void main(String[] args) {

      //  DParent obj1= new DParent();

        //DParent' is abstract; cannot be instantiated
        //Abstruct class larin constractur lari vardir. Ama obje uretilemez.


        EChild chld1= new EChild();
        chld1.method1();//parent class'daki mecburi override edilecek method1'i override ettik
        chld1.method2();//parent class'daki mecburi override edilecek method1'i override ettik
        chld1.method3();//Parent class'daki method3 calisti

        DParent chld2= new EChild(); // override edildigi icin ilk 2'si diger classdan aldı.
        chld2.method1(); //parent class'daki mecburi override edilecek method1'i override ettik
        chld2.method2();//parent class'daki mecburi override edilecek method1'i override ettik
        chld2.method3();//Parent class'daki method3 calisti

    }
}
