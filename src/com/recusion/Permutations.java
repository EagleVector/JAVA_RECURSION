package com.recusion;

import java.util.ArrayList;
import java.util.Locale;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");

//        System.out.println(permutationList("", "abc"));

//        System.out.println(permutationcount("", "abc"));

//        phonepad("", "12");
//        System.out.println(phonepadlist("", "12"));
//        System.out.println(phonepadcount("", "15"));
//        diceproblem("", 4);
        System.out.println(dicelist("", 4));
    }

    public static ArrayList<String> dicelist(String processed, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dicelist(processed + i, target - i));
        }
        return list;
    }

//    public static void diceproblem(String processed, int target) {
//        if (target == 0) {
//            System.out.println(processed);
//            return;
//        }
//
//        for (int i = 1; i <= 6 && i <= target; i++) {
//            diceproblem(processed + i, target - i);
//        }
//    }

//    public static int phonepadcount(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            return 1;
//        }
//
//        int digit = unprocessed.charAt(0) + '0';
//        int count = 0;
//
//        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
//            char ch = (char) ('a' + i);
//
//            count = count + phonepadcount(processed + ch, unprocessed.substring(1));
//
//        }
//        return count;
//    }

//    public static ArrayList<String> phonepadlist(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//
//        int digit = unprocessed.charAt(0) - '0';
//        ArrayList<String> list = new ArrayList<>();
//
//        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
//
//            char ch = (char) ('a' + i);
//
//
//            list.addAll(phonepadlist(processed + ch, unprocessed.substring(1)));
//
//        }
//        return list;
//    }

//    static void phonepad(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//
//        int digit = unprocessed.charAt(0) - '0';
//
//        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
//
//            char ch = (char) ('a' + i);
//
//            phonepad(processed + ch, unprocessed.substring(1));
//        }
//    }

//    static void permutations(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//        char ch = unprocessed.charAt(0);
//
//        for (int i =0; i <= processed.length(); i++) {
//            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
//            permutations(first + ch + second, unprocessed.substring(1));
//        }
//    }
//    static ArrayList<String> permutationList(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//        char ch = unprocessed.charAt(0);
//
//        ArrayList<String> ans = new ArrayList<>();
//
//        for (int i = 0; i <= processed.length(); i++) {
//            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
//            ans.addAll(permutationList(first + ch + second, unprocessed.substring(1)));
//
//        }
//
//        return ans;
//    }

//    static int permutationcount(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            return 1;
//        }
//
//        char ch = unprocessed.charAt(0);
//        int count = 0;
//
//        for (int i = 0; i <= processed.length(); i++) {
//            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
//            count = count + permutationcount(first + ch + second, unprocessed.substring(1));
//        }
//        return count;
//    }

}
