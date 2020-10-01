package com.constructors;

public class Constructor1 {
    int x = 13;

    public Constructor1() {
        System.out.println("Hello My Class");
    }

    public void EvenOrOdd() {
        if (x % 2 == 0)
            System.out.println("X(" + x + ") is even");
        else
            System.out.println("X(" + x + ") is odd");
    }
}
