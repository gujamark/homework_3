package com.inheritance;

import java.util.Scanner;

public class Inheritance1B extends Inheritance1A{
    int y;

    public void assignY() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Y: ");
        y = sc.nextInt();
    }

    public int sum() {
        return x + y;
    }
}
