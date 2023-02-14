package com.recusion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 43, 76, 87, 89, 93, 95};
        int target = 43;
        int start = 0;
        int end = arr.length - 1;
        int ans = binsearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int binsearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return binsearch(arr, target, mid + 1, end);
        }
        else {
            return binsearch(arr, target, start, mid - 1);
        }
    }
}
