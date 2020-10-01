package com.inheritance;

public class Main {
    public static void main(String[] args) {
//        Inheritance1B b1 = new Inheritance1B();
//        b1.assignX();
//        b1.assignY();
//        System.out.println(b1.sum());

//          Inheritance2C c2 = new Inheritance2C(5,10,15);
//          System.out.println(c2.getArithmeticAverage());
//          System.out.println(c2.getGeometricAverage());

//        Inhertiance3C c3 = new Inhertiance3C();
//        c3.assignRandomXY();
//        c3.assignZR();
//        System.out.println(c3.calculateExpression1());
//        System.out.println(c3.calculateExpression2());
//        System.out.println(c3.calculateExpression3());
//        System.out.println(c3.calculateExpression4());

        Inheritance4B b4 = new Inheritance4B();
        b4.assignXY();
        System.out.println(b4.caulateExpression());
        b4.assignAB();
        b4.swap();
        b4.assignRandomX();
        System.out.println(b4.x);

    }
}
