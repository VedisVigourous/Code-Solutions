/* 
 * Day 5: Loops
 * Link: https://www.hackerrank.com/challenges/30-loops
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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for(int i = 1 ; i<=10 ; i++){
            System.out.printf("%d x %d = %d\n" , n , i , (n*i));
        }
    }
}




/* -- Explanation: Print the multiplication table for a given integer n from 1 to 10.
   -- Logic used: Read integer n from input. Use a for loop (i from 1 to 10) to calculate and print n × i in the format "n x i = result" using printf for formatted output. */

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */