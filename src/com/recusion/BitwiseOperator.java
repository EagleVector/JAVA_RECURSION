package com.recusion;

public class BitwiseOperator {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 6, 4, 2, 4};
//        int num = 46;
//        System.out.println(checkodd(num));
        int ans = findunique(arr);
        System.out.println(ans);
    }

    static int findunique(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
        }
        return unique;
    }

//    static boolean checkodd(int num) {
//        return ((num & 1) == 1);
//    }
}
