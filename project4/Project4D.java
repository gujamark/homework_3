package com.project4;

public class Project4D {
    double a = 10.9,b = 30.12,z = 7.123;

    public double method1() {
        return (a + Math.pow(b,3) - 7) / (z + 8);
    }

    public double method2() {
        return (a + z - Math.pow(b,3)) / (z*a*b);
    }

    public double method3() {
        return (a*z - b) / (z*b);
    }

}
