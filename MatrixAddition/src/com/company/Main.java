package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. matrix");
        int num = sc.nextInt();
        List<Matrix> matrices = new ArrayList<Matrix>();
        System.out.println("Enter no. of rows");
        int row = sc.nextInt();
        System.out.println("Enter no. of column");
        int col = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter values of matrix number:" + (i + 1));
            Matrix matrix = new Matrix();

            matrix.setRowAndColumn(row, col);
            matrix.setMatrix();
            matrices.add(matrix);
        }
        int[][] addedMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int add = 0;
                for (int k = 0; k < num; k++) {
                    add += matrices.get(k).matrix[i][j];
                }
                addedMatrix[i][j] = add;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) System.out.print(addedMatrix[i][j]+" ");
            System.out.println("");

            // write your code here
        }
    }
}
