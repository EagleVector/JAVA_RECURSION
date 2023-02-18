package com.recusion;

public class Mathematics {
    public static void main(String[] args) {
        int num = 5;
        boolean answer = checkprime(num);
        System.out.println(answer);
    }

    static boolean checkprime(int num) {
        int n = (int) (Math.sqrt(num));
        for(int i = 2; i <= n; i++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }
}
