package com.company;

import java.util.Scanner;

 class Main{
    int noOfStudents;
 // Scanner sc= new Scanner(System.in);

    Scanner sc= new Scanner(System.in);

    public void setNoOfStudents() {
       this.noOfStudents=sc.nextInt();
    }
    int[] stuGrades=new int[noOfStudents];

    public void setStuGrades() {
        for(int i=0;i<noOfStudents;i++){
            System.out.println("Enter mark for student no. "+ i+1);
            int num=sc.nextInt();
            int x=1;
            do{
            try {
                if (num < 0 || num > 100) {

                    throw new Exception("Not a  valid number, Enter again...");

                }
                x=1;
                stuGrades[i]=num;
            }
                catch(Exception e){
                   x=2;
                    System.out.println(e);
                }
            }while(x==2);
        }
    }

    public void getNoOfStudents() {
        for(int i=0;i<noOfStudents;i++) System.out.println(stuGrades[i]);
    }
}
