package com.constructors;

public class Constructor2 {
    int x;

    public Constructor2() {

    }

    public Constructor2(int num) {
        x = num;
    }

    public boolean checkRange() {
        return 5 <= x  && x <= 24;
    }
}
