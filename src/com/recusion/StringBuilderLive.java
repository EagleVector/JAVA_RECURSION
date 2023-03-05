package com.recusion;

import java.util.Arrays;

public class StringBuilderLive {
    public static void main(String[] args) {
//        String str = "nitin";
//
//        boolean ans = checkpalindrome(str);
//        System.out.println(ans);
//        System.out.println(str);

//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb);
//        System.out.println(sb.length());
//        sb.append("joy");
//        System.out.println(sb);
//        sb.append("full");
//        System.out.println(sb);
//        sb.delete(3,5);
//        System.out.println(sb);
//        sb.insert(3, 'f');
//        sb.insert(4, 'u');
//        System.out.println(sb);
//        String strng = sb.toString();
//        System.out.println(strng);
//        String s = "car";
//        String t = "rat";
//
//        boolean ans = checkanagrams(s, t);
//        System.out.println(ans);
        String s = "the sky is blue";

        reversalofstring(s);

    }

    public static void reversalofstring(String s) {
        s.trim();
        System.out.println(Arrays.toString(s.split(" ")));
    }

//    private static boolean checkanagrams(String s, String t) {
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//        else {
//            char[] arr1 = s.toCharArray();
//            char[] arr2 = t.toCharArray();
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//            return Arrays.equals(arr1, arr2);
//        }
//    }

//    public static boolean checkpalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left <= right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
}