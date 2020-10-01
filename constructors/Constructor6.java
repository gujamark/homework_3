package com.constructors;

public class Constructor6 {

    float x,y;

    public Constructor6() {

    }

    public Constructor6(float num1) {
        x = num1;
    }

    public Constructor6(float num1, float num2) {
        x = num1;
        y = num2;
    }

    public float GCD() {
        float copyOfX = x, copyOfY = y;

        while(copyOfX != copyOfY) {
            if(copyOfX > copyOfY)
                copyOfX = copyOfX - copyOfY;
            else
                copyOfY = copyOfY - copyOfX;
        }

        return copyOfX;

    }

    public float LCM() {
        return (x * y) / GCD();
    }
}
