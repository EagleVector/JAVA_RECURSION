package com.recusion;

public class BitwiseOperator {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 3, 6, 4, 2, 4};
//        int num = 46;
//        System.out.println(checkodd(num));
//        int ans = findunique(arr);
//        System.out.println(ans);
//        int num = 3;
//        System.out.println(magicnumber(num));
        int num = 23432;
        int base = 10;

        int digcount =  (int) (Math.log(num) / Math.log(base)) + 1;
        System.out.println(digcount);
    }

//    static int magicnumber(int num) {
//        int ans = 0;
//        int base = 5;
//        while (num > 0) {
//            int last = num & 1;
//            num = num >> 1;
//            ans = ans + (last * base);
//            base = base * 5;
//        }
//        return ans;
//    }

//    static int findunique(int[] arr) {
//        int unique = 0;
//        for (int i : arr) {
//            unique ^= i;
//        }
//        return unique;
//    }

//    static boolean checkodd(int num) {
//        return ((num & 1) == 1);
//    }
}
