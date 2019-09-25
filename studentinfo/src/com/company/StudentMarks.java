package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarks {
    int noOfStudents;
    Scanner sc = new Scanner(System.in);

    int[] stuGrades;

    //  Scanner sc= new Scanner(System.in);

        public void setNoOfStudents () {
            System.out.println("No. of Students");
            this.noOfStudents = sc.nextInt();
           // setStuGrades();
            stuGrades= new int[noOfStudents];
        }



    public void setStuGrades () {
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter mark for student no. " + i);
            int num = sc.nextInt();
            int x = 1;
           do {
    try {
       // num=sc.nextInt();
        if (num < 0 || num > 100) {

            throw new Exception("Not a  valid number, Enter again...");

        }
       // System.out.println("came here");
        x = 1;

        stuGrades[i] = num;
       // System.out.println("also came here");
    } catch (Exception e) {
        x = 2;

        System.out.println(e);
        num=sc.nextInt();
    }
}while (x==2);
        }
    }

    public void  getStuGrades() {
        System.out.println(Arrays.toString(stuGrades));
    }
}
