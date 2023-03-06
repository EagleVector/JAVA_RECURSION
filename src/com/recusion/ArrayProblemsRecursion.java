package com.recusion;

import java.util.ArrayList;

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
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 8;
        int start = 0;
        int end = arr.length - 1;
        int indx = rotatedbinarysearch(arr, target, start, end);
        System.out.println(indx);


    }

    private static int rotatedbinarysearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedbinarysearch(arr, target, start, mid - 1);
            }
            else {
                return rotatedbinarysearch(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return rotatedbinarysearch(arr, target, mid + 1, end);
        }
        else {
            return rotatedbinarysearch(arr, target, start, mid - 1);
        }
    }

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
