package com.recusion;

import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length];

//        allpath("", maze, 0, 0);
        matrixandpath("", maze, 0, 0, path, 1);
    }

    public static void matrixandpath(String processed, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int i = 0; i < path.length; i++) {
                int[] arr = path[i];
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            matrixandpath(processed + "D", maze, row + 1, col, path, step + 1);
        }

        if (col < maze[0].length - 1) {
            matrixandpath(processed + "R", maze, row, col + 1, path, step + 1);
        }

        if (row > 0) {
            matrixandpath(processed + "U", maze, row - 1, col, path, step + 1);
        }

        if (col > 0) {
            matrixandpath(processed + "L", maze, row, col - 1, path, step + 1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }

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
