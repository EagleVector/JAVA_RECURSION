package com.recusion;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayLive {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 3, 2, 1};
//        boolean ans = arrpalin(arr);
//        System.out.println(ans);

//        int[] arr = {1, 3, 2, 4};
//        boolean ans = arrduplicate(arr);
//        System.out.println(ans);
//        int[] arr = {1, 1, 2, 1, 2, 2, 1, 1, 2, 1};
//        int ele = majorele(arr);
//        System.out.println(ele);
//        int[] arr = {1, 0, 1, 1, 1, 0, 1, 1};
//        int count = maxconsecutiveones(arr);
//        System.out.println(count);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = input.nextInt();
//        boolean ans = checkforprime(n);
//        System.out.println(ans);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the no of rows: ");
//        int n = input.nextInt();
//        pattern1(n);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the no of rows: ");
//        int n = input.nextInt();
//        pattern2(n);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = input.nextInt();
        patternhw(n);
    }

    public static void patternhw(int n) {
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n/2; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    public static void pattern2(int n) {
//        for(int row = 0; row < n; row++) {
//            for (int space = 0; space < row; space++) {
//                System.out.print("  ");
//            }
//            for (int col = 0; col < row; col ++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public static boolean checkforprime(int n) {
//        int num = 2;
//
//        while(num * num <= n) {
//            if (n % num == 0) {
//                return false;
//            }
//            num++;
//        }
//        return true;
//    }

//    public static int maxconsecutiveones(int[] arr) {
//        int maxcount = 0;
//        int count = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                count++;
//            }
//
//            else {
//                maxcount = Math.max(maxcount, count);
//                count = 0;
//            }
//        }
//        return Math.max(maxcount, count);
//    }

//    public static int majorele(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] <= arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//        return arr[arr.length/2];
//    }

//    static boolean arrduplicate(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    static boolean arrpalin(int[] arr) {
//
//        if (arr.length == 0) {
//            return false;
//        }
//
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            if (arr[start] != arr[end]) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
}