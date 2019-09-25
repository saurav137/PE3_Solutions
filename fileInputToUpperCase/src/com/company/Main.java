package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        FileReader fr = null;
        try {
            fr = new FileReader("/home/cgi/IdeaProjects/PE3_SOLUTIONS/fileInputToUpperCase/src/com/company/Input.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        int ch;
        while((ch=fr.read())!=-1){
           char out= Character.toUpperCase((char)ch);
            System.out.print(out);
        }

    }
}
