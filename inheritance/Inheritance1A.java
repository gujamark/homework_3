package com.inheritance;

import java.util.Scanner;

public class Inheritance1A {
    int x;

    public Inheritance1A() {
        System.out.println("Helly My A Class");
    }

    public void assignX() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        x = sc.nextInt();
    }

    public String EvenOrOdd() {
        if(x % 2 == 0)
            return "even";
        else
            return "odd";
    }

}