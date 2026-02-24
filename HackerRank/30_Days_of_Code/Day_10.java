/* 
 * Day 10: Binary Numbers
 * Link: https://www.hackerrank.com/challenges/30-binary-numbers
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
        
        //Converting First to Binary - used Integer's toStringBinary function
        
        String binConversion = Integer.toBinaryString(n);
        
        // Counting Consecutive One
        int currentCount = 0;
        int maxCount = 0;
        
        for (int i = 0 ; i< binConversion.length() ; i++) {   
            // To Reset counts to 0 on "Binary as 0"
            if(binConversion.charAt(i) == '0'){
                currentCount = 0;
            }
            
            // Increase counts if "Binary is 1"                     
            if(binConversion.charAt(i) == '1'){
                currentCount++;
            }
            
            // Checking the Max number of Consecutive 1 at last of each iteration
            if(currentCount>maxCount){
                maxCount = currentCount;
            }
        }
        
        System.out.println(maxCount);
    }
}


// ================================================================================== //

/* -- Explanation: Find the maximum number of consecutive 1's in the binary representation of an integer.
   
   -- Logic used: 
      1. Read an integer n from input
      2. Convert the integer to its binary string representation
      3. Iterate through the binary string to count consecutive 1's
      4. Track the maximum count of consecutive 1's and print it
   
   -- Algorithm breakdown:
      - Use Integer.toBinaryString(n) to convert decimal to binary string
      - Maintain two counters: currentCount (for current streak) and maxCount (for maximum streak)
      - For each character in the binary string:
        * If it's '0': reset currentCount to 0
        * If it's '1': increment currentCount
        * Check if currentCount > maxCount, update maxCount
      - Output the maxCount
      
   -- Example: n = 13
      - Binary representation: 1101
      - Iteration process:
        * Index 0: '1' → currentCount=1, maxCount=1
        * Index 1: '1' → currentCount=2, maxCount=2
        * Index 2: '0' → currentCount=0, maxCount=2
        * Index 3: '1' → currentCount=1, maxCount=2
      - Result: Maximum consecutive 1's = 2
      
   -- Key Points:
      - Integer.toBinaryString() converts decimal to binary string
      - charAt(i) accesses individual characters in the string
      - Reset currentCount when encountering '0' to start a new streak
      - Track maximum at each step to handle multiple streaks of 1's
*/

// =================================================================================== //

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */