package com.constructors;

public class Constrcutor5 {

    float x, y;

    public Constrcutor5() {

    }

    public Constrcutor5(float num) {
        x = num;
    }

    public float calcuateExpression() {
        if(y != 0)
            return x / y + x*y;
        else if(x <= 0)
            return (float) (Math.pow(x,4) + y);

        return 0;
    }



    public float getMin() {
        if(x < y)
            return x;
        return y;
    }

}