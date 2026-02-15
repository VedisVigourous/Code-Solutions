/* 
 * Day 3: Intro to Conditional Statements
 * Link: https://www.hackerrank.com/challenges/30-conditional-statements
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

// Solution: 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if (N%2 != 0) {
            System.out.println("Weird");
        }
        else if ((N%2==0) && (N>=2) && (N<=5)) {
            System.out.println("Not Weird");            
        }
        else if ((N%2==0) && (N>=6) && (N<=20)) {
        System.out.println("Weird");
        }
        else if ((N%2==0) && (N>20)) {
            System.out.println("Not Weird");
        }
    }
}



/* -- Explanation: read N and print "Weird" for odd values or for even values in [6, 20]; otherwise print "Not Weird".
   -- Logic used: check parity first, then apply the even-number ranges to decide the output. Used && operator to combine conditions for even numbers. And Modulo operator to check for odd/even. */

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */