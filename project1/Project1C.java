package com.project1;

import java.util.Scanner;

public class Project1C {
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

    public int getLastNumOfA() {
        return a % 10;
    }

    public int getFirstNumOfA() {
        int firstNum = a;

        while (firstNum > 10) {
            firstNum /= 10;
        }

        return firstNum;
    }

    public int sumOfNumsC() {
        int sum = 0;
        int copyOfC = c;

        while (copyOfC > 0){
            sum += copyOfC % 10;
            copyOfC /= 10;
        }

        return sum;
    }


}
