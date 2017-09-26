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
        int count2 = 0;
        boolean appears = false;
        while(scan.hasNext(in)){
            if(set.contains(in.toLowerCase())){
                count2++;
                appears = true;
            }
        }
        System.out.println("Does the word appear in the text? " + appears);
        System.out.println("How many of the word appears in the text? " + count2);
    }
}
