/* Problem: Welcome to Java! 
   Link: https://www.hackerrank.com/challenges/java-end-of-file
   Difficulty: Easy 
   Language Used: Java8*/

// Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int lineCount = 1;
        
        while(input.hasNext()){
            String line = input.nextLine();
            System.out.println(lineCount + " " + line);
            lineCount++;
        }
    }
}

/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
