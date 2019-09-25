

package com.company;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        String[] Input=input.split(" ");
        int arr[]=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=Integer.parseInt(Input[i]);
        }

        Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<6;i++){
            if(arr[i+1]-arr[i]==1)
                continue;
            else{
   flag=1;
   break;
            }
        }
        if(flag==1)
        {
            System.out.println(Arrays.toString(Input) + " is not a list of  Consecutive Number");
        }
        else{
            System.out.println(Arrays.toString(Input) + " is a list of Consecutive Number");
        }
    }


}
