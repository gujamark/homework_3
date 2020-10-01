package com.project1;

import java.util.Scanner;

public class Project1B {
    int a,b,c;

    public void assignVars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
    }

    public void printMax() {
        int max = a;
        if(b > max) { max = b; }
        if(c > max) { max = c; }
        System.out.println(max);
    }

    public int getMin() {
        int min = a;
        if (b < min) { min = b; }
        if (c < min) { min = c; }

        return min;
    }


}
