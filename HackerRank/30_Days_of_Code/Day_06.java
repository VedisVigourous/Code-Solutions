/* 
 * Day 6: Let's Review
 * Link: https://www.hackerrank.com/challenges/30-review-loop
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

// Solution: 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int wordsCount = input.nextInt();
        
        for(int runCase = 1; runCase <= wordsCount ; runCase++){
            String word = input.next();
            
            for(int even = 0; even<(word.length()); even+=2){
                System.out.print(word.charAt(even));
            }            
            
            System.out.print(" ");
            
            for(int odd = 1; odd<(word.length()); odd+=2){
                System.out.print(word.charAt(odd));
            }   
            
            System.out.println();
        }
    }
}

// ================================================================================== //

/* -- Explanation: For each string input, print the characters at even indices followed by characters at odd indices.
   
   -- Logic used: Read number of strings. For each string, iterate through characters at even indices and print them first, then iterate through characters at odd indices and print them.
   
   -- Loop uses:
      1. First for loop (runCase): Iterates wordsCount times to process each test case/string input
         - Starts at 1 and goes up to wordsCount (inclusive)
      
      2. Second for loop (even): Extracts characters at even indices (0, 2, 4, ...)
         - Starts at index 0 and increments by 2 each iteration (even+=2)
         - Uses word.charAt(even) to retrieve and print each character
      
      3. Third for loop (odd): Extracts characters at odd indices (1, 3, 5, ...)
         - Starts at index 1 and increments by 2 each iteration (odd+=2)
         - Uses word.charAt(odd) to retrieve and print each character
*/

// =================================================================================== //

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */