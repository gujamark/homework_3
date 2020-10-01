package com.inheritance;

import java.util.Scanner;

public class Inheritance2A {
    int x,y;

    public void assignXY() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = sc.nextInt();
        System.out.println("Enter Y: ");
        y = sc.nextInt();
    }

    public void getX() {
        System.out.println(x);
    }

    public void getY() {
        System.out.println(y);
    }


}
