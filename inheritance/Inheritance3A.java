package com.inheritance;

import java.util.Scanner;

public class Inheritance3A {
    int x,y;
    public void assignXY() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        x = sc.nextInt();
        System.out.print("Enter Y: ");
        y = sc.nextInt();
    }

    public void assignRandomXY() {
        int min = 12;
        int max = 78;
        x = min + (int)(Math.random() * (max - min + 1));
        y = min + (int)(Math.random() * (max - min + 1));
    }

    public void getY() {
        System.out.println(y);
    }


}
