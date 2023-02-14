package com.recusion;

public class RecursionBasics {
    public static void main(String[] args) {
        printno(1);
    }
// Recursion: A Function that calls itself.

    static void printno(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // This is the last function call.
        // This is called tail recursion.
        printno(n + 1);
    }
}

//    static void print1(int n) {
//        System.out.println(n);
//        print2(2);
//    }
//
//    static void print2(int n) {
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n) {
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n) {
//        System.out.println(n);
//        print5(5);
//    }
//    static void print5(int n) {
//        System.out.println(n);
//    }
// Recursion: A Function that calls itself.

