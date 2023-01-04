package day27_Overriding;

public class EParent extends DGrandParent{


    @Override
    protected void method1() {
        super.method1();
        System.out.println("P method1");

        // @override notasyonu overridden method ile overriding methodu ilisiklendirir.
        // eger overridden methodda bu iliskiyi bozacak bir degisiklik yapilirsa
        // @override notasyonu CTE verir.

    }

    protected void method2(){
        System.out.println("P method2");

    }
private void method3(){
    System.out.println("P method3");


}
}
