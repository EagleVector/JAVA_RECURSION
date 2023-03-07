package com.recusion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblemsRecursion {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 8, 9, 12};
//        System.out.println(checksorted(arr, 0));
//        int[] arr = {3, 2, 1, 18, 9};
//        int target = 18;
//        System.out.println(linsearch(arr, target, 0));
//        int[] arr = {1, 2, 3, 4, 4, 8};
//        ArrayList<Integer> ans = findallindex(arr, 4, 0, new ArrayList<>());
//        System.out.println(ans);
//        int[] arr = {1, 2, 3, 4, 4, 8};
//        ArrayList<Integer> ans = findallindex2(arr, 4, 0);
//        System.out.println(ans);
//        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
//        int target = 9;
//        int start = 0;
//        int end = arr.length - 1;
//        int indx = rotatedbinarysearch(arr, target, start, end);
//        System.out.println(indx);
//        patternrec1(4, 0);
//        patternrec2(4, 0);
//        int[] arr = {4, 3, 2, 1};
//        bubblesortrec(arr, arr.length - 1, 0);
//        System.out.println(Arrays.toString(arr));
//        int[] arr = {4, 3, 2, 1};
//        selectionsortrec(arr, arr.length, 0, 0);
//        System.out.println(Arrays.toString(arr));
    }

//    public static void selectionsortrec(int[] arr, int row, int col, int max) {
//        if (row == 0) {
//            return;
//        }
//        if (col < row) {
//            if (arr[col] > arr[max]) {
//                selectionsortrec(arr, row, col + 1, col);
//            }
//            else {
//                selectionsortrec(arr, row, col + 1, max);
//            }
//        }
//        else {
//            int temp = arr[max];
//            arr[max] = arr[row - 1];
//            arr[row - 1] = temp;
//            selectionsortrec(arr, row - 1, 0, 0);
//        }
//    }

//    public static void bubblesortrec(int[] arr, int row, int col) {
//        if (row == 0) {
//            return;
//        }
//        if (col < row) {
//            if (arr[col] > arr[col + 1]) {
//                int temp = arr[col];
//                arr[col] = arr[col + 1];
//                arr[col + 1] = temp;
//            }
//            bubblesortrec(arr, row, col + 1);
//        }
//        else {
//            bubblesortrec(arr, row - 1, 0);
//        }
//    }

//    public static void patternrec1(int row, int col) {
//        if (row == 0) {
//            return;
//        }
//        if (col < row) {
//            System.out.print("* ");
//            patternrec1(row, col + 1);
//        }
//        else {
//            System.out.println();
//            patternrec1(row - 1, 0);
//        }
//    }
//public static void patternrec2(int row, int col) {
//    if (row == 0) {
//        return;
//    }
//    if (col < row) {
//        patternrec2(row, col + 1);
//        System.out.print("* ");
//
//    }
//    else {
//        patternrec2(row - 1, 0);
//        System.out.println();
//    }
//}

//    private static int rotatedbinarysearch(int[] arr, int target, int start, int end) {
//        if (start > end) {
//            return -1;
//        }
//
//        int mid = start + (end - start)/2;
//
//        if (arr[mid] == target) {
//            return mid;
//        }
//
//        if (arr[start] < arr[mid]) {
//            if (target >= arr[start] && target <= arr[mid]) {
//                return rotatedbinarysearch(arr, target, start, mid - 1);
//            }
//            else {
//                return rotatedbinarysearch(arr, target, mid + 1, end);
//            }
//        }
//
//        if (target >= arr[mid] && target <= arr[end]) {
//            return rotatedbinarysearch(arr, target, mid + 1, end);
//        }
//        else {
//            return rotatedbinarysearch(arr, target, start, mid - 1);
//        }
//    }

//    public static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list) {
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//
//        }
//        return findallindex(arr, target, index + 1, list);
//    }

//    public static ArrayList<Integer> findallindex2(int[] arr, int target, int index) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//
//        }
//        ArrayList<Integer> ansfrombelowcalls = findallindex2(arr, target, index + 1);
//
//        list.addAll(ansfrombelowcalls);
//
//        return list;
//    }

//    public static int linsearch(int[] arr, int target, int index) {
//
//        if (index == arr.length) {
//            return -1;
//        }
//        if (arr[index] == target) {
//            return index;
//        }
//        else {
//            return linsearch(arr, target,index + 1);
//        }
//    }

//    public static boolean checksorted(int[] arr, int index) {
//        if (index == arr.length - 1) {
//            return true;
//        }
//        return arr[index] < arr[index + 1] && checksorted(arr, index + 1);
//    }
}
