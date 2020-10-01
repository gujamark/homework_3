package com.projcet2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Project3A a1 = new Project3A();
//        a1.assignVars();
//        System.out.println(Arrays.toString(a1.m));
//        a1.assignVarsRandom();
//        System.out.println(Arrays.toString(a1.m));
//        System.out.println(a1.method3());
//        System.out.println(a1.method4());

          Project3B b1 = new Project3B();
//        b1.assignVars();
//        System.out.println(Arrays.toString(b1.m));
          b1.assignVarsRandom();
          System.out.println(Arrays.toString(b1.m));
          b1.numsMoreThan7();
          System.out.println(b1.MinMaxDifference());

    }
}
