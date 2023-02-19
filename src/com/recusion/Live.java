package com.recusion;

import java.util.Arrays;

public class Live {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 5, 3, 8},
                {12, 66, 6, 4},
                {1, 16, 42, 9}
        };
        matrixtranspose(arr);

    }
    static void matrixtranspose(int[][] arr) {
        int rowlen = arr.length;
        int collen = arr[0].length;

        int[][] mattrans = new int[collen][rowlen];

        for(int row = 0; row < rowlen; row++) {
            for (int col = 0; col < collen; col++) {
                mattrans[col][row] = arr[row][col];
            }
        }
        for(int row = 0; row < collen; row++) {
            for (int col = 0; col < rowlen; col++) {
                System.out.print(mattrans[row][col] + " ");
            }
            System.out.println();
        }
    }
//        int[] arr = {2, 4, 5, 7, 9, 12};
//        int target = 15;
//        boolean answer = twosummod(arr, target);
//        System.out.println(answer);
//    }

//    static boolean twosummod(int[] arr, int target) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            if (arr[left] + arr[right] == target) {
//                return true;
//            }
//            else if(arr[left] + arr[right] > target) {
//                right--;
//            }
//            else{
//                left++;
//            }
//        }
//        return false;
//    }
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1};
//        spiralformat(arr);
//        int[] ans = segregatearr(arr);
//        System.out.println(Arrays.toString(ans));
//        waveformat(arr);
//        vertical(arr);
//        int[][] a2 = {
//                {1, 2, 3},
//                {4},
//                {}
//        };
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a2.length);
//        System.out.println(a2[0].length);
//        System.out.println(a2[1].length);
//        System.out.println(a2[2].length);
//        for (int i = 0; i < a2.length; i++) {
//            System.out.println(a2[i]);
//        }
//        int[] arr = {2, 4, 5, 7, 9, 12};
//        int target = 18;
//        boolean answer = twosum(arr, target);
//        System.out.println(answer);
//    }
//
//    static boolean twosum(int[] arr, int target) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (target - (arr[i] + arr[j]) == 0) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    static int[] segregatearr(int[] arr) {
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j) {
//            for (int start = i; start < arr.length; start++) {
//                if (arr[start] == 0) {
//                    swapidx(arr, i, start);
//                }
//            }
//            i++;
//            for (int end = j; end >= 0; end--) {
//                if (arr[end] == 1) {
//                    swapidx(arr, end, j);
//                }
//            }
//            j--;
//        }
//        return arr;
//    }
//
//    static int[] swapidx(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//
//        return arr;
//    }

//    static void spiralformat(int[][] arr) {
//        int rowmin = 0;
//        int colmin = 0;
//        int colmax = arr[0].length - 1;
//        int rowmax = arr.length - 1;
//
//        while (colmin <= colmax) {
//            for (int row = rowmin; row <= rowmax; row++) {
//                System.out.print(arr[row][colmin] + " ");
//            }
//            colmin++;
//
//            for (int col = colmin; col <= colmax; col++) {
//                System.out.print(arr[rowmax][col] + " ");
//            }
//            rowmax--;
//
//            for (int row = rowmax; row >= rowmin; row--) {
//                System.out.print(arr[row][colmax] + " ");
//            }
//            colmax--;
//
//            for (int col = colmax; col >= colmin; col--) {
//                System.out.print(arr[rowmin][col] + " ");
//            }
//            rowmin++;
//        }
//    }

    //    static void vertical(int[][] arr) {
//        for (int i = 0; i < arr[0].length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//        }
//    }
//    static void waveformat(int[][] arr) {
//
//        for (int col = 0; col < arr[0].length; col++) {
//
//            if (col % 2 == 0) {
//                for (int row = 0; row < arr.length; row++) {
//                    System.out.print(arr[row][col] + " ");
//                }
//            }
//            else {
//                for (int row = arr.length - 1; row >= 0; row--) {
//                    System.out.print(arr[row][col] + " ");
//                }
//            }
//        }
//    }
}