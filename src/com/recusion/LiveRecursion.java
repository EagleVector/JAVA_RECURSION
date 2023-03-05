package com.recusion;


public class LiveRecursion {
    public static void main(String[] args) {
//        printincreasing(20);
//        System.out.println(powerofanum(4, 3));
//        System.out.println(factorialofnum(5));
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n -1 ) + fibonacci(n - 2);
        }
    }

//    public static int factorialofnum(int n) {
//        if (n <= 1) {
//            return 1;
//        } else {
//            return n * factorialofnum(n - 1);
//        }
//    }

//    public static int powerofanum(int base, int exp) {
//        if (exp == 0) {
//            return 1;
//        }
//        else {
//            return base * powerofanum(base, exp - 1);
//        }
//
//    }

//    public static void printincreasing(int n) {
//        if (n == 0) {
//            return;
//        }
//        printincreasing(n - 1);
//        System.out.println(n);
//    }
}
