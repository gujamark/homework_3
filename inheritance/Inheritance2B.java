package com.inheritance;

public class Inheritance2B extends Inheritance2A {

    public Inheritance2B(int a, int b) {
        x = a;
        y = b;
    }

    public int yMINUSx() {
        return  y - x;
    }

    public int xPLUS2y() {
        return x + 2*y;
    }

}
