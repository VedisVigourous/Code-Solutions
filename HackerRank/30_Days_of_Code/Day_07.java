/* 
 * Day 7: Arrays
 * Link: https://www.hackerrank.com/challenges/30-arrays
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

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        // The Buffer reader used in HackerRank is already taking size and input of the array elements so no need to Create another array or loop to enter the elements just : Printing the reverse array
        
        for (int index = (n-1); index>=0 ; index--){
            System.out.print(arr.get(index) + " ");
        }
    }
}




// ================================================================================== //

/* -- Explanation: Read an array of integers and print the elements in reverse order.
   
   -- Logic used: 
      1. Read the size of the array (n)
      2. Read the array elements using Stream API and store them in a List
      3. Iterate through the list in reverse order and print each element
   
   -- Loop uses:
      1. For loop (index): Iterates from the last index (n-1) down to 0
         - Starts at (n-1) which is the last element
         - Decrements by 1 each iteration (index--)
         - Uses arr.get(index) to retrieve each element from the list in reverse order
         - Prints each element followed by a space
      
   -- Key Points:
      - BufferedReader is used to read input efficiently
      - Stream API is used to parse the input line and convert to Integer list
      - The loop prints elements from last to first, creating the reversed output
*/

// =================================================================================== //

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */