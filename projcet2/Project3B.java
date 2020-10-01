package com.projcet2;

import java.util.Scanner;

public class Project3B {
    int[] m = new int[12];
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

    public void numsMoreThan7() {
        String result = "Nums Higher Than 7: ";

        for(int i = 0; i < m.length;i++) {
            if (m[i] > 7) {
                result = result + m[i];
                if(i != (m.length - 1)) {
                    result += ", ";
                }
            }
        }
        System.out.println(result);
    }

    public int MinMaxDifference() {
        int min = m[0], max = 0;

        for(int i = 0; i < m.length;i++) {

            if(m[i] < min) min = m[i];
            if(m[i] > max) max = m[i];

        }

        return max - min;

    }
}
