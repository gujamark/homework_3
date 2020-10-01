package com.constructors;

public class Constructor4 {
    int x = 20,y = 92;

    public Constructor4() {
        System.out.println("Hello My Class");
    }

    public int method1() {
        if (x > 0)
            return 4*x - y;
        else if(x < 0)
            return 2*x + y;

        return 0;
    }

    public int method2() {
        if (y > 0)
            return 4*x + y;
        else if(y < 0)
            return 2*x - y;

        return 0;
    }

}
