package com.recusion;

public class RecursionBasics {
    public static void main(String[] args) {
//        printno(1);
//        funrev(5);
//        func(5);
//        funboth(5);
//        int ans = sumofdig(1342);
//        System.out.println(ans);
//        int ans = sumrec(1342);
//        System.out.println(ans);
//        int prod = prodrec(131);
//        System.out.println(prod);
//        passingnos(5);
//        int rev = reverseno(12045);
//        System.out.println(rev);
//        System.out.println(rev1(1234));
//        int ans = countzeros(30204);
//        System.out.println(ans);
//        int ans = count(391004);
//        System.out.println(ans);
//        int steps = stepcounts(41);
//        System.out.println(steps);
    }

//    public static int stepcounts(int n) {
//        return hlprfn(n, 0);
//    }
//
//    private static int hlprfn(int n, int steps) {
//        if (n == 0) {
//            return steps;
//        }
//        if (n % 2 == 0) {
//            return hlprfn(n/2, steps + 1);
//        }
//        return hlprfn(n - 1, steps + 1);
//    }

//    public static int noofsteps(int n) {
//        int steps = 0;
//
//        while (n > 0) {
//            if (n % 2 == 0) {
//                steps++;
//                n = n/2;
//            }
//            else {
//                n = n - 1;
//                steps++;
//            }
//        }
//        return steps;
//    }

//    static int count(int n) {
//        return helper(n, 0);
//    }
//
//    private static int helper(int n, int c) {
//        if (n == 0) {
//            return c;
//        }
//        int rem = n % 10;
//        if (rem == 0) {
//            return helper(n/10, c + 1);
//        }
//        return helper(n/10, c);
//    }

//    public static int countzeros(int n) {
//        int count = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 0) {
//                count++;
//            }
//            n = n / 10;
//        }
//        return count;
//    }

//    static int rev1(int n) {
//        int digits = (int)(Math.log10(n)) + 1;
//        return helper(n, digits);
//    }
//
//    private static int helper(int n, int digits) {
//        if (n % 10 == n) {
//            return n;
//        }
//        int rem = n % 10;
//        return rem * (int)Math.pow(10, digits - 1) + helper(n/10, digits - 1);
//    }

//    public static int reverseno(int n) {
//        int rev = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n = n / 10;
//        }
//        return rev;
//    }

//    public static void passingnos(int n) {
//        if (n == 0) {
//            return;
//        }
//        else {
//            System.out.println(n);
//            passingnos(n--);          It will give stack overflow error as n = 5 will be passed first and then the value will get substracted.
//            passingnos(--n);            // Here the value will get substracted first and then will be passed.
//        }
//    }

//    public static int prodrec(int n) {
//        if (n % 10 == n) {
//            return n;
//        }
//        return (n % 10) * prodrec(n / 10);
//    }

//    public static int sumrec(int n) {
//
//        if (n == 0) {
//            return 0;
//        }
//        return (n % 10) + sumrec(n / 10);
//    }

//    public static int sumofdig(int num) {
//        int sum = 0;
//
//        while (num > 0) {
//            int n = num % 10;
//            sum = sum + n;
//            num = num/10;
//        }
//        return sum;
//    }

//    static void funboth(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        funboth(n - 1);
//        System.out.println(n);
//    }

//    static void func(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        func(n - 1);
//    }

//    static void funrev(int n) {
//        if (n == 0) {
//            return;
//        }
//        else {
//            funrev(n - 1);
//            System.out.println(n);
//        }
//    }
// Recursion: A Function that calls itself.

//    static void printno(int n) {
//        if (n == 5) {
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);

        // This is the last function call.
        // This is called tail recursion.
//        printno(n + 1);
//    }
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

