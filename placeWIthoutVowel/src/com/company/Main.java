package com.company;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no. of places");
        int n=sc.nextInt();
        List<String > places=new ArrayList<String>();
        for(int i=0;i<n;i++){
          String place=sc.next();
          places.add(WithoutVowel(place));
        }
        for(int i=0;i<n;i++){
            System.out.println(places.get(i));
        }
    }
    public  static String  WithoutVowel(String place){
        StringBuilder sb =new StringBuilder();
        int sizeOfPlace=place.length();
        for(int i=0;i<sizeOfPlace;i++){
            char ch=place.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o' || ch=='u'){
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
