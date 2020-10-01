package com.inheritance;

import java.util.Scanner;

public class Inhertiance3C extends Inheritance3B {
    double z,r;

    public void assignZR() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Z: ");
        z = sc.nextInt();
        System.out.print("Enter R: ");
        r = sc.nextInt();
    }

    public double getMin() {
        double[] nums = {x,y,z,r};
        double max = nums[0];
        for(int i = 0; i < nums.length;i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        return max;

    }

    public double calculateExpression3() {
        return (Math.pow(x,2)) + 2*y / (z - r);
    }

    public double calculateExpression4() {
        return calculateExpression1() + (r / (z + 4));
    }

}
