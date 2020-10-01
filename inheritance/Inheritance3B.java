package com.inheritance;

public class Inheritance3B  extends Inheritance3A{

    public double calculateExpression1() {
        return (y - x) / 3.0;
    }

    public double calculateExpression2() {
        return (Math.pow(x,2)+ 2*y) / 5;
    }

    public void getX() {
        System.out.println(x);
    }

}
