package com.recusion;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibonacci(6);
        System.out.println(ans);
    }

    private static int fibonacci(int n) {
        if ( n < 2) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
