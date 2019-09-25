package com.company;

import java.io.File;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("/home/cgi/Downloads");
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".pdf")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}
