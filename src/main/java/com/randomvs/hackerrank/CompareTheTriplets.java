package com.randomvs.hackerrank;

import java.util.Scanner;

public class CompareTheTriplets {

    void solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int aScore = 0;
        int bScore = 0;

        aScore += (a0 > b0) ? 1 : 0;
        aScore += (a1 > b1) ? 1 : 0;
        aScore += (a2 > b2) ? 1 : 0;
        bScore += (a0 < b0) ? 1 : 0;
        bScore += (a1 < b1) ? 1 : 0;
        bScore += (a2 < b2) ? 1 : 0;

        System.out.println(aScore + " " + bScore);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        new CompareTheTriplets().solve(a0, a1, a2, b0, b1, b2);
    }
}