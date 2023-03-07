package com.recusion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

//        int[] arr = {4, 2, 6, 8, 1, 3, 15, 9};
//        int[] ans = mergesorting(arr);
//        System.out.println(Arrays.toString(ans));

        int[] arr = {5, 4, 3, 2, 1};
        mergesortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergesortInplace(int[] arr, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergesortInplace(arr, start, mid);
        mergesortInplace(arr, mid, end);

        mergeinplace(arr, start, mid, end);
    }

    public static void mergeinplace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
//    static int[] mergesorting(int[] arr) {
//        if (arr.length == 1) {
//            return arr;
//        }
//
//        int mid = arr.length/2;
//
//        int[] left = mergesorting(Arrays.copyOfRange(arr, 0, mid));
//        int[] right = mergesorting(Arrays.copyOfRange(arr, mid, arr.length));
//
//        return mergebothsides(left, right);
//    }
//
//    private static int[] mergebothsides(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];
//                i++;
//            }
//            else {
//                mix[k] = second[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < first.length) {
//            mix[k] = first[i];
//            i++;
//            k++;
//        }
//
//        while (j < second.length) {
//            mix[k] = second[j];
//            j++;
//            k++;
//        }
//
//        return mix;
//    }
}
