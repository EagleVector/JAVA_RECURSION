package com.recusion;

import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
//        boolean[][] maze = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}
//        };
//
//        int[][] path = new int[maze.length][maze[0].length];
//
////        allpath("", maze, 0, 0);
//        matrixandpath("", maze, 0, 0, path, 1);

//        int n = 4;
//        boolean[][] chessboard = new boolean[n][n];
//        System.out.println(queens(chessboard, 0));

        int n = 4;
        boolean[][] chessboard = new boolean[n][n];
        knight(chessboard, 0, 0, 4);
    }

    public static void knight(boolean[][] chessboard, int row, int col, int knights) {
        if (knights == 0) {
            display(chessboard);
            System.out.println();
            return;
        }

        if (row == chessboard.length - 1 && col == chessboard.length - 1) {
            return;
        }

        if (col == chessboard.length) {
            knight(chessboard, row + 1, 0, knights);
            return;
        }

        if (safePos(chessboard, row, col)) {
            chessboard[row][col] = true;
            knight(chessboard, row, col + 1, knights - 1);
            chessboard[row][col] = false;
        }

        knight(chessboard, row, col + 1, knights);
    }

    public static boolean safePos(boolean[][] chessboard, int row, int col) {
        if (isValid(chessboard, row - 2, col - 1)) {
            if (chessboard[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(chessboard, row - 1, col - 2)) {
            if (chessboard[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(chessboard, row - 2, col + 1)) {
            if (chessboard[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(chessboard, row - 1, col + 2)) {
            if (chessboard[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    // Not to repeat
    public static boolean isValid(boolean[][] chessboard, int row, int col) {
        if (row >= 0 && row < chessboard.length && col >= 0 && col < chessboard.length) {
            return true;
        }
        return false;
    }

    public static void display(boolean[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            boolean[] row = chessboard[i];

            for (int j = 0; j < row.length; j++) {
                boolean element = row[j];

                if (element) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

//    public static int queens(boolean[][] chessboard, int row) {
//        if (row == chessboard.length) {
//            display(chessboard);
//            System.out.println();
//
//            return 1;
//        }
//
//        int count = 0;
//
//        // Place the queen and check for every row and column.
//        for (int col = 0; col < chessboard.length; col++) {
//            // Place the queen if it is safe.
//
//            if (isSafe(chessboard, row, col)) {
//                chessboard[row][col] = true;
//                count += queens(chessboard, row + 1);
//                chessboard[row][col] = false;
//            }
//        }
//        return count;
//    }
//
//    public static boolean isSafe(boolean[][] chessboard, int row, int col) {
//        // Check vertical row
//        for (int i = 0; i < row; i++) {
//            if (chessboard[i][col]) {
//                return false;
//            }
//        }
//
//        // Diagonal left
//        int maxLeft = Math.min(row, col);
//        for (int i = 1; i <= maxLeft; i++) {
//            if (chessboard[row-i][col-i]) {
//                return false;
//            }
//        }
//
//        // Diagonal right
//        int maxRight = Math.min(row, chessboard.length - col - 1);
//        for (int i = 1; i <= maxRight; i++) {
//            if (chessboard[row-i][col+i]) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void display(boolean[][] chessboard) {
//        for (int i = 0; i < chessboard.length; i++) {
//            boolean[] row = chessboard[i];
//
//            for (int j = 0; j < row.length; j++) {
//                boolean element = row[j];
//
//                if (element) {
//                    System.out.print("Q ");
//                }
//                else {
//                    System.out.print("X ");
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static void matrixandpath(String processed, boolean[][] maze, int row, int col, int[][] path, int step) {
//        if (row == maze.length - 1 && col == maze[0].length - 1) {
//            path[row][col] = step;
//            for (int i = 0; i < path.length; i++) {
//                int[] arr = path[i];
//                System.out.println(Arrays.toString(arr));
//            }
//            System.out.println(processed);
//            System.out.println();
//            return;
//        }
//
//        if (!maze[row][col]) {
//            return;
//        }
//
//        maze[row][col] = false;
//        path[row][col] = step;
//
//        if (row < maze.length - 1) {
//            matrixandpath(processed + "D", maze, row + 1, col, path, step + 1);
//        }
//
//        if (col < maze[0].length - 1) {
//            matrixandpath(processed + "R", maze, row, col + 1, path, step + 1);
//        }
//
//        if (row > 0) {
//            matrixandpath(processed + "U", maze, row - 1, col, path, step + 1);
//        }
//
//        if (col > 0) {
//            matrixandpath(processed + "L", maze, row, col - 1, path, step + 1);
//        }
//        maze[row][col] = true;
//        path[row][col] = 0;
//    }

//    public static void allpath(String processed, boolean[][] maze, int row, int col) {
//        if (row == maze.length - 1 && col == maze[0].length - 1) {
//            System.out.println(processed);
//            return;
//        }
//
//        // Here it checks whether there is block in the maze.
//        if (!maze[row][col]) {
//            return;
//        }
//
//        // Setting the path as false to back track.
//        maze[row][col] = false;   // make the change.
//
//        if (row < maze.length - 1) {
//            allpath(processed + "D", maze,row + 1, col);
//        }
//
//        if (col < maze[0].length - 1) {
//            allpath(processed + "R", maze, row, col + 1);
//        }
//
//        if (row > 0) {
//            allpath(processed + "U", maze, row - 1, col);
//        }
//
//        if (col > 0) {
//            allpath(processed + "L", maze, row, col - 1);
//        }
//
//        // This is the line where the function will be over.
//        // So before the function gets over and removed from stack, restore the changes that we made during the recursion calls.
//
//        maze[row][col] = true; // revert the change when the work is done.
//    }
}
