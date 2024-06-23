package com.cses.solutions.Introductory;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;
        for (int i = 1; i <= n; i++) res ^= i;
        while (n-- > 0) {
            if (sc.hasNextInt()) res ^= sc.nextInt();
        }

        System.out.println(res);
        sc.close();
    }
}
