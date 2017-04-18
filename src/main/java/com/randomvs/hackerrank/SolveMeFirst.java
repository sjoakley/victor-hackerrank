package com.randomvs.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {

    int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        SolveMeFirst solver = new SolveMeFirst();
        sum = solver.solveMeFirst(a, b);
        System.out.println(sum);
    }
}
