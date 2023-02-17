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
//        int num = 15;
//        System.out.println(Integer.toBinaryString(num));
//        int base = 10;
//        int power = 6;
//        int base = 3;
//        int ans = 1;

//        int digcount =  (int) (Math.log(num) / Math.log(base)) + 1;
//        int answer = pascaltriangle(n);
//        System.out.println(answer);
//        while (power > 0) {
//            if ((power & 1) == 1) {
//                ans = ans * base;
//            }
//            base = base * base;
//            power = power >> 1;
//        }
//        System.out.println(ans);
//        int start = 0;
//        int end = 56;
//        int ans = xorcal(start, end, 7);
//        System.out.println(ans);
    }

//    private static int xorcal(int start, int end, int target) {
//        while (target > start && target < end) {
//            if (target % 4 == 0) {
//                return target;
//            }
//            if (target % 4 == 2) {
//                return target + 1;
//            }
//            if (target % 4 == 3) {
//                return 0;
//            }
//            if (target % 4 == 1) {
//                return 1;
//            }
//        }
//        return -1;
//    }

//    private static int setbits(int num) {
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num = num & (num - 1);
//        }
//        return count;
//    }

//    static int setbitscount(int num) {
//        int count = 0;
//        while (num > 0) {
//            if ((num & 1) == 1) {
//                count++;
//            }
//            num = num >> 1;
//        }
//        return count;
//    }

//    static boolean powerof2(int n) {
//        if (n == 0) {
//            return false;
//        }
//        return (n & (n - 1)) == 0;
//    }

//    private static int pascaltriangle(int n) {
//        return 1 << (n - 1);
//    }


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
