package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>(list);
        File file = new File("hamlet.txt");
        FileInputStream f = new FileInputStream(file);
        Scanner scan = new Scanner(f);
        int countTotal = 0;
        while(scan.hasNext()){
            String check = scan.next();
            if(set.contains(check.toLowerCase()) == false){
                set.add(check.toLowerCase());
            }
            countTotal++;
        }
        int countNew = set.size();
        System.out.println("This is Total word count " + countTotal);
        System.out.println("This is Unique word count " + countNew);


        Scanner input = new Scanner (System.in);
        System.out.println("Write a word");
        String in = input.next();
        boolean appears = false;
            if(set.contains(in.toLowerCase())){
                appears = true;
        }
        System.out.println("Does the word appear in the text? " + appears);
    }
}
