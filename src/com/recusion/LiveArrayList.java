package com.recusion;

import java.util.ArrayList;
import java.util.Arrays;

public class LiveArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> slist = new ArrayList<>();
//
//        list.add(45);
//        list.add(78);
//
//        slist.add("Cherry");
//        slist.add(1, "Sunny");
//        slist.set(1, "Bunny"); // set is used for updation.
//
//        System.out.println(list);
//        System.out.println(slist);
//        list.add(34);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        System.out.println(slist.get(0));
//        list.remove(1);
//        System.out.println(list);
//        list.add(12);
//        list.add(32);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        int[] arr1 = {10, 19, 20, 30, 30, 40, 40, 50};
//        int[] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};
//
//        System.out.println(intersectionarray(arr1, arr2));

        int[] arr1 = {9, 9, 5, 8};
        int[] arr2 = {6, 7};

        System.out.println(additionarray(arr1, arr2));
    }

    public static ArrayList<Integer> additionarray(int[] arr1, int[] arr2) {

        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        while (i >= 0 || j >=0) {

            int sum = carry;

            if (i >= 0) {
                sum = sum + arr1[i];
            }

            if (j >= 0) {
                sum = sum + arr2[j];
            }

            int rem = sum % 10;
            carry = sum / 10;

            ans.add(0, rem);

            i--;
            j--;
        }
        if (carry != 0) {
            ans.add(0, carry);
        }
        return ans;
    }

//    public static ArrayList<Integer> intersectionarray(int[] arr1, int[] arr2) {
//
//        ArrayList<Integer> ans = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//
//        while(i < arr1.length && j < arr2.length) {
//
//            if (arr1[i] > arr2[j]) {
//                j++;
//            }
//            else if (arr1[i] < arr2[j]) {
//                i++;
//            }
//            else {
//                ans.add(arr1[i]);
//                i++;
//                j++;
//            }
//        }
//        return ans;
//    }
}
