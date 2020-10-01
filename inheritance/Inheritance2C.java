package com.inheritance;

public class Inheritance2C extends Inheritance2B{

    double z;

    public Inheritance2C(int a, int b, int c){
        super(a,b);
        z = c;
    }

    public double getArithmeticAverage() {
        return (x + y + z) / 3;
    }

    public double getGeometricAverage() {
        return Math.sqrt(x*y*z);
    }

}
