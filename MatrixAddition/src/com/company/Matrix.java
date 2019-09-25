package com.company;

import java.util.Scanner;

public class Matrix {
     private int row;
     private int column;
    int[][] matrix;
    Scanner sc=new Scanner(System.in);
    public void setRowAndColumn(int row,int column) {
        this.row = row;
        this.column=column;
        matrix=new int[row][column];
    }

    public void setMatrix() {
        for(int i=0; i<row;i++){
            for(int j=0;j<column;j++)matrix[i][j]=sc.nextInt();
        }
    }
}
