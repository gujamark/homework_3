package com.inheritance;

import java.util.Scanner;

public class Inheritance4B  extends Inheritance4A{
    double a,b;

    public void assignAB() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = sc.nextInt();
        System.out.print("Enter B: ");
        b = sc.nextInt();
    }

    public void swap() {
        if (a > b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
    }

    public void assignRandomX() {
        x = a + (int)(Math.random() * (b - a + 1));
    }

}
