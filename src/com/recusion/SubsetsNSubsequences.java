package com.recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsNSubsequences {

    // Subset is for arrays and Subsequence is for strings.
    public static void main(String[] args) {
//        String str = "baccad";
//        String ans = skipch(str);
//        System.out.println(ans);
//        String str = "bccdappledah";
//        System.out.println(skiptheApple(str));
//        String str = "bcappmxapplegdq";
//        System.out.println(skipappnotapple(str));
//        subseqence("", "abc");
//        System.out.println(subseqret("", "abc"));
//        subseqascii("", "abc");
//        System.out.println(subseqasciiret("", "abc"));
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subset(arr);
//        for (int i = 0; i < ans.size(); i++) {
//            List<Integer> list = ans.get(i);
//            System.out.println(list);
//        }
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> list = ans.get(i);
            System.out.println(list);
        }
    }

//    static List<List<Integer>> subset(int[] arr) {
//        List<List<Integer>> outer = new ArrayList<>();
//
//        outer.add(new ArrayList<>());
//
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            int n = outer.size();
//
//            for (int j = 0; j < n; j++) {
//                List<Integer> internal = new ArrayList<>(outer.get(j));
//                internal.add(num);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;

            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
//    public static ArrayList<String> subseqasciiret(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//
//        char ch = unprocessed.charAt(0);
//
//        ArrayList<String> first = subseqasciiret(processed + ch, unprocessed.substring(1));
//        ArrayList<String> second = subseqasciiret(processed, unprocessed.substring(1));
//        ArrayList<String> third = subseqasciiret(processed + (ch + 0), unprocessed.substring(1));
//
//        first.addAll(second);
//        first.addAll(third);
//
//        return first;
//    }

//    public static void subseqascii(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//
//        char ch = unprocessed.charAt(0);
//        subseqascii(processed + ch, unprocessed.substring(1));
//        subseqascii(processed, unprocessed.substring(1));
//        subseqascii(processed + (ch + 0), unprocessed.substring(1));
//    }

//    public static ArrayList<String> subseqret(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//
//            return list;
//        }
//
//        char ch = unprocessed.charAt(0);
//
//        ArrayList<String> left = subseqret(processed + ch, unprocessed.substring(1));
//        ArrayList<String> right = subseqret(processed, unprocessed.substring(1));
//
//        left.addAll(right);
//        return left;
//    }

//    public static void subseqence(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//
//        char ch = unprocessed.charAt(0);
//
//        subseqence(processed + ch, unprocessed.substring(1));
//        subseqence(processed, unprocessed.substring(1));
//    }

//    public static String skipappnotapple(String str) {
//        if (str.isEmpty()) {
//            return "";
//        }
//        String str1 = "app";
//        String str2 = "apple";
//        char ch = str.charAt(0);
//
//        if (str.startsWith(str1) && !(str.startsWith(str2))) {
//            return skipappnotapple(str.substring(str1.length()));
//        }
//        else {
//            return ch + skipappnotapple(str.substring(1));
//        }
//    }

//    public static String skiptheApple(String str) {
//        if (str.isEmpty()) {
//            return "";
//        }
//        String skipstr = "apple";
//        char ch = str.charAt(0);
//
//        if (str.startsWith(skipstr)) {
//            return skiptheApple(str.substring(skipstr.length()));
//        }
//        else {
//            return ch + skiptheApple(str.substring(1));
//        }
//    }

//    public static void skipapple(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//        String skipstr = "apple";
//        char ch = unprocessed.charAt(0);
//
//        if (unprocessed.startsWith(skipstr)) {
//            skipapple(processed, unprocessed.substring(skipstr.length()));
//        }
//        else {
//            skipapple(processed + ch, unprocessed.substring(1));
//        }
//    }

//    public static String skipch(String str) {
//        if (str.isEmpty()) {
//            return "";
//        }
//        char ch = str.charAt(0);
//
//        if (ch == 'a') {
//            return skipch(str.substring(1));
//        }
//        else {
//            return ch + skipch(str.substring(1));
//        }
//    }

//    public static void skipchar(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()){
//            System.out.println(processed);
//            return;
//        }
//        char ch = unprocessed.charAt(0);
//
//        if (ch == 'a') {
//            skipchar(processed, unprocessed.substring(1));
//        }
//        else {
//            skipchar(processed + ch, unprocessed.substring(1));
//        }
//    }
}
