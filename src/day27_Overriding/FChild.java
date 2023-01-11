package day27_Overriding;

public class FChild extends EParent{

    @Override
    protected void method1() {
        super.method1();

        // eger overridding method ile birlikte overridden methodda calissin istersek
        // overriding method icinde super.method1 cagirilir.
    }

    @Override
    protected void method2() {
        super.method2();
    }
    public void method3(){
        System.out.println("Child method3");
        // parent class'da ayni isimde method olmasina ragmen
        // override olarak gorulmedi
        // sebep: parent'daki method3 private access modifier'a sahip oldugundan onu ayri bir method olarak gorur,
        //override olarak gormez.


    }

}