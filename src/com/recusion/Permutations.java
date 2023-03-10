package com.recusion;

import java.util.ArrayList;
import java.util.Locale;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");

//        System.out.println(permutationList("", "abc"));

        System.out.println(permutationcount("", "abc"));

    }

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

    static int permutationcount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }

        char ch = unprocessed.charAt(0);
        int count = 0;

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + permutationcount(first + ch + second, unprocessed.substring(1));
        }
        return count;
    }

}
