package com.constructors;

public class Constructor3 {
    int a,b,x = 55;

    public Constructor3() {

    }

    public Constructor3(int num1,int num2) {
        a = num1;
        b = num2;
    }

    public boolean isRange_ab() {
        return (a < b);
    }

    public boolean isInRange_x() {
        return x >= a && x <= b;
    }
}
