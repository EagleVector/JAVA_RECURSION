package com.recusion;

import java.util.ArrayList;

public class MazeRecursion {
    public static void main(String[] args) {
//        System.out.println(mazeproblemcount(3,3));
//        mazeproblempath("", 3, 3);
//        System.out.println(mazeproblemlist("", 3, 3));
//        System.out.println(mazeproblemdiagonal("", 3, 3));
        System.out.println(pathrestrictions("", 0, 0));
    }

    public static ArrayList<String> pathrestrictions(String processed, int row, int col) {
        if (row == 2 && col == 2) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row < 3 && col < 3 && !(row == 1 && col == 1)) {
            list.addAll(pathrestrictions(processed + "DG", row + 1, col + 1));
        }

        if (row < 3 && !(row == 1 && col == 1)) {
            list.addAll(pathrestrictions(processed + "D", row + 1, col));
        }

        if (col < 3 && !(row == 1 && col == 1)) {
            list.addAll(pathrestrictions(processed + "R", row, col + 1));
        }

        return list;
    }

//    public static ArrayList<String> mazeproblemdiagonal(String processed, int row, int col) {
//        if (row == 1 && col == 1) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//
//        if (row > 1 && col > 1) {
//            list.addAll(mazeproblemdiagonal(processed + "DG", row - 1, col - 1));
//        }
//
//        if (row > 1) {
//            list.addAll(mazeproblemdiagonal(processed + "D", row - 1, col));
//        }
//
//        if (col > 1) {
//            list.addAll(mazeproblemdiagonal(processed + "R", row, col - 1));
//        }
//
//        return list;
//    }

//    public static ArrayList<String> mazeproblemlist(String processed, int row, int col) {
//        if (row == 1 && col == 1) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//
//            return list;
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//
//        if (row > 1) {
//            list.addAll(mazeproblemlist(processed + "D", row - 1, col));
//        }
//
//        if (col > 1) {
//            list.addAll(mazeproblemlist(processed + "R", row, col - 1));
//        }
//        return list;
//    }

//    public static void mazeproblempath(String processed, int row, int col) {
//        if (row == 1 && col == 1) {
//            System.out.println(processed);
//            return;
//        }
//
//        if (col > 1) {
//            mazeproblempath(processed + "R", row, col - 1);
//        }
//
//        if (row > 1) {
//            mazeproblempath(processed + "D", row - 1, col);
//        }
//    }

//    public static int mazeproblemcount(int row, int col) {
//        if (row == 1 || col == 1) {
//            return 1;
//        }
//
//        int left = mazeproblemcount(row - 1, col);
//        int right = mazeproblemcount(row, col - 1);
//        return left + right;
//    }
}
