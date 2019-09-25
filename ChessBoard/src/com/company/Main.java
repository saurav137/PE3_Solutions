package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> chess= new ArrayList<String>();
        for(int i=0;i<8;i++){
            String  ans="";
            for(int j=0;j<8;j++){
                if((i+j)%2==0)
                     ans+="WW|";
                else ans+="BB|";

            }
            chess.add(ans);
        }

        for(int i=0;i<8;i++){
            System.out.println(chess.get(i));
        }
    }
}
