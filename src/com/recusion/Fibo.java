package com.recusion;

public class Fibo {
    public static void main(String[] args) {
//        int ans = fibonacci(5);
        int answer = FiboRecurrence(25);
        System.out.println(answer);
    }
    static int FiboRecurrence(int n) {
        return (int) ((Math.pow((( 1 + Math.sqrt(5)) / 2 ), n) + Math.pow((( 1 - Math.sqrt(5)) / 2 ), n)) / Math.sqrt(5));
    }
//    static int fibonacci(int n) {
//        if ( n < 2) {
//            return n;
//        }
//        else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }

}
