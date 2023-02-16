package com.recusion;

public class BitwiseOperator {
    public static void main(String[] args) {
        int num = 46;
        System.out.println(checkodd(num));
    }

    static boolean checkodd(int num) {
        return ((num & 1) == 1);
    }
}
