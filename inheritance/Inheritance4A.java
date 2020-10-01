package com.inheritance;

import java.util.Scanner;

public class Inheritance4A {
    double x,y;

    public void assignXY() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        x = sc.nextInt();
        System.out.print("Enter Y: ");
        y = sc.nextInt();
    }

    public void assignRandomXY() {
        x = (int)(Math.random() * 13);
        y = (int)(Math.random() * 13);
    }

    public double caulateExpression() {
        return (y - 3*x) / 3;
    }
}
