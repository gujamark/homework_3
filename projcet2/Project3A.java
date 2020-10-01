package com.projcet2;

import java.util.Scanner;

public class Project3A {
    int[] m = new int[10];

    public void assignVars() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < m.length; i++) {
            System.out.print("Enter Num " + i + " :");
            m[i] = sc.nextInt();
        }
    }

    public void assignVarsRandom() {
        for(int i = 0; i < m.length; i++) {
            m[i] = (int)(Math.random() * 16);
        }
    }

    public int method3() {
        int sum = 0;
        for(int i = 0; i < m.length;i++) {
            if (m[i] < i) {
                sum += m[i];
            }
        }

        return sum;
    }

    public int method4() {
        int sum = 0;
        for(int i = 0; i < m.length;i++) {
            if (m[i] > i) {
                sum += m[i];
            }
        }

        return sum;
    }
}
