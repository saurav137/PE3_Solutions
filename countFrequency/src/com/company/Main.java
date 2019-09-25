package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here


        File file = new File("/home/cgi/IdeaProjects/PE3_SOLUTIONS/countFrequency/src/com/company/FileDemo.txt");
        BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        Map<String, Integer> map = new HashMap<>();
        while((line = reader.readLine())!=null){
            String[] words = line.split("\\s+");

            for (String w : words) {

                Integer n = map.get(w);
                n = (n == null) ? 1 : ++n;
                map.put(w, n);
            }
        }
        System.out.println(Arrays.asList(map));
    }
}
