package org.vijaykoshis.MatrixQuestions;

import java.util.Arrays;

public class PrintMatrix {

    public static void main(String[] args) {

        int mat[][] = {{1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}};
        print2DThroughLoop(mat);
        System.out.println("print diagonal::::::::::::::::");
        printdiagonal(mat);
    }

    private static void print2D(int[][] mat) {
        for (int p[] : mat) {
            System.out.println(Arrays.toString(p));

        }
    }

    private static void print2D2ndWay(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void print2DThroughLoop(int[][] mat) {
        for (int p[] : mat) {

            for (int x : p) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static void printdiagonal(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

    }

}
