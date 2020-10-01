package com.project1;

import java.util.Scanner;

class Project1A {
    int a,b;

    public void assignVars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
    }

    public void printSum() {
        System.out.println(a + b);
    }

    public int getProduct() {
        return a * b;
    }

}
